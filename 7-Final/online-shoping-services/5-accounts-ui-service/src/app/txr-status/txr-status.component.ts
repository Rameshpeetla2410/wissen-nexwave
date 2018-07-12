import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-txr-status',
  templateUrl: './txr-status.component.html',
  styleUrls: ['./txr-status.component.css']
})
export class TxrStatusComponent implements OnInit {

  @Input() status;
  
  constructor() { }

  ngOnInit() {
  }

}
