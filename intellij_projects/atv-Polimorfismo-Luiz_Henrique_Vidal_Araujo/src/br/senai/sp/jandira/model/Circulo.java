package br.senai.sp.jandira.model;

import br.senai.sp.jandira.GerenciadorFormas;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    public double raio, pi = 3.1416, diametro = raio*2;
    public void areaOuPerimetro() {

        boolean exit = false;
        while (!exit) {
        System.out.println("O que deseja calcular primeiro: ");
        System.out.println("1 - Área do Circulo");
        System.out.println("2 - Perímetro do Circulo");
        System.out.println("3 - Voltar ao Menu");
        int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("");
                    System.out.println("Informe o valor do raio do circulo: ");
                    raio = scanner.nextDouble();
                    calcularArea();
                        break;
                case 2:
                    System.out.println("");
                    System.out.println("Informe o valor do raio do circulo: ");
                    raio = scanner.nextDouble();
                    calcularPerimetro();
                        break;
                case 3:
                    exit = true;
                        break;
            }
        }
    }
    public void calcularArea(){
        super.calcularArea();
        area = pi*Math.pow(raio,2);
        System.out.println("A área do circulo é: "+area);
        System.out.println("");
    }
    public void calcularPerimetro(){
        super.calcularPerimetro();
        perimetro = 2*pi*raio;
        System.out.println("O perímetro do circulo é: "+perimetro);
        System.out.println("");
    }
}
