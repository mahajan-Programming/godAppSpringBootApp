import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import { Router } from '@angular/router';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css'],
})
export class UsersComponent implements OnInit {
  users: any = [];

  constructor(
    private userService: UserService,
    private router: Router,
    private dataService: DataService
  ) {}

  ngOnInit(): void {
    this.userService.getUsers().subscribe((user: any) => {
      console.log(user);

      this.users = user.userList;
    });
  }

  selectUser(user: any) {
    this.dataService.setSelectedUser(user);
  }

  getUserId(userId: any) {
    this.router.navigate(['pothi/buckets', userId]);
  }
}
