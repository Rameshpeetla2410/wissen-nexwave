import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'shop-IT';
  currentTab: number = 1;
  products: Array<any> = [
    {
      id: 111,
      name: 'Laptop',
      price: 245000,
      description: 'New Mac pro',
      canBuy: true,
      image: 'images/Laptop.png'
    },
    {
      id: 222,
      name: 'phone-7',
      price: 47000,
      description: 'New  pro',
      canBuy: true,
      image: 'images/Mobile.png'
    }
  ]

  changeTab(event, tabIdx) {
    this.currentTab = tabIdx;
  }
  isTabSelected(tabIdx) {
    return this.currentTab === tabIdx;
  }

}
