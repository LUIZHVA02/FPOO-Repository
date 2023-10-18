package br.senai.sp.jandira;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (exit) {
            System.out.println("O que deseja calcular primeiro: ");
            System.out.println("1 - Área do Circulo");
            System.out.println("1 - Perímetor do Circulo");
            System.out.println("2 - Área do Retângulo");
            System.out.println("2 - Perímetro do Retângulo");
            System.out.println("3 - Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    break;

            }
        }
    }
}
