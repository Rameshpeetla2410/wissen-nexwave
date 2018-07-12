import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TxrStatusComponent } from './txr-status.component';

describe('TxrStatusComponent', () => {
  let component: TxrStatusComponent;
  let fixture: ComponentFixture<TxrStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TxrStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TxrStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
