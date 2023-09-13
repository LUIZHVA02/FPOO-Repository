package br.senai.sp.jandira.biblioteca.model;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {
    Scanner tecladoMain = new Scanner(System.in);

    Cadastro cadastroMain = new Cadastro();
    Livros livrosMain = new Livros();
    Login loginMain = new Login();
    public void Menu() {
        System.out.println( "|Seja Bem-Vindo!\n" +
                            "|Como deseja começar?\n" +
                            "|------------------------------\n" +
                            "|Cadastrar(1)\n" +
                            "|Fazer Login(2)\n" +
                            "|Consultar Livros(3)\n" +
                            "|Encerrar Programa(4)\n" +
                            "|------------------------------\n");

        int escolhaMenu = tecladoMain.nextInt();
        String vazio = tecladoMain.nextLine();

        if(escolhaMenu == 1) {
            cadastroMain.methodCadastro();

        } else if (escolhaMenu == 2) {
            loginMain.methodLogin();

        } else if (escolhaMenu == 3) {
            livrosMain.methodLivros(livrosMain);

        } else if (escolhaMenu == 4) {
            System.out.println("Fim do Programa!!!");
        }
    }
}
