import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentTComponent } from './comment-t.component';

describe('CommentTComponent', () => {
  let component: CommentTComponent;
  let fixture: ComponentFixture<CommentTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CommentTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
