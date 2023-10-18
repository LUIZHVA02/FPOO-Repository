package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Alunos extends Pessoas{
    Scanner scanner = new Scanner(System.in);
    public void cadastrarAluno(){
        System.out.println("Informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe o apelido: ");
        super.setApelido(scanner.nextLine());
    }

    public void falar(){
        System.out.println("Os alunos falam demais");
        System.out.println("O palmeiras não tem mundial!");
    }

}
