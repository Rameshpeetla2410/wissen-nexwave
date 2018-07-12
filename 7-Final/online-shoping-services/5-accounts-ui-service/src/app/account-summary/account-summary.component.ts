import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-account-summary',
  templateUrl: './account-summary.component.html',
  styleUrls: ['./account-summary.component.css']
})
export class AccountSummaryComponent implements OnInit {

  constructor(private accountService: AccountService) { }

  txns: any = [];

  ngOnInit() {
  }

  getTopTxns(count) {
    this.accountService.getTxns(count)
      .subscribe(response => {
        this.txns = response;
      });
  }

}
