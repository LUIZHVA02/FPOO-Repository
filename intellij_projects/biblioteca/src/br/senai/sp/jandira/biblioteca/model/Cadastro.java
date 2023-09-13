package br.senai.sp.jandira.biblioteca.model;

import java.util.Scanner;

public class Cadastro {
    String nome;
    String endereco;
    String telefone;
    String cpf;
    Scanner teclado = new Scanner(System.in);
    public void UserCadastro() {
        System.out.println("---------- Cadastro de Usuário ----------");
        System.out.print("Digite o seu nome: ");
        nome = teclado.next();
        System.out.println("-----------------------------------------");
        System.out.print("Digite o seu endereço: ");
        endereco = teclado.next();
        System.out.println("-----------------------------------------");
        System.out.print("Digite o seu telefone(com DDD): ");
        telefone = teclado.next();
        System.out.println("-----------------------------------------");
        System.out.println("Digite o seu CPF: ");
        cpf = teclado.next();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }
}
