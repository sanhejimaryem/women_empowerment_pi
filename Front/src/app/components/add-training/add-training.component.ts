import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { training } from 'src/app/Model/training';
import { TrainingService } from 'src/app/shared/training.service';

@Component({
  selector: 'app-add-training',
  templateUrl: './add-training.component.html',
  styleUrls: ['./add-training.component.scss']
})
export class AddTrainingComponent implements OnInit {
  @Input() training : training = new training;
  @Input() status : string;
  @Output() changeTrainingEvent =  new EventEmitter<training>();
  constructor(private _router:Router, private Ts : TrainingService, private toastr : ToastrService) { }

  addTraining(){ 
    this.Ts.addTraining(this.training).subscribe({
      next: (res : training) => {
        this.toastr.success('Training has been added successfully!', this.status)
        this.changeTrainingEvent.emit(res)
      },
      error: () =>  this.toastr.error('Training has been not added!', this.status)
    }); 
  } 

  ngOnInit(): void { }

  updateTraining(){
    this.Ts.updateTraining(this.training).subscribe({
      next: () => {
        this.training = new training
        this.changeTrainingEvent.emit()
        this.toastr.success('Training has been updated successfully!', this.status)
      },
      error : () => this.toastr.error('Training has been not updated!', this.status)
    })
  }

}
