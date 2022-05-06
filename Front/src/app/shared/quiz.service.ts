import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Quiz } from '../Model/Quiz';

@Injectable({
  providedIn: 'root'
})
export class QuizService {
  QuizUrl="http://localhost:9090/Eve/eve/get-Quiz";
  

  constructor(private _http:HttpClient) { }
  getAllQuiz() : Observable<Quiz[]> {
    return this._http.get<Quiz[]>(this.QuizUrl);
  }
  deleteQuizById(IdQuiz:number){ 
    return this._http.delete("http://localhost:9090/Eve/eve/delete-quiz/"+IdQuiz); 
    }
    addQuiz(Quiz : Quiz){ 
      return this._http.post<Quiz>("http://localhost:9090/Eve/eve/add-quiz",Quiz); 
      }
      
      getQuizByIdTraining(idTraining :number ): Observable<Quiz[]>{
        return this._http.get<Quiz[]>("http://localhost:9090/Eve/eve/get-training/"+idTraining);
      }
}
