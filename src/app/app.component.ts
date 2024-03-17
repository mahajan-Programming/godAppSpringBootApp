import { Component } from '@angular/core';
import { APP_CONSTANTS } from 'src/assets/app-constants';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'god-app';
  bgImageUrl = APP_CONSTANTS.ImgUrl;
}
