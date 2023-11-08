package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Azul;
import br.senai.sp.jandira.model.Gol;
import br.senai.sp.jandira.model.Latam;
import br.senai.sp.jandira.model.Voos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Voos azulVoo1 = new Azul(1, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos azulVoo2 = new Azul(2, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos azulVoo3 = new Azul(3, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");

        Voos golVoo1 =  new Gol(4, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos golVoo2 =  new Gol(5, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos golVoo3 =  new Gol(6, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");

        Voos latamVoo1 = new Latam(7, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos latamVoo2 = new Latam(8, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");
        Voos latamVoo3 = new Latam(9, 80, "Nepal, Katmandu", "Inglaterra, Londres","15/12/2023", "10:20:00");

        boolean exit = false;

        while (!exit){
            System.out.println("          Bem-Vindo          ");
            System.out.println("1 - Consultar Voos           ");
            System.out.println("2 - Listar Voos           ");
            System.out.println("3 - Sair                     ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    
                    break;

                case 2:

                    break;

                case 3:
                    exit = true;
                    break;
            }
        }
    }
}
