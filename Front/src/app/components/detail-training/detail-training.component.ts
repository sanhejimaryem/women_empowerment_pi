import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { commentT } from 'src/app/Model/commentT';
import { Quiz } from 'src/app/Model/Quiz';
import { training } from 'src/app/Model/training';
import { CommentTService } from 'src/app/shared/comment-t.service';
import { QuizService } from 'src/app/shared/quiz.service';
import { TrainingService } from 'src/app/shared/training.service';

@Component({
  selector: 'app-detail-training',
  templateUrl: './detail-training.component.html',
  styleUrls: ['./detail-training.component.scss']
})
export class DetailTrainingComponent implements OnInit {
  listTraining : training[];
  listComment : commentT[];
  listQ : Quiz[];
  training : training ;
  tr :training[];
  qz:Quiz [];
  cm :commentT;
  idTraining : number ;
  idcmt :number;
  id : number ;
  commentT : commentT= new commentT;
  showQuiz :Boolean;
  id_member : 1 ;
  constructor(private route: ActivatedRoute, private Ts: TrainingService , private router: Router ,private Cs : CommentTService, private Qz : QuizService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    
    this.Ts.getTrainingById(this.id).subscribe( data => {
      this.tr = data;
    });
    this.Cs.findcmtrbyTraining(this.id).subscribe( data => {
      this.listComment=data
    console.log(this.listComment);
      
    });
    this.showQuiz=false;

  }

  showqz(){
    this.showQuiz=true;
    this.Qz.getQuizByIdTraining(this.idTraining).subscribe( data => {
      this.listQ = data;
      console.log(this.listQ);
    });


  }

  onBack(): void {
    this.router.navigate(['apprenant']);
 }
 
 addComment(idTraining : number , id_member : number){ 
  this.Cs.addComment(this.idTraining,this.id_member).subscribe(()=>this.router.navigateByUrl("/detail/id")); 
  } 
  }

