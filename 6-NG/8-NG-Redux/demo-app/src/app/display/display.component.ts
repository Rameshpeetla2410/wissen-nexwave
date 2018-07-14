import { Component, OnInit, Input } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  value = 0;
  counter: Observable<any>;

  constructor(private store: Store<any>) {
    this.value = store.select('counter');
  }

  ngOnInit() {
  }

}
