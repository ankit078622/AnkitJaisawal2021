import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { HelpComponent } from './help/help.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [{path:'aboutus',component:AboutusComponent},
                        {path:'home',component:HomeComponent},
                        {path:'contactus',component:ContactusComponent},
                        {path:'help',component:HelpComponent},
                       {path:'',redirectTo:'/home',pathMatch:'full'}   
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
