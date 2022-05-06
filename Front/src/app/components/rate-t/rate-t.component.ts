import { Component, OnInit } from '@angular/core';
import { RateT } from 'src/app/Model/rateT';
import { RateTService } from 'src/app/shared/rate-t.service';

@Component({
  selector: 'app-rate-t',
  templateUrl: './rate-t.component.html',
  styleUrls: ['./rate-t.component.scss']
})
export class RateTComponent implements OnInit {
  listRate : RateT[];
  constructor(private _service:RateTService) { }

  ngOnInit(): void {
    this._service.getAllRate().subscribe(res=>{
      this.listRate=res
      console.log(this.listRate);
      });
     }
     deleteRate(IdRate:number){ 
      this._service.deleteRateById(IdRate).subscribe(()=>this._service.getAllRate().subscribe(res=>{this.listRate=res})); }



}
