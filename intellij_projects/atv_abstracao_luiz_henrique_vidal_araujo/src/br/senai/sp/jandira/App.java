package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        boolean exit = false;
        while (!exit) {
            System.out.println("-------------- Bem Vindo ---------------");
            System.out.println("------- O Que Deseja Fazer Agora -------");
            System.out.println("1 - Calcular o salário do Gerente       ");
            System.out.println("2 - Calcular o salário do Programador   ");
            System.out.println("3 - Sair                                ");
            int userOption = scanner.nextInt();

            switch (userOption){
                case 1:
                    gerente.calcularSalario();
                    break;

                case 2:
                    programador.calcularSalario();
                    break;

                case 3:
                    exit = true;
                    break;

            }

        }
    }
}
