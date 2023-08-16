package br.senai.sp.jandira.game.model;

public class Player {

    public String nome;
    public String skin;

    private int vidaPlayer;
    public Player(){
        vidaPlayer = 100;
    }
    public int getVidaPlayer(){
        return vidaPlayer;
    }
}
