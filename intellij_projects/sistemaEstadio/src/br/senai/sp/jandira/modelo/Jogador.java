package br.senai.sp.jandira.modelo;

import java.util.Scanner;

public class Jogador extends Pessoas{

    Scanner scanner = new Scanner(System.in);
    private String posicao;
    private int numeroCamisa;
    public void cadastrarJogador(){

        System.out.println("|----------------- Cadastrar Jogador -----------------|");
        System.out.print("|Informe o nome do Jogador: ");
        super.nome = scanner.nextLine();
        System.out.print("|Informe o CPF: ");
        super.cpf = scanner.nextLong();
        System.out.print("|Informe o RG: ");
        super.rg = scanner.nextLong();
        System.out.print("|Informe a idade: ");
        super.idade = scanner.nextInt();
        System.out.print("|Informe o número da camisa: ");
        numeroCamisa = scanner.nextInt();
        System.out.print("|Informe a posição: ");
        posicao = scanner.nextLine();
        System.out.println("|------------------------------------------------------|");

    }
}
