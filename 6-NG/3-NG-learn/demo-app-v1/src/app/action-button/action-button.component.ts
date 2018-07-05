import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-action-button',
  templateUrl: './action-button.component.html',
  styleUrls: ['./action-button.component.css']
})
export class ActionButtonComponent implements OnInit {

  @Input() value: string = "click-me";
  count: number = 0;
  @Output() action = new EventEmitter();


  constructor() { }

  ngOnInit() {
  }

  handleBtnClick() {
    this.count++;
    this.action.emit({ value: Number.parseInt(this.value) * this.count });
  }

}
