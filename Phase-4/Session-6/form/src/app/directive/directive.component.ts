import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directive',
  templateUrl: './directive.component.html',
  styleUrls: ['./directive.component.css']
})
export class DirectiveComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  flag:boolean=false;
  show(){
    this.flag=!this.flag
  }

  public day= new Date().getDay();

  products=[{"name":"Nikunj","email":"nikunj@gmail.com"},
  {"name":"Rorisang","email":"rs@gmail.com"},
  {"name":"Daniel","email":"danial@gmail.com"}
];

}
