import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

import { Store } from '@ngrx/store';
import { INCREMENT, DECREMENT, RESET } from '../counter';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-number-button',
  templateUrl: './number-button.component.html',
  styleUrls: ['./number-button.component.css']
})
export class NumberButtonComponent implements OnInit {

  @Input() num: number;

  constructor(private store: Store<any>) { }

  ngOnInit() {
  }

  handle() {
    //this.hit.emit({ value: Number.parseInt(this.number) })
    if (this.num > 0)
      this.store.dispatch({ type: INCREMENT });
    if (this.num < 0)
      this.store.dispatch({ type: DECREMENT });

  }

}
