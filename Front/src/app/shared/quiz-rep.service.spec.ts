import { TestBed } from '@angular/core/testing';

import { QuizRepService } from './quiz-rep.service';

describe('QuizRepService', () => {
  let service: QuizRepService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QuizRepService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
