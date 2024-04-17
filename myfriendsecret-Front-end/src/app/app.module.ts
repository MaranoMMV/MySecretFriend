import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FormularioComponent } from './formulario/formulario.component';


@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    MatToolbarModule,
    FormularioComponent
  ],exports: [
    FormularioComponent
  ]
})
export class AppModule { }
