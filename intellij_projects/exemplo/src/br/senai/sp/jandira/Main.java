package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Alunos;
import br.senai.sp.jandira.model.Pessoas;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoas   pessoa1 = new Alunos();
//    Classe Pai  objeto    Classe Filho
        pessoa1.falar();
    }
}
