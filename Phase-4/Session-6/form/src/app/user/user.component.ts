import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  title='service';
  user={"fname":'',"lname":''};

  //dependecy injection of data service
  constructor(private service:DataService) { }

  ngOnInit(): void {

    this.user=this.service.getUser();
  }

}
