import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  totalCount = 100;
  incrementTotalCount(e) {
    this.totalCount += e.value;
  }
}
