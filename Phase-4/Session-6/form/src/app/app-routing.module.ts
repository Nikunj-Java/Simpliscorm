import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DirectiveComponent } from './directive/directive.component';
import { PipdemoComponent } from './pipdemo/pipdemo.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [

  {"path":"directive",component:DirectiveComponent},
  {"path":"pipe",component:PipdemoComponent},
  {"path":"register",component:RegisterComponent},
  {"path":"user",component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
