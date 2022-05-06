import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Quiz } from 'src/app/Model/Quiz';
import { QuizService } from 'src/app/shared/quiz.service';
@Component({
  selector: 'app-add-quiz',
  templateUrl: './add-quiz.component.html',
  styleUrls: ['./add-quiz.component.scss']
})
export class AddQuizComponent implements OnInit {
  Quiz : Quiz= new Quiz;
  constructor(private _router:Router, private Qs : QuizService) { }
  addQuiz(){ 
    this.Qs.addQuiz(this.Quiz).subscribe(()=>this._router.navigateByUrl("/home/listQuiz")); 
    } 

  ngOnInit(): void {
  }

}
