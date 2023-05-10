package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valorMin, valorMax, valorA, valorB, valor1, valor2, multiplicando;
		
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
			valorMin = valorA;
			valorMax = valorB;
		}
		else {
			valorMax = valorA;
			valorMin = valorB;
		}
		
		System.out.println("Tabuada do " + multiplicando);
		System.out.println("-----------------------------------");
		System.out.println("                                   ");
		
		valor1 = multiplicando * valorA;
		valor2 = multiplicando * valorB;
		
		while (valor1 != valor2) {
			System.out.println(multiplicando * valorMin);
		
			valorMin++;
			}
		

}
}
