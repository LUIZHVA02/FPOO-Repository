package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {
    /* Declarar Variaveis */
    String scenarioBattle;
    Scanner teclado = new Scanner(System.in);

    /* Instância scenario */
    Scenario scenario = new Scenario();

    public void BattleInfo(Player player, Enemy enemy){

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
            System.out.println(" Defesa Player [ D ]  " + player.nome);
            System.out.println(" Ataque Enemy [ X ]  " + enemy.nome);
            System.out.println(" Defesa Enemy [ Y ]  " + enemy.nome);
            System.out.println("------------------------------------------------");

            String attack = teclado.next();
            String deffense = teclado.next();

            if (attack.equalsIgnoreCase("C")) {

                System.out.println("---------------------------");
                System.out.println("-      Player Atacou      -");
                System.out.println("---------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaEnemy = (int) (Math.random() * 20) + 1;

                int danoReal = danoPlayer - defesaEnemy;

                if (danoReal < 0){
                    danoReal = 0;
                }

                enemy.subtrairVida(danoReal);

                System.out.println("---------------------------------------");
                System.out.println("O Ataque foi de: " + danoPlayer);
                System.out.println("A defesa foi de: " + defesaEnemy);
                System.out.println("Vida: " + vidaPlayer);
                System.out.println("---------------------------------------");

            } else if (attack.equalsIgnoreCase("X")) {

                System.out.println("---------------------------");
                System.out.println("-      Enemy Atacou      -");
                System.out.println("---------------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;

                int danoReal = danoEnemy - defesaPlayer;

                if (danoReal < 0){
                    danoReal = 0;
                }

                enemy.subtrairVida(danoReal);

                enemy.subtrairVida(danoEnemy);

                System.out.println("---------------------------------------");
                System.out.println("O Ataque foi de: " + danoEnemy);
                System.out.println("A defesa foi de: " + defesaPlayer);
                System.out.println("Vida: " + vidaEnemy);
                System.out.println("---------------------------------------");

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
