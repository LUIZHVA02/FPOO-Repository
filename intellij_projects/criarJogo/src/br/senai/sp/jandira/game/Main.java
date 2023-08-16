package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.model.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* Instância Register */
        Register register = new Register();

        register.Decision();

        System.out.println("Deseja Cadastrar Novamente? Sim(s) Não(n)");
        String resposta = teclado.nextLine();

        if ("s".equals(resposta)) {
                Register register1 = new Register();

                register1.Decision();

                System.out.println("Deseja Cadastrar Novamente? Sim(s) Não(n)");
                resposta = teclado.nextLine();
            }

            System.out.println("Fim do Código!");}

}
