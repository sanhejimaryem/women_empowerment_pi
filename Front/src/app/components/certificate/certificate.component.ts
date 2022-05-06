import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Certificate } from 'src/app/Model/certificate';
import { CertifService } from 'src/app/shared/certif.service';

@Component({
  selector: 'app-certificate',
  templateUrl: './certificate.component.html',
  styleUrls: ['./certificate.component.scss']
})
export class CertificateComponent implements OnInit {
  listCert : Certificate[];
  showAddC : boolean ;
  @Output() emitStateC = new EventEmitter<Boolean>();
  constructor(private _service:CertifService) { }

  ngOnInit(): void {
    this._service.getAllCert().subscribe(res=>{console.log(res);

      this.listCert=res});
      this.showAddC = false;
     }
     deleteCertification(idCert:number){ 
      this._service.deleteCertById(idCert).subscribe(()=>this._service.getAllCert().subscribe(res=>{this.listCert=res})); }

      onAddc(){
        this.showAddC = true;
        this.emitStateC.emit(this.showAddC);
      }
}
