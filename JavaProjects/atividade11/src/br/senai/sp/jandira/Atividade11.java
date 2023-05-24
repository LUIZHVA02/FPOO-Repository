package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int pedra = 1, papel = 2, tesoura = 3;
		int usuario = 0;
		int pc = 0;
		

		
		System.out.println("---------------------------------------");
		System.out.println("          J  O  K  E  N  P  Ô          ");
		System.out.println("---------------------------------------");
		System.out.println("                                       ");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("                                       ");
		System.out.println("---------------------------------------");
		System.out.println("                                       ");
		System.out.println("      Faça a sua escolha (1 à 3)?      ");
		System.out.println("                                       ");
		System.out.print("Digite sua escolha: ");
		
		usuario = teclado.nextInt();
		
		if (usuario <= 0  || usuario >= 4) {
			System.out.println("                                       ");
			System.out.println("O valor inserido é inválido!");
			System.out.println("                                       ");
			System.out.println("---------------------------------------");
			System.out.println("--------------FIM DE JOGO--------------");
			System.out.println("---------------------------------------");
		}
		else if (usuario < tesoura || usuario > pedra) {
		System.out.println("                                       ");
		if (usuario == pedra){
		System.out.println("Você escolheu ----> Pedra!");
		} else if (usuario == papel){
				System.out.println("Você escolheu ----> Papel!");
					} else if (usuario == tesoura){
						System.out.println("Você escolheu ----> Tesoura!");
							}
		if (pc == 0) {
		pc = gerador.nextInt(3)+1;
		if (pc == pedra){
			System.out.println("O PC escolheu ----> Pedra!");
				} else if (pc == papel){
					System.out.println("O PC escolheu ----> Papel!");
						} else if (pc == tesoura){
							System.out.println("O PC escolheu ----> Tesoura!");
								}
		}
		
		if (usuario == pc){
			System.out.println("                                       ");
			System.out.println("---------------------------------------");
			System.out.println("-----------QUE INTERESSANTE!-----------");
			System.out.println("--------PARECE QUE VOCÊ EMPATOU!-------");
			System.out.println("---------------------------------------");
		}
			else if (usuario == pedra && pc == papel || usuario == papel && pc == tesoura || usuario == tesoura && pc == pedra ){
				System.out.println("                                       ");

				System.out.println("---------------------------------------");
				System.out.println("---------------QUE PENA!---------------");
				System.out.println("--------------VOCÊ PERDEU!-------------");
				System.out.println("---------------------------------------");
			} else if (pc == pedra && usuario == papel || pc == papel && 
						usuario == tesoura || pc == tesoura && usuario == pedra ){
				System.out.println("                                       ");
				System.out.println("---------------------------------------");
				System.out.println("---------------PARABÉNS!---------------");
				System.out.println("-------------VOCÊ VENCEU!--------------");
				System.out.println("---------------------------------------");
			}
		}		
}

}
