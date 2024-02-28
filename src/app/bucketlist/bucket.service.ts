import { Injectable } from '@angular/core';
import { HttpService } from '../services/http.service';
import { APP_CONSTANTS } from 'src/assets/app-constants';

@Injectable({
  providedIn: 'root'
})
export class BucketService {
  bucketData: any = [];
  constructor(private httpService: HttpService) { }
  url: string = APP_CONSTANTS.BaseUrl;
  getBucketList() {
    return this.httpService.get(this.url);
  }

  getBucketData() {
    this.httpService.get(this.url).subscribe((res: any) => {
      if (res) {
        const buckets = res.userList.flatMap((user: any) =>
          user.bucketList.map((bucket: any) => bucket)
        );
        this.bucketData = buckets;
        console.log(this.bucketData);
      }
    },
      (error: any) => {

      })
  }
}
