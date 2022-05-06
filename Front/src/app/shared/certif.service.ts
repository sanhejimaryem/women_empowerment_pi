import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Certificate } from '../Model/certificate';

@Injectable({
  providedIn: 'root'
})
export class CertifService {
  CertificateUrl="http://localhost:9090/Eve/eve/get-all-Cert";
  constructor(private _http:HttpClient) { }
  getAllCert() : Observable<Certificate[]> {
    return this._http.get<Certificate[]>(this.CertificateUrl);
  }
  deleteCertById(IdCert:number){ 
    return this._http.delete("http://localhost:9090/Eve/eve/delete-cert/"+IdCert); 
    }
    addCert(certificate: Certificate){ 
      return this._http.post<Certificate>("http://localhost:9090/Eve/eve/add-cert",Certificate); 
      }
}
