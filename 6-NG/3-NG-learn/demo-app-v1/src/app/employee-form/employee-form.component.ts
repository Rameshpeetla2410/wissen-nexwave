import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent implements OnInit {

  employee: any;  // data model

  constructor() { }

  ngOnInit() {
    this.employee = { firstName: '', lastName: '' }
  }

  handleFormSubmit(e, employeeForm) {
    e.preventDefault();
    if (employeeForm.valid) {
      console.log(employeeForm.value)
    }
  }

  loadEmployee() {
    this.employee = { firstName: 'Kishore', lastName: 'Kumar' }
  }

}
