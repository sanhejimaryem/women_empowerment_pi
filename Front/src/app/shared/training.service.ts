import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { training } from '../Model/training';

@Injectable({
  providedIn: 'root'
})
export class TrainingService {trainingUrl="http://localhost:9090/Eve/eve/get-all-training";
constructor(private _http:HttpClient) { }
getAlltraining() : Observable<training[]> {
  return this._http.get<training[]>(this.trainingUrl);
}
deleteTrainingById(idTraining:number){ 
  return this._http.delete("http://localhost:9090/Eve/eve/remove-training/"+idTraining); 
  }
  addTraining(training: training){ 
    return this._http.post<training>("http://localhost:9090/Eve/eve/add-training",training); 
    }
    getAlltrainingsByDomaine(domaine:string) : Observable<training[]> {
      return this._http.get<training[]>("http://localhost:9090/Eve/eve/find-Domaine"+domaine);
      }
      getTrainingById(idTraining :number ): Observable<training[]>{
        return this._http.get<training[]>("http://localhost:9090/Eve/eve/get-training"+idTraining);
      }
      updateTraining(training: training){ 
        return this._http.put<training>("http://localhost:9090/Eve/eve/update-training",training); 
        }
}
