import { Component, OnInit } from '@angular/core';
import {Resume} from '../model/resume';
import {UserService} from '../service/service';

@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.scss']
})
export class ResumeComponent implements OnInit {

  resumes: Resume[];

  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.service.getResumes().subscribe(data => {
      this.resumes = data;
    });
  }

}
