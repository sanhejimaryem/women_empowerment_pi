import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Certificate } from 'src/app/Model/certificate';
import { CertifService } from 'src/app/shared/certif.service';

@Component({
  selector: 'app-add-cert',
  templateUrl: './add-cert.component.html',
  styleUrls: ['./add-cert.component.scss']
})
export class AddCertComponent implements OnInit {
  Certificate : Certificate= new Certificate;
  constructor(private _router:Router, private Cs : CertifService) { }
  addCert(){ 
    this.Cs.addCert(this.Certificate).subscribe(()=>this._router.navigateByUrl("/home/listCert")); 
    } 
  ngOnInit(): void {
  }

}
