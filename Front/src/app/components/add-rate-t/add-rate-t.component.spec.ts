import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRateTComponent } from './add-rate-t.component';

describe('AddRateTComponent', () => {
  let component: AddRateTComponent;
  let fixture: ComponentFixture<AddRateTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRateTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddRateTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
