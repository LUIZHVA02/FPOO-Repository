package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {
    /* Declarar Variaveis */
    String scenarioBattle;
    Scanner teclado = new Scanner(System.in);

    /* Instância scenario */
    Scenario scenario = new Scenario();

    public Player BattleInfo(Player player, Enemy enemy){
        System.out.println(player);
        System.out.println(enemy);

        return player;
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
