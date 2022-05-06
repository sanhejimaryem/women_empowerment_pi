import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ClipboardModule } from 'ngx-clipboard';

import { AdminLayoutRoutes } from './admin-layout.routing';
import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TrainingComponent } from 'src/app/components/training/training.component';
import { FormationsComponent } from 'src/app/pages/formations/formations.component';
import { ApprenantComponent } from 'src/app/pages/apprenant/apprenant.component';
import { ComponentsModule } from 'src/app/components/components.module';
import {BsModalRef, ModalModule} from 'ngx-bootstrap/modal';
// import { ToastrModule } from 'ngx-toastr';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    HttpClientModule,
    NgbModule,
    ModalModule.forRoot(),   
    ComponentsModule,
    ClipboardModule
  ],
  declarations: [
    DashboardComponent,
    UserProfileComponent,
    TablesComponent,
    IconsComponent,
    MapsComponent,
    TrainingComponent,
    ApprenantComponent,
    FormationsComponent,
    
  ],
  providers: [
    BsModalRef
  ]
})

export class AdminLayoutModule {}
