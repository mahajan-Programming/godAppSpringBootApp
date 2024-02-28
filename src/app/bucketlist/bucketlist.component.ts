import { Component, OnInit } from '@angular/core';
import { BucketService } from './bucket.service';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-bucketlist',
  templateUrl: './bucketlist.component.html',
  styleUrls: ['./bucketlist.component.css']
})
export class BucketlistComponent implements OnInit {

  selectedUser: any;
  buckets:any = [];
  userId:any;

  constructor(private bucketService: BucketService, private router: Router, private route:ActivatedRoute,
    private dataService : DataService) { }

  ngOnInit(): void {   
    
    // this.route.params.subscribe((params) => {
    //   const userId = params['userId'];
    //   // Fetch buckets based on user id (Replace this with your actual data fetching logic)
      
      
    //   const mockBuckets = this.selectedUser?.bucketList || [];
    //   this.buckets = mockBuckets;
    // });
    // console.log(this.buckets);
    this.userId = this.route.snapshot.paramMap.get('userId');
    this.bucketService.getBucketList().subscribe((res : any)=>{
      if(res){
        const buckets = res.userList.flatMap((user:any) => user.userId == this.userId &&
        user.bucketList ? user.bucketList : []
        );
        this.buckets = buckets;
        console.log(this.buckets);
      }
    },
    (error: any) => {
      console.error('Error fetching bucket list:', error);
    });  
  }

  navigateToSection(bucket:any){    
    this.router.navigate(['pothi/sections', bucket.bucketId])
  }
}
