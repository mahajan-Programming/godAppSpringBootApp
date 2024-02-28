import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private userDataSubject = new BehaviorSubject<any[]>([]);
  userData$ = this.userDataSubject.asObservable();

  private selectedUserSubject = new BehaviorSubject<any>({});
  selectedUser$ = this.selectedUserSubject.asObservable();

  private selectedBucketSubject = new BehaviorSubject<any>({});
  selectedBucket$ = this.selectedBucketSubject.asObservable();

  setUserData(userData: any[]) {
    this.userDataSubject.next(userData);
  }

  setSelectedUser(user: any) {
    this.selectedUserSubject.next(user);
    console.log(this.selectedUser$);
      
  }

  setSelectedBucket(bucket: any) {
    this.selectedBucketSubject.next(bucket);
  }
}
