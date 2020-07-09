import { Component, OnInit } from '@angular/core';
import {Project} from '../model/project';
import {UserService} from '../service/service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.scss']
})
export class ProjectComponent implements OnInit {

  projects: Project[];

  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.service.getProject().subscribe(data => {
      this.projects = data;
    });
  }

}
