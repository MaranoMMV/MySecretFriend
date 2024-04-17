export class Amigos{
    id: number;
    nome: string;
    email: string;
    presente1: string;
    presente2: string;
    presente3: string;

    constructor( id: number, nome: string, email: string, presente1: string, presente2: string, presente3: string){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.presente1 = presente1;
        this.presente2 = presente2;
        this.presente3 = presente3;
    }
}