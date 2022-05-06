import { Component, OnInit } from '@angular/core';
import { training } from 'src/app/Model/training';
import { TrainingService } from 'src/app/shared/training.service';
import { TrainingComponent } from 'src/app/components/training/training.component';
import { Router, Routes } from '@angular/router';
declare const google: any;

// const routes: Routes [] = [
//   { path: 'training',  Component: TrainingComponent},
//   { path: 'addTraining',  Component: AddTrainingComponent},
//   { path: 'quiz',  Component: QuizComponent}
// ]
@Component({
  selector: 'app-maps',
  templateUrl: './maps.component.html',
  styleUrls: ['./maps.component.scss']
})
export class MapsComponent implements OnInit {
  listTraining : training[];
  training : training;
  constructor(private _service:TrainingService) { }

  ngOnInit() {
    
    this._service.getAlltraining().subscribe(res=>{
      this.listTraining=res
      console.log(this.listTraining);
    });
  }

}
