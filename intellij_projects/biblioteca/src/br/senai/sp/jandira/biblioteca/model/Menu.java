package br.senai.sp.jandira.biblioteca.model;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {
    Scanner tecladoMain = new Scanner(System.in);
    Cadastro cadastroMain = new Cadastro();
    Livro livrosMain = new Livro();
    boolean finalizar = false;
    public void menu() {

        while (!finalizar) {
            System.out.println("|Seja Bem-Vindo!\n" +
                               "|Como deseja começar?\n" +
                               "|------------------------------\n" +
                               "|Cadastrar(1)\n" +
                               "|Consultar Livros(2)\n" +
                               "|Adicionar Livros(3)\n" +
                               "|Encerrar Programa(4)\n" +
                               "|------------------------------\n");

            int escolhaMenu = tecladoMain.nextInt();

            if (escolhaMenu == 1) {
                cadastroMain.userCadastro();

            } else if (escolhaMenu == 2) {
                livrosMain.listarLivros();

            } else if (escolhaMenu == 3) {
                livrosMain.adicionarLivros(livrosMain);

            } else if (escolhaMenu == 4) {
                System.out.println("Fim do Programa!!!");
                finalizar = true;
            }
        }
    }
}
