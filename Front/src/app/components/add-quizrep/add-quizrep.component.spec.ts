import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddQuizrepComponent } from './add-quizrep.component';

describe('AddQuizrepComponent', () => {
  let component: AddQuizrepComponent;
  let fixture: ComponentFixture<AddQuizrepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddQuizrepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddQuizrepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
