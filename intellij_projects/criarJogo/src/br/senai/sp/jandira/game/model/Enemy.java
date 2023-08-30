package br.senai.sp.jandira.game.model;

public class Enemy {

    public String nome;
    public String skin;

    private int vida;
    public Enemy(){
        vida = 100;
    }
    public int getVidaEnemy(){
        return vida;
    }

    public void subtrairVida (int danoPlayer){
        vida -= danoPlayer;

        if (vida < 0){
            vida = 0;
        }
    }
}