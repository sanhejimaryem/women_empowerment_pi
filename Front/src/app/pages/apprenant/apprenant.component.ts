import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { training } from 'src/app/Model/training';
import { TrainingService } from 'src/app/shared/training.service';

@Component({
  selector: 'app-apprenant',
  templateUrl: './apprenant.component.html',
  styleUrls: ['./apprenant.component.scss']
})
export class ApprenantComponent implements OnInit {
  listTraining : training[];
  
  training : training[];
  constructor( private _service:TrainingService , private router: Router ) { }

  ngOnInit(): void {
    this._service.getAlltraining().subscribe(res=>{
      this.listTraining=res
      console.log(this.listTraining);
    });
  }
  TrainingDetails(id: number) {
    this.router.navigate(['details', id]);
  }

}
