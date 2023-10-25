package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Alunos;
import br.senai.sp.jandira.model.Pessoas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoas emily = new Pessoas("Emily", 18);
        Pessoas nycolle = new Pessoas("Nycolle", 26);

        System.out.println("O nome é " + emily.getNome());
        System.out.println("O nome é " + nycolle.getNome());
        System.out.println("");
        emily.setNome("Emily Crepaldi");

        System.out.println("O nome é " + emily.getNome());


        // Aplicando Herança
        System.out.println("");
        Pessoas aluno1 = new Alunos("João", 16, 1567);
        System.out.println(aluno1.getNome());


        //Aplicando Polimorfismo
        System.out.println("");
        aluno1.passarTempo();



        //Aplicando Abstração
        System.out.println("");
        aluno1.exibirInformacao();


    }
}
