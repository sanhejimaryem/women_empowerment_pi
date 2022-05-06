import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Quiz } from 'src/app/Model/Quiz';
import { QuizService } from 'src/app/shared/quiz.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.scss']
})
export class QuizComponent implements OnInit {
  Quiz : Quiz[];
  listQuiz : Quiz[];
  @Output() emitStateq = new EventEmitter<boolean>();
  showAddq : boolean;

  constructor(private _service:QuizService) { }


  ngOnInit(): void {
    this._service.getAllQuiz().subscribe(res=>{
      this.listQuiz=res
      console.log(this.listQuiz);

      });
      this.showAddq= false ;
     }
     deleteQuiz(IdQuiz:number){ 
      this._service.deleteQuizById(IdQuiz).subscribe(()=>this._service.getAllQuiz().subscribe(res=>{this.listQuiz=res})); }

      onAddq(){
        this.showAddq=true;
        this.emitStateq.emit(this.showAddq);
      }
}
