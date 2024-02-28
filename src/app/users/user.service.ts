import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpService } from '../services/http.service';
import { Observable, map } from 'rxjs';
import { APP_CONSTANTS } from 'src/assets/app-constants';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url: string = APP_CONSTANTS.BaseUrl;
  constructor(private http: HttpService) { }

  getUsers() {
    return this.http.get(this.url);
  }

  addUser(newUser: any) {
    return this.http.post(this.url, newUser);
  }
}
