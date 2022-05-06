import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RateTComponent } from './rate-t.component';

describe('RateTComponent', () => {
  let component: RateTComponent;
  let fixture: ComponentFixture<RateTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RateTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RateTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
