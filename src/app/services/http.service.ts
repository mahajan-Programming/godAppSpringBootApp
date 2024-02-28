import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private http: HttpClient) { }

  public get(url: string, reqObj?: any) {
    return this.http.get<any>(`${url}`, reqObj);
  }
  public post(url: string, data: any) {
    return this.http.post<any>(`${url}`, data);
  }
}
