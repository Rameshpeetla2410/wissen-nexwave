import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  @Input() message;
  now;
  interval;

  constructor() {
    console.log('GreetingComponent::constructor()');
  }

  ngOnChanges() {
    console.log('GreetingComponent::ngOnChanges()');
  }

  ngOnInit() {
    console.log('GreetingComponent::ngOnInit()');
    this.interval = setInterval(() => {
      console.log('changing time');
      this.now = new Date().toLocaleTimeString();
    }, 500)
  }

  ngDoCheck() {
    console.log('GreetingComponent::ngDoCheck()');
  }

  ngOnDestroy() {
    console.log('GreetingComponent::ngOnDestroy()');
    clearInterval(this.interval);
  }
}
