import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{name:"pencile",price:"8.3",available:"12-10-2022",ratings:4.8},
  {name:"pen",price:"8.3",available:"12-10-2022",ratings:4.8},
  {name:"eraser",price:"5.3",available:"17-10-2022",ratings:4.9},
  {name:"scale",price:"8.0",available:"22-10-2022",ratings:4.2},
  {name:"books",price:"12",available:"19-10-2022",ratings:4.4}

          ]

}
