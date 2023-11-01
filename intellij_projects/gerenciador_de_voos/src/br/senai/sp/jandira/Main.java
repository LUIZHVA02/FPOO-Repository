package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Azul;
import br.senai.sp.jandira.model.Gol;
import br.senai.sp.jandira.model.Latam;
import br.senai.sp.jandira.model.Voos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Voos azulVoo1 = new Azul();
        Voos azulVoo2 = new Azul();
        Voos azulVoo3 = new Azul();

        Voos golVoo1 =  new Gol();
        Voos golVoo2 =  new Gol();
        Voos golVoo3 =  new Gol();

        Voos latamVoo1 = new Latam();
        Voos latamVoo2 = new Latam();
        Voos latamVoo3 = new Latam();

        boolean exit = false;

        while (!exit){
            System.out.println("          Bem-Vindo          ");
            System.out.println("1 - Consultar Voos           ");
            System.out.println("2 - Sair                     ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    
                    break;

                case 2:
                    exit = true;
                    break;
            }
        }
    }
}
