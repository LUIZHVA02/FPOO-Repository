package br.senai.sp.jandira.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    Scanner teclado = new Scanner(System.in);
    String nomeLivro;
    String dataDevolucao;
    String isbn;
    List<Livro> listLivros = new ArrayList<>();
    public void adicionarLivros(Livro livro) {
        listLivros.add(livro);
    }
    public void listarLivros(){
        for(Livro livro : listLivros){

            System.out.println(livro.nomeLivro);
            System.out.println(livro.isbn);
            System.out.println(livro.dataDevolucao);
            System.out.println();

        }
    }
}
