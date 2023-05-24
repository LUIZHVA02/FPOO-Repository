package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valorMin = 0, valorMax = 0, valorA = 0, 
				valorB = 0,  multiplicando = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("----------------TABUADAS----------------");
		System.out.println("----------------------------------------");
		System.out.println("                                        ");
		System.out.print("Qual Valor Inteiro Deseja Multiplicar: ");
		multiplicando = teclado.nextInt();
		System.out.print("Qual o Menor Valor Multiplicador: ");
		valorA = teclado.nextInt();
		System.out.print("Qual o Maior Valor Multiplicador: ");
		valorB = teclado.nextInt();
		System.out.println("                                       ");
		
		if (valorA > valorB) {
			valorMin = valorB;
			valorMax = valorA;
		}
		if (valorA < valorB) {
			valorMin = valorA;
			valorMax = valorB;
		}
		
		System.out.println("Tabuada do " + multiplicando);
		System.out.println("-----------------------------------");
		System.out.println("                                   ");
		
		while(valorMin <= valorMax) {
			System.out.println(multiplicando + " X " + valorMin + 
								" = " + valorMin*multiplicando);
			valorMin++;
		}
		

}
}
