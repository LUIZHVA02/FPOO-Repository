package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade19 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int matrizA [] = new int[6];
		int matrizB [] = new int[6];
		int matrizC [] = new int[6];
		int vA = 0, user, vB = 0, vC = 0;
		
		System.out.println("Valores da Matriz A:");
		
		while(vA < matrizA.length) {
			System.out.print("Digite o valor " + (vA + 1) + " da Matriz A: ");
			matrizA[vA] = user = teclado.nextInt();
			vA++;
		}
		System.out.println(" ");
		System.out.println("Valores da Matriz B:");
		
		while(vB < matrizB.length) {
			System.out.print("Digite o valor " + (vB + 1) + " da Matriz B: ");
			matrizB[vB] = user = teclado.nextInt();
			vB++;
		}
		System.out.println(" ");
		System.out.println("Valores da Matriz C:");
		
		while(vC < matrizC.length) {
			matrizC[vC] = matrizA[vC] - matrizB[vC];
			System.out.print("O valor " + (vC + 1) + " da Matriz C: ");
			System.out.println(matrizC [vC]);
			vC++;
		}
		
	}
	
}
