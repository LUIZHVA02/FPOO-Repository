package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.model.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* Instância Register */
        Register register = new Register();

        register.Decision();
    }
}
