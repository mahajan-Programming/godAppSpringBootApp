import { Component, OnInit } from '@angular/core';
import { BucketService } from '../bucketlist/bucket.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-sectionlist',
  templateUrl: './sectionlist.component.html',
  styleUrls: ['./sectionlist.component.css']
})
export class SectionlistComponent implements OnInit {

  sections:any = [];
  bucketId:any;

  constructor(private bucketService: BucketService, private route: ActivatedRoute, 
    private router:Router) { }

  ngOnInit(): void {
    this.bucketId = this.route.snapshot.paramMap.get('bucketId');
    console.log(this.bucketId);
    
    this.bucketService.getBucketList().subscribe((res:any)=>{
      if(res){
        const sectionLists = res.userList.flatMap((user:any) =>
          user.bucketList.flatMap((bucket:any) =>  bucket.bucketId == this.bucketId
            && bucket.sectionList ? bucket.sectionList : []
          ))
        this.sections = sectionLists;
        console.log(this.sections);
      }
    },
    (error:any)=>{

    })
  }

  navigateToContent(section:any){
    this.router.navigate(['pothi/contents', section.sectionId])
  }

}
