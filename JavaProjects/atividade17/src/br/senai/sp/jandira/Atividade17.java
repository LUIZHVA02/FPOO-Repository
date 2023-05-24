package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		double valores [] = new double [6];
		double somaDosValores = 0;
		
		
		
		System.out.println("Digite os 6 valores desejados");
		System.out.print("Digite o valor 1: ");
		valores [0] = teclado.nextDouble();
		System.out.print("Digite o valor 2: ");
		valores [1] = teclado.nextDouble();		
		System.out.print("Digite o valor 3: ");
		valores [2] = teclado.nextDouble();
		System.out.print("Digite o valor 4: ");
		valores [3] = teclado.nextDouble();
		System.out.print("Digite o valor 5: ");
		valores [4] = teclado.nextDouble();
		System.out.print("Digite o valor 6: ");
		valores [5] = teclado.nextDouble();
		
		for (int v = 0; v < valores.length; v++) {
			if (valores[0] % 2 == 1)
				somaDosValores += valores [v]; {
				
			}
			System.out.println(somaDosValores);
		}

	}

}
