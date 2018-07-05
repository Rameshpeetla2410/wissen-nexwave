import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  @Input() idx: number = 0;
  @Input() product: any;
  currentTab: number = 1;

  constructor() { }

  ngOnInit() {
  }

  changeTab(event, tabIdx) {
    this.currentTab = tabIdx;
  }
  isTabSelected(tabIdx) {
    return this.currentTab === tabIdx;
  }

}
