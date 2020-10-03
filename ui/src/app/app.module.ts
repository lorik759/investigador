import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {TestComponent} from './components/test.component';
import { TesteDoisComponent } from './components/teste-dois/teste-dois.component';
import {CursoModule} from './components/curso/curso.module';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    TesteDoisComponent
  ],
  imports: [
    BrowserModule,
    CursoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
