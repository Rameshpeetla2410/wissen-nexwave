import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ProductsService } from '../products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;

  constructor(
              private fb: FormBuilder, 
              private productsService: ProductsService,
              private router:Router
            ) { }

  ngOnInit() {
    this.productForm = this.fb.group({
      name: [''],
      price: [''],
      makeDate: [''],
      description: []
    });
  }

  handleSubmit(e) {
    e.preventDefault();
    this.productsService.save(this.productForm.value)
      .subscribe(product => {
        this.router.navigate(['products'])
      });
  }

}
