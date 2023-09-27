package br.senai.sp.jandira.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    Scanner teclado = new Scanner(System.in);
    public String nomeLivro;
    public String isbn;
    public String autorLivro;
    List<Livro> listLivros = new ArrayList<>();
    public void adicionarLivros(Livro livro) {
        listLivros.add(livro);
    }
    public void listarLivros(){
        for(Livro livro : listLivros){

            System.out.println(livro.nomeLivro);
            System.out.println(livro.autorLivro);
            System.out.println(livro.isbn);
            System.out.println();

        }
    }
    public void livroCadastro () {
        System.out.println("----------- Cadastro do Livro -----------");
        System.out.println("Digite o nome do livro: ");
        nomeLivro = teclado.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Digite o nome do autor: ");
        autorLivro = teclado.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Digite o ISBN do livro: ");
        isbn = teclado.nextLine();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("");
    }
}
