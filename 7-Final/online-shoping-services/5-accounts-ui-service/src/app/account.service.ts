import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private http: HttpClient) { }

  loadBeneficiaries() {
    let url = "http://localhost:8282/api/accounts/1/beneficiaries"
    return this.http.get(url)
  }

  doTxr(txrFormData) {
    let url = "http://localhost:8282/api/txr";
    return this.http.post(url, txrFormData)
  }

  getTxns(count) {
    let url = `http://localhost:8282/api/txns?size=${count}`;
    return this.http.get(url)
  }

}
