package br.senai.sp.jandira.game.model;

import java.util.Locale;
import java.util.Scanner;
public class Register {
    Scanner teclado = new Scanner(System.in);

    int validaPrint = 0;

    /* Intância Player */
    Player player = new Player();

    /* Instância Enemy */
    Enemy enemy = new Enemy();

    /* Instância OutPut*/
    OutPut output = new OutPut();

    public void BothRegister(){
        validaPrint = 1;
            RegisterPlayer();
            RegisterEnemy();
            output.PrintPlayer(player);
            output.PrintEnemy(enemy);
    }
    public void RegisterPlayer(){


        /* Coleta de dados Player 1 */
        System.out.println("---------------- Cadastro Player ----------------");
        System.out.print("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.print("Escolha sua skin (RED - BLUE - PURPLE): ");
        player.skin = teclado.nextLine();
        System.out.println("--------- Player Cadastrado com Sucesso ---------");
        System.out.println(" ");

        if (validaPrint != 1){
        /* Printe as informações Cadastradas*/
        output.PrintPlayer(player);
        }

    }
    public void RegisterEnemy(){


        /* Coleta de dados Enemy 1 */
        System.out.println("---------------- Cadastro Enemy ----------------");
        System.out.print("Qual o nome do seu inimigo: ");
        enemy.nome = teclado.nextLine();
        System.out.print("Escolha a skin do inimigo (RED - BLUE - PURPLE): ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------- Enemy Cadastrado com Sucesso ---------");
        System.out.println(" ");

        if (validaPrint != 1){
        /* Printe as informações Cadastradas*/
        output.PrintEnemy(enemy);
        }

    }
    public void Decision(){
        String escolha;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println("O que você deseja cadastrar agora? \nAmbos, Player ou Enemy? ");
        escolha = teclado.nextLine();

        switch (escolha.toLowerCase()){

        case "player":
            RegisterPlayer();
            break;

        case "enemy":
            RegisterEnemy();
            break;

        case "ambos":
            BothRegister();
            default:
    }
        System.out.println("Deseja Cadastrar Novamente? Sim(1) Não(2)");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            Decision();
        }
    }
}

