import { Routes } from '@angular/router';

import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { TrainingComponent } from 'src/app/components/training/training.component';
import { FormationsComponent } from 'src/app/pages/formations/formations.component';
import { ApprenantComponent } from 'src/app/pages/apprenant/apprenant.component';
import { DetailTrainingComponent } from 'src/app/components/detail-training/detail-training.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'tables',         component: TablesComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'formations',     component: FormationsComponent },
    { path:"training",         component: TrainingComponent},
    { path: 'apprenant',     component: ApprenantComponent },
    { path: 'detail/:id' , component: DetailTrainingComponent }
    
];
