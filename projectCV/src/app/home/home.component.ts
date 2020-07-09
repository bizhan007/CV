import { Component, OnInit } from '@angular/core';
import {Content} from '../model/cont';
import {UserService} from '../service/service';
import {User} from '../model/user';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  contents: Content[];
  users: User[];
  id: number;

  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.getContent();
    this.getUser();
  }

  getContent(){
    this.service.getContent().subscribe(data => {
      this.contents = data;
      });
  }

  getUser(){
    this.service.getUser().subscribe( data => {
        this.users = data;
      });
  }
}
