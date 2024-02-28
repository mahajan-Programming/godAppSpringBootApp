import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BucketService } from '../bucketlist/bucket.service';

@Component({
  selector: 'app-contentlist',
  templateUrl: './contentlist.component.html',
  styleUrls: ['./contentlist.component.css']
})
export class ContentlistComponent implements OnInit {

  contents:any = [];
  sectionId:any;

  constructor(private route : ActivatedRoute, private bucketService : BucketService) { }

  ngOnInit(): void {
    this.sectionId = this.route.snapshot.paramMap.get('sectionId');
    this.bucketService.getBucketList().subscribe((res:any)=>{
      if(res){
        const contentList = res.userList.flatMap((user:any) =>
          user.bucketList.flatMap((bucket:any) =>
          bucket.sectionList?.flatMap((section:any)=> section.sectionId == this.sectionId 
          && section.contentList ? section.contentList : [])
        ))
        this.contents = contentList
        console.log(this.contents);
      }
    },
    (error:any)=>{

    })
  }

}
