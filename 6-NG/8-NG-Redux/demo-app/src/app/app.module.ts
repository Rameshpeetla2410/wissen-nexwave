import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NumberButtonComponent } from './number-button/number-button.component';
import { DisplayComponent } from './display/display.component';

import { StoreModule } from '@ngrx/store';
import { counterReducer } from './counter';

@NgModule({
  declarations: [
    AppComponent,
    NumberButtonComponent,
    DisplayComponent
  ],
  imports: [
    BrowserModule,
    StoreModule.provideStore({ counter: counterReducer })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
