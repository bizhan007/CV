import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from '../model/user';
import {Content} from '../model/cont';
import {Project} from "../model/project";
import {Resume} from "../model/resume";


@Injectable({
  providedIn: 'root'
})

export class UserService {

  constructor(private http: HttpClient) {
  }

  getUser(): Observable <User[]>{
    return this.http.get<User[]>('/user/getUsers');
  }

  getContent(): Observable<Content[]>{
    return this.http.get<Content[]>('/user/getContents');
  }

  getProject(): Observable<Project[]>{
    return this.http.get<Project[]>('/user/getProjects');
  }

  getResumes(): Observable<Resume[]>{
    return this.http.get<Resume[]>('/user/getResumes');
  }
}
