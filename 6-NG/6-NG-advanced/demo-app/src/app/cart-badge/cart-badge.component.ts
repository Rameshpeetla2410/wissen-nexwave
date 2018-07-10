import { Component, OnInit, Input, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CartBadgeComponent implements OnInit {

  @Input() cartStream: Observable<any>;


  count: number = 0;

  constructor(private cd: ChangeDetectorRef) { }

  ngOnInit() {
    this.cd.detach();
    this.cartStream.subscribe(() => {
      this.count++;
      this.cd.markForCheck();
      this.cd.reattach();
    })
  }

}
