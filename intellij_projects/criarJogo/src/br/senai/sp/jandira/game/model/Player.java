package br.senai.sp.jandira.game.model;

public class Player {

    public String nome;
    public String skin;

    private int vida;
    public Player(){
        vida = 100;
    }
    public int getVidaPlayer(){
        return vida;
    }

    public void subtrairVida (int danoEnemy){
        vida -= danoEnemy;

        if (vida < 0){
            vida = 0;
        }
    }
}