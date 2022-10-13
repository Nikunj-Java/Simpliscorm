import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DataService } from './data.service';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';
import { DirectiveComponent } from './directive/directive.component';
import { ChangeColorDirective } from './ChangeColorDirective';
import { HighLightColor } from './HighLightColor';
 

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    UserComponent,
    DirectiveComponent,
    ChangeColorDirective,
    HighLightColor
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [DataService], //registered service
  bootstrap: [AppComponent]
})
export class AppModule { }
