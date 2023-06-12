package br.senai.sp.jandira;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		double A = teclado.nextDouble();
		
		double B = 365;
		
		System.out.println("Você já viveu aproximadamente " + A*B + " dias!");
	}

}
