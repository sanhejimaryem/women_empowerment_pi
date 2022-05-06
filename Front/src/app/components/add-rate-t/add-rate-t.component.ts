import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RateT } from 'src/app/Model/rateT';
import { RateTService } from 'src/app/shared/rate-t.service';
@Component({
  selector: 'app-add-rate-t',
  templateUrl: './add-rate-t.component.html',
  styleUrls: ['./add-rate-t.component.scss']
})
export class AddRateTComponent implements OnInit {

  rateT : RateT= new RateT;
  constructor(private _router:Router, private Rs : RateTService) { }
  addRate(){ 
    this.Rs.addRate(this.rateT).subscribe(()=>this._router.navigateByUrl("/home/listRate")); 
    } 

  ngOnInit(): void {
  }

}
