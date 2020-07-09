import { Component, OnInit } from '@angular/core';
import {UserService} from '../service/service';
import {User} from '../model/user';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  users: User[];

  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.service.getUser().subscribe(data => {
      this.users = data;
    });
  }

}
