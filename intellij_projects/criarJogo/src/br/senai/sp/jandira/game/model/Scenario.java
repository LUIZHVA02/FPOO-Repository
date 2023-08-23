package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Scenario {

    public String Scenario(int scenarioChoice) {
        Scanner teclado = new Scanner(System.in);
        String scenario= "Senai Jandira";

        switch (scenarioChoice) {
            case 1:
                scenario =  "Torre Eiffel";
            break;

            case 2:
                scenario = "Arabia - [Junto com o Neymar]";
            break;

            case 3:
                scenario = "Turquia";
            break;
        }

        return scenario;
    }
}
