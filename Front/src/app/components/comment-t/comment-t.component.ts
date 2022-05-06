import { Component, OnInit } from '@angular/core';
import { commentT } from 'src/app/Model/commentT';
import { training } from 'src/app/Model/training';
import { CommentTService } from 'src/app/shared/comment-t.service';

@Component({
  selector: 'app-comment-t',
  templateUrl: './comment-t.component.html',
  styleUrls: ['./comment-t.component.scss']
})
export class CommentTComponent implements OnInit {
  listComment : commentT[];
  training : training;
  constructor(private _service:CommentTService) { }

  

  ngOnInit(): void {
    this._service.getAllcmt().subscribe(res=>{console.log(res);

      this.listComment=res
      console.log(this.listComment);});  
     }
     deleteCommentT(IdCmt:number){ 
      this._service.deleteCmtById(IdCmt).subscribe(()=>this._service.getAllcmt().subscribe(res=>{this.listComment=res})); }
      // getCommentById(idcmt:number){
      //   this._service.getCommentById(idcmt).subscribe(res=>
      //     {
      //       this.listComment=res;
      //       console.log(this.listComment); });
      }



