import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  totalCount: number = 100;

  nums: Array<number> = [1, -1, 5, -5, 10, -10, 100, -100, 1000, -1000]

  incrementTotalCount(event) {
    this.totalCount += event.value;
  }
}
