package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int repetições;
		int i = 0;
		String frase;
		
		System.out.println("Qual é o nome ou qual é a frase?  ");
		frase = teclado.next();
		
		System.out.print("Quantas vezes você quer que seu nome ou a frase se repita na tela?  ");
		repetições = teclado.nextInt();
		
		while (i < repetições){
			System.out.println(frase);
			i++;
		}
		
	}

}
