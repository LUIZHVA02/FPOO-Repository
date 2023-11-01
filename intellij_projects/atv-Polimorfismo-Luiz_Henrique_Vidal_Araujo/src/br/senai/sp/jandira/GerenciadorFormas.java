package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.FormaGeometrica;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FormaGeometrica circulo = new Circulo();
        FormaGeometrica retangulo = new Retangulo();

        boolean exit = false;
        while (!exit) {
            System.out.println("O que deseja fazer agora: ");
            System.out.println("1 - Criar um Circulo");
            System.out.println("2 - Criar um Retângulo");
            System.out.println("3 - Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("");
                    circulo.areaOuPerimetro();
                    exit = false;
                        break;
                case 2:
                    System.out.println("");
                    retangulo.areaOuPerimetro();
                    exit = false;
                        break;
                case 3:
                    exit = true;
                        break;
            }
        }
    }
}
