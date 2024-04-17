import { Component, OnInit } from '@angular/core';
import {MatTabsModule} from '@angular/material/tabs';
import {MatInputModule} from '@angular/material/input';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { Amigos } from './amigos';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';
import { animate, state, style, transition, trigger } from '@angular/animations';
import { MatSnackBar, MatSnackBarModule } from '@angular/material/snack-bar';
import { FormularioService } from '../service/formulario.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [MatTabsModule, MatInputModule, MatFormFieldModule, MatTableModule, FormsModule, ReactiveFormsModule, MatSnackBarModule, CommonModule],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css',
  animations: [
    trigger('menuSlideUp', [
      state('inactive', style({ transform: 'translateY(0)' })),
      state('active', style({ transform: 'translateY(-100%)' })),
      transition('inactive <=> active', animate('0.3s ease-in-out'))
    ])
  ],
  providers: [
    FormularioService
  ]
})
export class FormularioComponent implements OnInit {

  formulario!: FormGroup;

  amigosDataSource!: MatTableDataSource<Amigos>;

  isLinear = false;

  colunas = [ 'cidade', 'estado', 'pais', 'local', 'horario', 'data', 'vendas'];

  formularioService!: FormularioService;

  amigo!: Amigos | null;
  amigos: Amigos[] = [];

  constructor(private fb: FormBuilder, private snackBar: MatSnackBar){

  }
  ngOnInit(): void {
  this.montarFormulario();
  }
  
  montarFormulario() {
    this.formulario = this.fb.group({
      nome: ['', Validators.required],
      email: ['', Validators.required],
      presente1: ['', Validators.required],
      presente2: [''],
      presente3: [''],
    });
  }

  onSubmit() {
    const formValues = this.formulario.value;
      const amigo: Amigos = new Amigos(
        formValues.id,
        formValues.nome,
        formValues.email,
        formValues.presente1,
        formValues.presente2,
        formValues.presente3,
      );
    console.log(amigo);
    this.formularioService.save(amigo).subscribe(resposta => {
      let lista: Amigos[] = [...this.amigos, resposta];
      this.amigos = lista;
      this.openSnackBar("Cadastro realizado com sucesso!!", "fechar");
      
    });
}

openSnackBar(message: string, action: string) {
  this.snackBar.open(message, action);
}
}
