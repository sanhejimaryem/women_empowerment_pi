import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { QuizRep } from 'src/app/Model/QuizRep';
import { QuizRepService } from 'src/app/shared/quiz-rep.service';

@Component({
  selector: 'app-quizrep',
  templateUrl: './quizrep.component.html',
  styleUrls: ['./quizrep.component.scss']
})
export class QuizrepComponent implements OnInit {
  listQuizRep : QuizRep[];
  @Output() emitStateR = new EventEmitter<boolean>();
  showAddR : boolean;
  constructor(private _service:QuizRepService) { }

  ngOnInit(): void {
    
    this._service.getAllQuizRep().subscribe(res=>{console.log(res);

    this.listQuizRep=res
    console.log(this.listQuizRep);
  });
    this.showAddR= false ;
   }
   deleteQuizRep(IdQuizRep:number){ 
    this._service.deleteQuizRepById(IdQuizRep).subscribe(()=>this._service.getAllQuizRep().subscribe(res=>{this.listQuizRep=res})); }

    onAddr(){
      this.showAddR = true;
      this.emitStateR.emit(this.showAddR);
    }
}
