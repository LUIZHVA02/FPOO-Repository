package br.senai.sp.jandira.game.model;

import br.senai.sp.jandira.game.model.Register;

public class OutPut {

    public void PrintPlayer(Player player){

        int playerVida = player.getVidaPlayer();

        /* Printar informações*/
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("-----------------Player-----------------");
        System.out.println("O Nome do Player é: " + player.nome);
        System.out.println("A Skin do seu Player é: " + player.skin);
        System.out.println("A Vida do Player é: " + playerVida);
        System.out.println("----------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }

    public void PrintEnemy(Enemy enemy){

        int enemyVida = enemy.getVidaEnemy();

        /* Printar informações*/
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("-----------------Enemy-----------------");
        System.out.println("O Nome do Inimigo é: " + enemy.nome);
        System.out.println("A skin do seu Inimigo é: " + enemy.skin);
        System.out.println("A Vida do Inimigo é: " + enemyVida);
        System.out.println("----------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }

}
