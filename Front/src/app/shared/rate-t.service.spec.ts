import { TestBed } from '@angular/core/testing';

import { RateTService } from './rate-t.service';

describe('RateTService', () => {
  let service: RateTService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RateTService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
