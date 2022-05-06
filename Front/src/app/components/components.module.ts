import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { QuizComponent } from './quiz/quiz.component';
import { AddTrainingComponent } from './add-training/add-training.component';
import { CertificateComponent } from './certificate/certificate.component';
import { AddQuizComponent } from './add-quiz/add-quiz.component';
import { AddQuizrepComponent } from './add-quizrep/add-quizrep.component';
import { QuizrepComponent } from './quizrep/quizrep.component';
import { AddCertComponent } from './add-cert/add-cert.component';
import { FormsModule } from '@angular/forms';
import { CommentTComponent } from './comment-t/comment-t.component';
import { DetailTrainingComponent } from './detail-training/detail-training.component';

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    NgbModule,
    FormsModule
  ],
  declarations: [
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    QuizComponent,
    AddTrainingComponent,
    CertificateComponent,
    AddQuizComponent,
    AddQuizrepComponent,
    QuizrepComponent,
    AddCertComponent,
    CommentTComponent,
    DetailTrainingComponent
  ],
  exports: [
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    
    CommentTComponent,
    QuizComponent,
    AddTrainingComponent,
    CertificateComponent,
    AddQuizComponent,
    AddQuizrepComponent,
    QuizrepComponent,
    AddCertComponent,
    DetailTrainingComponent
  ]
})
export class ComponentsModule { }
