import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipdemo',
  templateUrl: './pipdemo.component.html',
  styleUrls: ['./pipdemo.component.css']
})
export class PipdemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string="My Name is Nikunj and I am a Java FSD Trainer";
  pi:number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today=new Date();
  object={name:"Nikunj",email:"nikunj@gmail.com",address:"Mumbai,India"};


  //custom pipes
  cust: string="Welcome to the world of customPipes";

}
