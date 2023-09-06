package br.senai.sp.jandira.biblioteca.model;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    Cadastro cadastro = new Cadastro();
    Livros livros = new Livros();
    Login login = new Login();
    public void Menu() {
        System.out.println( "|Seja Bem-Vindo!\n" +
                            "|Como deseja começar?\n" +
                            "|------------------------------\n" +
                            "|Cadastrar(1)\n" +
                            "|Fazer Login(2)\n" +
                            "|Consultar Livros(3)\n" +
                            "|Encerrar Programa(4)\n" +
                            "|------------------------------\n");

        int escolhaMenu = teclado.nextInt();
        String vazio = teclado.nextLine();

        if(escolhaMenu == 1) {
            cadastro.MethodCadastro();

        } else if (escolhaMenu == 2) {
            login.MethodLogin();

        } else if (escolhaMenu == 3) {
            livros.MethodLivros();

        } else if (escolhaMenu == 4) {
            System.out.println("Fim do Código!!!");
        }
    }
}
