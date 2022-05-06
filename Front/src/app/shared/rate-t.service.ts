import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RateT } from '../Model/rateT';

@Injectable({
  providedIn: 'root'
})
export class RateTService {
  RateUrl="http://localhost:9090/Eve/eve/getAllQuizRepJPQL";
  

  constructor(private _http:HttpClient) { }
  getAllRate() : Observable<RateT[]> {
    return this._http.get<RateT[]>(this.RateUrl);
  }
  deleteRateById(IdRate:number){ 
    return this._http.delete("http://localhost:9090/Eve/eve/DeleteRep/"+IdRate); 
    }
    addRate(rateT : RateT){ 
      return this._http.post<RateT>("http://localhost:9090/Eve/eve/addRate",RateT); 
      }
}
