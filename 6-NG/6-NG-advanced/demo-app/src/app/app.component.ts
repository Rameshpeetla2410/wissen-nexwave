import { Component, NgZone } from '@angular/core';
import { Observable,Subject } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  message: string = "greetings";

  progress1: number = 0; // data
  progress2: number = 0; // data

  product: any = {
    name: 'Laptop',
    price: 1000.00
  }

  cartStream: Subject<any> = new Subject();

  constructor(private zone: NgZone) { }


  applyDiscount(amount) {
    //this.product.price -= amount; // mutable
    this.product = Object.assign({}, this.product, { price: this.product.price - amount })// immutable
  }

  greet(newMessage) {
    this.message = newMessage;
  }

  processOutsideAngularZone() {
    this.progress2 = 0;
    this.zone.runOutsideAngular(() => {
      this.increaseProgress2(() => {
        this.zone.run(() => {
          console.log('Outside Done!');
        })
      });
    });
  }

  increaseProgress2(doneCallback: () => void) {
    this.progress2 += 1;
    console.log(`Current progress: ${this.progress2}%`);
    if (this.progress2 % 10 === 0) {
      this.zone.run(() => { console.log('10%') })
    }
    if (this.progress2 < 100) {
      window.setTimeout(() => {
        this.increaseProgress2(doneCallback);
      }, 100);
    } else {
      doneCallback();
    }
  }

  processWithinAngularZone() {
    this.progress1 = 0;
    this.increaseProgress1(() => console.log('Done!'));
  }



  increaseProgress1(doneCallback: () => void) {
    this.progress1 += 1;
    console.log(`Current progress: ${this.progress1}%`);
    if (this.progress1 < 100) {
      window.setTimeout(() => {
        this.increaseProgress1(doneCallback);
      }, 100);
    } else {
      doneCallback();
    }
  }


}
