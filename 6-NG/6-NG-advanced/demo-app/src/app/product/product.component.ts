import { Component, OnInit, Input, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
  //changeDetection: ChangeDetectionStrategy.Default
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProductComponent implements OnInit {


  @Input() product;
  @Input() cartStream;

  constructor() { }

  ngOnInit() {
  }

  handleBuy() {
    this.cartStream.next('New Item')
  }

}
