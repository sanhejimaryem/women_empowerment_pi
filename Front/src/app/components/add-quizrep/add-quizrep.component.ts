import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuizRep } from 'src/app/Model/QuizRep';
import { QuizRepService } from 'src/app/shared/quiz-rep.service';

@Component({
  selector: 'app-add-quizrep',
  templateUrl: './add-quizrep.component.html',
  styleUrls: ['./add-quizrep.component.scss']
})
export class AddQuizrepComponent implements OnInit {
  QuizRep: QuizRep = new QuizRep ;

  constructor(private _router:Router, private Qrs : QuizRepService) { }

  addQuizRep(){ 
    this.Qrs.addQuizRep(this.QuizRep).subscribe(()=>this._router.navigateByUrl("/home/listQuizRep")); 
    } 
  ngOnInit(): void {
  }

}
