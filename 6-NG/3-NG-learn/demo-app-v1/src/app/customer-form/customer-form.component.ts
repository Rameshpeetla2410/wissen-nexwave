import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

import { myRangeValidator, emailCompare } from './custom-validators';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  customerForm: FormGroup;

  constructor(private fb: FormBuilder) { }

  errorMessage: string = '';

  ngOnInit() {

    // this.customerForm = new FormGroup({
    //   firstName: new FormControl(''),
    //   lastName: new FormControl(''),
    //   email: new FormControl(''),
    // });

    // this.customerForm = this.fb.group({
    //   firstName: '',
    //   lastName: '',
    //   email: ''
    // });


    // this.customerForm = this.fb.group({
    //   firstName: {value:'Nag',disabled:'true'},
    //   lastName: '',
    //   email: ''
    // });


    // this.customerForm = this.fb.group({
    //   firstName: [{value:'Nag',disabled:'true'}],
    //   lastName: [''],
    //   email: ['']
    // });

    this.customerForm = this.fb.group({
      firstName: ['', [Validators.required,Validators.minLength(3)]],
      lastName: ['', [Validators.required, Validators.minLength(3)]],
      emailGroup: this.fb.group({
        email: ['', [Validators.required, Validators.email]],
        cemail: ['', [Validators.required, Validators.email]],
      }, { validator: emailCompare }),
      mobile: [''],
      notification: ['email'],
      range: ['', [myRangeValidator(1000, 2000)]]
    });


    this.customerForm.get('firstName').valueChanges
    .subscribe(e => {
      if (e !== "Nag") { this.errorMessage = ""; return };
      this.errorMessage = "Name is already taken"
    })

    this.customerForm.get('firstName').statusChanges
    .subscribe(e=>{
      console.log(e)
    })

  }

  changeNotification(mode) {
    let mobileFormControl = this.customerForm.get('mobile');
    if (mode === "sms") {
      mobileFormControl.setValidators([Validators.required])
    } else {
      mobileFormControl.clearValidators()
    }
    mobileFormControl.updateValueAndValidity();
  }

  loadCustomer() {
    let customer = { firstName: 'Nag', lastName: 'N' }
    // this.customerForm.setValue(customer);
    this.customerForm.patchValue(customer);
  }

}
