import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { TxrFormComponent } from './txr-form/txr-form.component';

import {DropdownModule} from 'primeng/dropdown';
import {TableModule} from 'primeng/table';
import {CalendarModule} from 'primeng/calendar';

import { TxrStatusComponent } from './txr-status/txr-status.component';
import { AccountSummaryComponent } from './account-summary/account-summary.component';

const routes: Routes = [
  { path: 'txr', component: TxrFormComponent },
  { path: 'summary', component: AccountSummaryComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    TxrFormComponent,
    TxrStatusComponent,
    AccountSummaryComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    DropdownModule,
    TableModule,
    CalendarModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
