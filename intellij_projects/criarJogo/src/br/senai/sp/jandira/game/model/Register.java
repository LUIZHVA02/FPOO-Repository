package br.senai.sp.jandira.game.model;

import java.util.Scanner;
public class Register {
    Scanner teclado = new Scanner(System.in);
    public void BothRegister(){
        RegisterPlayer();
        RegisterEnemy();
    }
    public void RegisterPlayer(){
        /* Intância Player */
        Player player = new Player();

        /* Coleta de dados Player 1 */
        System.out.println("---------------- Cadastro Player ----------------");
        System.out.println("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (RED - BLUE - PURPLE): ");
        player.skin = teclado.nextLine();
        System.out.println("--------- Player Cadastrado com Sucesso ---------");
        System.out.println("");

    }
    public void RegisterEnemy(){

        /* Instância Enemy */
        Enemy enemy = new Enemy();

        /* Coleta de dados Enemy 1 */
        System.out.println("---------------- Cadastro Enemy ----------------");
        System.out.println("Qual o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (RED - BLUE - PURPLE): ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------- Enemy Cadastrado com Sucesso ---------");
    }
    public void Decision(){
        String escolha;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println("O que você deseja cadastrar primeiro? Ambos, Player ou Enemy? ");
        escolha = teclado.nextLine();

        switch (escolha){

        case "Player":
            RegisterPlayer();
            break;

        case "Enemy":
            RegisterEnemy();
            break;

            case "Ambos":
                BothRegister();
            default:
    }}
}

