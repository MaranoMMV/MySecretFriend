# Projeto MySecretFriend Spring + Angular

  ![Java](https://img.shields.io/badge/-Java-0D1117?style=for-the-badge&logo=Java8&logoColor=1572B6&labelColor=0D1117)&nbsp;
  ![CSS](https://img.shields.io/badge/-CSS-0D1117?style=for-the-badge&logo=CSS3&logoColor=1572B6&labelColor=0D1117)&nbsp;
  ![HTML](https://img.shields.io/badge/-Html-0D1117?style=for-the-badge&logo=html5&labelColor=0D1117)&nbsp;
  ![Spring](https://img.shields.io/badge/-Spring-0D1117?style=for-the-badge&logo=Spring&labelColor=0D1117)&nbsp;
  ![Angular](https://img.shields.io/badge/-Angular-0D1117?style=for-the-badge&logo=Angular&labelColor=0D1117)&nbsp;
  ![TypeScript](https://img.shields.io/badge/-TypeScript-0D1117?style=for-the-badge&logo=TypeScript&labelColor=0D1117)&nbsp;

  
Este projeto você consegue utiliza-lo para realizar sorteio de amigo secreto. Pode ser utilizado utilizando uma conta do gmail para enviar os emails para os participantes com os sorteados, porém é recomendado utilizar uma conta no qual nenhum dos participantes do sorteio tenha acesso para não perder a surpresa de "Pessoa A tirou a pessoa B".


Foi utilizado a logica de que uma pessoa não pode tirar ela mesma, e também não pode realizar o sorteio com apenas uma pessoa cadastrada.


 **Importante**: Sempre que o back-end for inicializado, foi configurado para ele não salvar os dados. isso pode ser removido retirando ou comentando a Classe Instantiation que está localizada em 'com/myfriendsecret/myfriendsecret/config/Instantiation.java


Também uma pessoa deve escolher no minimo um presente que ela gostaria de receber.


O Projeto utilizou as linguagens e framework Java, Spring, JavaScript, TypeScript, HTML, CSS


O projeto contou com a ajuda do Edmilson https://github.com/Edmitsu

## Modelagem
![image](https://github.com/MaranoMMV/MySecretFriend/assets/77554696/c0ab5600-44a1-40b8-abb7-2b720a7f121b)

## Criar uma database no Postgresql
* Crie uma database no Postgresql com o nome 'myband' lembrando que deve estar na porta padrão do pgAdmin (5432)

Todos os dados e tabelas serão geradas de forma automatica no Banco de dados.

## Instalação do Angular CLI
A instalação do angular deve ser feita através do NodeJS
```
npm install -g @angular/cli
```

## Inicialização do projeto Front-End:
Para inicializar o projeto, abra a pasta 'agenda-app' e abra o terminal no diretorio, e digite:

```
npm install
```

Lembrando que deve estar instalado em seu computador o NodeJS.

Após instalar as dependencias do projeto, coloque no terminal o comando a baixo para executar o front-end. A ultima opção ela abre o navegador automaticamente no endereço http://localhost:4200/ do navegador
```
ng serve
```
OU
```
ng serve --open
```

Prontinho, o projeto já foi inicializado.

## Inicializando o projeto Back-end
* Para inicializar o projeto, primeiro deve estar instalado o Java.
* Segundo deve estar instalado o Spring Tools que pode ser utilizado tanto no Eclipse quanto no VSCode. Para baixar é pelo link: https://spring.io/tools
* Ao instalar e baixar o projeto no github, pode utilizar o SpringTools Eclipse indo em 'File' > Import > Selecionar a pasta 'Maven' e selecionar a opção 'Existing Maven Projects'. Depois disso selecione a pasta principal, normalmente na pasta principal contem o arquivo pom.xml
* Clicar em 'Finish' e aguarde o projeto baixar as suas dependencias.
* Depois disso só clicar com o botão direito do mouse na classe principal ( src\main\java\com\myband\agenda\AgndaApplication.java ) e ir em 'Run as' > 9 - Spring Boot APP ( Eclipse )

## Campo Email do back-end
Você deve colocar o seu username e password do google para poder enviar os emails via SMTP automaticamente pelo codigo. Para isso vá na pasta do back-end e edite src\main\resources\application.properties e coloquei:
* spring.mail.username=SEU_EMAIL
* spring.mail.password=SUA_SENHA_GMAIL


    A Senha do email não é a sua senha que você utiliza no google, normalmente você tem que gerar outra em https://myaccount.google.com/apppasswords?utm_source=google-account&utm_medium=myaccountsecurity&utm_campaign=tsv-settings&rapt=AEjHL4OkFJuCGvgL_4gCytHG17EC4xa6JznP697ChIUNWO87mePzeMugkBD8EmmYn27hGIzfVHBXSunuFhdrKej3wrWvex1WIF1ii4czluHeiF9zej8pCGE

     Depois de gerar a senha coloque a senha que apareceu em sua tela
