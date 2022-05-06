import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { QuizRep } from '../Model/QuizRep';

@Injectable({
  providedIn: 'root'
})
export class QuizRepService {
  QuizRepUrl="http://localhost:9090/Eve/eve/getAllQuizRepJPQL";
  constructor(private _http:HttpClient) { }
  getAllQuizRep() : Observable<QuizRep[]> {
    return this._http.get<QuizRep[]>(this.QuizRepUrl);
  }
  deleteQuizRepById(IdQuizRep:number){ 
    return this._http.delete("http://localhost:9090/Eve/eve/DeleteRep/"+IdQuizRep); 
    }
    addQuizRep(quizrep: QuizRep){ 
      return this._http.post<QuizRep>("http://localhost:9090/Eve/eve/addQuest",QuizRep); 
      }
      
}
