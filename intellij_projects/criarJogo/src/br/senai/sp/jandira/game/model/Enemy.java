package br.senai.sp.jandira.game.model;

public class Enemy {
    public String nome;
    public String skin;

    private int vidaEnemy;
    public Enemy(){
        vidaEnemy = 100;
    }
    public int getVidaPlayer(){
        return vidaEnemy;
    }
}
