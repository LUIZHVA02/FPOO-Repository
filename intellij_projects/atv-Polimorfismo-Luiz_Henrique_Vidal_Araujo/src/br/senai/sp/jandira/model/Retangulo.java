package br.senai.sp.jandira.model;

import br.senai.sp.jandira.GerenciadorFormas;

import java.util.Scanner;

public class Retangulo extends FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    GerenciadorFormas menu = new GerenciadorFormas();
    public double altura, largura;
    public void areaOuPerimetro(){
        boolean exit = false;
        while (!exit) {
        System.out.println("O que deseja calcular primeiro: ");
        System.out.println("1 - Área do Retângulo");
        System.out.println("2 - Perímetro do Retângulo");
        System.out.println("3 - Voltar ao Menu");
        int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("");
                    System.out.println("Informe o valor da altura do retângulo:");
                    altura = scanner.nextDouble();

                    System.out.println("");
                    System.out.println("Informe o valor da largura do retângulo:");
                    largura = scanner.nextDouble();
                    calcularArea();
                        break;
                case 2:
                    System.out.println("");
                    System.out.println("Informe o valor da altura do retângulo:");
                    altura = scanner.nextDouble();

                    System.out.println("");
                    System.out.println("Informe o valor da largura do retângulo:");
                    largura = scanner.nextDouble();
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
        area = (altura*largura);
        System.out.println("A área do retângulo é: "+area);
        System.out.println("");
    }
    @Override
    public void calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = altura+altura+largura+largura;
        System.out.println("O perímetro do retângulo é: "+perimetro);
        System.out.println("");
    }
}
