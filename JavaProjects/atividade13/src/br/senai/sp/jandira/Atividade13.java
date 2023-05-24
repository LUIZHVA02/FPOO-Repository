package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valorA, valorB, valorMaior, valorMenor;
		
		System.out.println("Digite dois valores abaixo.");
		System.out.println("          ");
		System.out.print("Digite o valor A: ");
		valorA = teclado.nextInt();
		
		System.out.print("Digite o valor B: ");
		valorB = teclado.nextInt();
		
		System.out.println("    ");
		
		if (valorA < valorB) {
			System.out.println("Os múltiplos de 6 entre " + valorA + " e " + valorB + " são: ");
		} else if (valorB<valorA) {
			System.out.println("Os múltiplos de 6 entre " + valorB + " e " + valorA + " são: ");
		}
		
		if (valorA < valorB) {
		valorMaior = valorB;
		valorMenor = valorA;	
			
		} 
		else {
		valorMaior = valorA;
		valorMenor = valorB;
		
		}
			
		int v = valorMenor;
		while (v <= valorMaior) {
			if (v % 6 == 0){
			System.out.println(v);
		}
		v++;
		}
	}
}
