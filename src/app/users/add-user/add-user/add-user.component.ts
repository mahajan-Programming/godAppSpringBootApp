import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  user:any = {userName : ''};
  constructor(private userService : UserService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.user);
    
    this.userService.addUser(this.user).subscribe(
      (data:any)=>{
        console.log(data);
        console.log("User Added SuccesFully !!");
      },
      (error:any)=>{
        console.log(error);
        
        console.log("Some error has occured");
      }
    )
  }

}
