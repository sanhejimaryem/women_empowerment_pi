import { Component, Input, OnInit, Output, TemplateRef } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { training } from '../../Model/training';
import { TrainingService } from '../../shared/training.service';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-training',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.scss']
})
export class TrainingComponent implements OnInit {
  listTraining : training[];
  idTraining : number;
  training : training[];
  listArt : training[];
  showAdd: Boolean;
  @Output() emitState = new EventEmitter<Boolean>();
  deleteModalRef?: BsModalRef;
  trainingDelete : training;
  trainingUpdate : training;

  showAddTraining: Boolean;
  actionStatus: String; 

  constructor(
      private _service:TrainingService, 
      private route: ActivatedRoute,
      private router: Router, 
      private modalService: BsModalService,
      private toastr: ToastrService, 
    ) { }

  ngOnInit(): void {
    this._service.getAlltraining().subscribe(res=>{
    this.listTraining=res
    this.trainingDelete = new training
    console.log(this.listTraining);
  });
  
  this.showAddTraining = false;
  this.showAdd = false;
  this.actionStatus = '';
  }   

  onAdd(){
    this.actionStatus = 'Add';
    this.showAddTraining = !this.showAddTraining;
  }

  updateTraining(training : training){
    this.trainingUpdate = training;
    this.actionStatus = 'Edit';
    this.showAddTraining = true;
  }

  deleteTraining(){ 
    this._service.deleteTrainingById(this.trainingDelete.idTraining).subscribe({
      next : () => {
        this.deleteModalRef?.hide()
        this.listTraining = this.listTraining.filter((t : training) => t.idTraining != this.trainingDelete.idTraining)
        this.toastr.success('Training has been deleted successfully!')
      },
      error : () => {
        this.toastr.error('Training has not deleted!')
      }
    }); 
  }

  getTrainingById(idTraining: number)  {
    this._service.getTrainingById(idTraining).subscribe(res=>
      { 
      this.listTraining=res; 
      console.log(this.listTraining)
    });
  }

  getAlltrainingsByDomaine(domaine : string){
    this._service.getAlltrainingsByDomaine(domaine).subscribe(res=>
      {
        this.listTraining=res
        console.log(this.listTraining); });
  

  }

  openDeleteConfirmation(template: TemplateRef<any>, training : training){
    this.trainingDelete = training;
    this.deleteModalRef = this.modalService.show(template);
  }

  changeTraining(training : training){
    this.showAddTraining = false;
    if(this.actionStatus == 'Add'){
      this.listTraining.push(training)
    } 
  }
}
