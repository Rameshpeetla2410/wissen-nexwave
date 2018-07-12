import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-txr-form',
  templateUrl: './txr-form.component.html',
  styleUrls: ['./txr-form.component.css']
})
export class TxrFormComponent implements OnInit {

  private txrForm: FormGroup;
  private beneficiaries: any = [];
  private status = null;

  constructor(private fb: FormBuilder, private accountService: AccountService) { }

  ngOnInit() {
    this.status = null;
    this.txrForm = this.fb.group({
      fromAccNum: ['1'],
      toAccNum: [''],
      amount: ['', [Validators.required]]
    })
    this.accountService.loadBeneficiaries()
      .subscribe(response => {
        let result: any = response;
        result.forEach((acc) => {
          this.beneficiaries.push({ label: acc, value: acc })
        })
      })
  }

  handleSubmit(event) {
    if (this.txrForm.valid) {
      let txrFormData = this.txrForm.value;
      this.accountService.doTxr(txrFormData)
        .subscribe(response => {
          this.status = response;
        })
    }
  }

}
