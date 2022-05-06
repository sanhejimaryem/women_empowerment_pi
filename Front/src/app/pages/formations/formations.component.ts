import { Component, OnInit } from '@angular/core';
import { training } from 'src/app/Model/training';
import { TrainingService } from 'src/app/shared/training.service';
import { TrainingComponent } from 'src/app/components/training/training.component';
import { Router, Routes } from '@angular/router';

@Component({
  selector: 'app-formations',
  templateUrl: './formations.component.html',
  styleUrls: ['./formations.component.scss']
})
export class FormationsComponent implements OnInit {
  showTraining: Boolean;
  showQuiz: Boolean;
  showCert : Boolean;
  showR : boolean;
  showAddQuiz : boolean;
  showAddCert : boolean;
  showAddQuestion : boolean;

  constructor() { }

  ngOnInit(): void {
    this.showTraining = true;
    this.showQuiz = false;
    this.showCert = false ;
    this.showR = false ;
    this.showAddQuiz=false;
    this.showAddCert=false;
  }
  showQ(){
    this.showQuiz =true;
    this.showTraining = false;
    this.showCert = false;
    this.showR = true ;
    
  }

  showTr(){
    this.showTraining = true;
    this.showQuiz = false;
    this.showCert = false;
    this.showR=false;
  }
  showC(){
    this.showTraining = false;
    this.showQuiz = false;
    this.showCert = true ;
    this.showR = false ;
  }

  sendStateq(){
    this.showAddQuiz = !this.showAddQuiz;
  }
  sendStateC(){
    this.showAddCert= !this.showAddCert;

  }
  sendStateR(){
    this.showAddQuestion= !this.showAddQuestion ;
  }
}
