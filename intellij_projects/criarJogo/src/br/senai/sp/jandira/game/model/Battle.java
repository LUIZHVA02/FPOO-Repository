package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {
    /* Declarar Variaveis */
    String scenarioBattle;
    Scanner teclado = new Scanner(System.in);

    /* Instância scenario */
    Scenario scenario = new Scenario();

    public void Battle(Player player, Enemy enemy){

        while(true) {
            int vidaPlayer = player.getVidaPlayer();
            int vidaEnemy = enemy.getVidaEnemy();

            if (vidaEnemy <= 0) {
                System.out.println("O Player " + player.nome + " é o Vencedor!");
                break;
            } else if (vidaPlayer <= 0) {
                System.out.println("O Enemy " + enemy.nome + " é o Vencedor!");
                break;
            }


            System.out.println("-------------------- Battle --------------------");
            System.out.println(" Ataque Player [ C ]  " + player.nome);
            System.out.println(" Ataque Enemy [ X ]  " + enemy.nome);
            System.out.println("------------------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("C")) {

                System.out.println("---------------------------");
                System.out.println("-      Player Atacou      -");
                System.out.println("---------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                enemy.subtrairVida(danoPlayer);

                System.out.println("---------------------------------------");
                System.out.println("O Ataque foi de: " + danoPlayer + " vida: " + vidaPlayer);
                System.out.println("---------------------------------------");

            } else if (attack.equalsIgnoreCase("X")) {

                System.out.println("---------------------------");
                System.out.println("-      Enemy Atacou      -");
                System.out.println("---------------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                enemy.subtrairVida(danoEnemy);

                System.out.println("---------------------------");
                System.out.println("O Ataque foi de: " + danoEnemy + " vida: " + vidaEnemy);
                System.out.println("---------------------------");

            } else {
                System.out.println("Tecla Inválida");
            }
        }

    }
    public void ChoiceScenario(){
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Escolha um cenário: \n[1 - Torre Eiffel  2 - Arabia  3 - Turquia] : ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

        int choiceScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);
    }
}
