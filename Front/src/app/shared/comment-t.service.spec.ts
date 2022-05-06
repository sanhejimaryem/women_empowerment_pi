import { TestBed } from '@angular/core/testing';

import { CommentTService } from './comment-t.service';

describe('CommentTService', () => {
  let service: CommentTService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CommentTService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
