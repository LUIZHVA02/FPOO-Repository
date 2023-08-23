package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.model.Menu;
import br.senai.sp.jandira.game.model.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        /* Instância Menu */
        Menu menu = new Menu();
        menu.Menu();

        /* Instância Register
        Register register = new Register();
        register.Decision();*/

            System.out.println("Fim do Código!");

    }
}
