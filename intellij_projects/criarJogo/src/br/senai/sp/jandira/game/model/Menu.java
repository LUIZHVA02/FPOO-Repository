package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Menu {
    public void Menu(){
        Scanner teclado = new Scanner(System.in);
        Register register = new Register();
        Battle battle = new Battle();

        boolean exit = false;

        while (!exit){
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("--------------- Bem Vindo ---------------");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Register");
            System.out.println("2 - Battle");
            System.out.println("3 - Exit");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

            int userChoice = teclado.nextInt();

            switch (userChoice){

                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.BattleInfo(register.player, register.enemy);
                    break;

                case 3:
                    exit = false;
                    break;

            }
        }
    }
}
