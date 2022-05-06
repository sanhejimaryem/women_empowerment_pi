import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { commentT } from '../Model/commentT';
import { training } from '../Model/training';

@Injectable({
  providedIn: 'root'
})
export class CommentTService {
  CmtUrl="http://localhost:9090/Eve/eve/get-all-cmt";
  commentT : commentT[];
training : training [];
  constructor(private _http:HttpClient) { }
  getAllcmt() : Observable<commentT[]> {
    return this._http.get<commentT[]>(this.CmtUrl);
  }
  deleteCmtById(idcmt:number){ 
    return this._http.delete("http://localhost:9090/Eve/eve/deletecmt/"+idcmt); 
    }
    addComment(idTraining : number , id_member : number){ 
      return this._http.post<commentT>("http://localhost:9090/Eve/eve/add-cmt/"+idTraining , id_member); 
      }
      getCommentById(idcmt:number){
        return this._http.put<commentT>("http://localhost:9090/Eve/eve/update-training",idcmt); 
        
      }
      findcmtrbyTraining(idTraining :number ): Observable<commentT[]>{
        return this._http.get<commentT[]>("http://localhost:9090/Eve/eve/getquizId/"+idTraining);
      }
      
}  
