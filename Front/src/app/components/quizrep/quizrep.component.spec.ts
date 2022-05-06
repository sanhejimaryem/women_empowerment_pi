import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuizrepComponent } from './quizrep.component';

describe('QuizrepComponent', () => {
  let component: QuizrepComponent;
  let fixture: ComponentFixture<QuizrepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuizrepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizrepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
