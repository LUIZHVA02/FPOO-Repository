package br.senai.sp.jandira;

import java.util.Scanner;

public class QualSeuIMC {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá! Qual é o seu primeiro nome?");
		String nome;
		nome = teclado.next();
		
		System.out.println("Qual o seu peso em quilos?");
		double peso;
		peso = teclado.nextDouble();
		
		System.out.println("Qual a sua altura em metros?");
		double altura;
		altura = teclado.nextDouble();
		
		System.out.println( "Olá " + nome +  "!" + "Seu IMC é " + peso/Math.pow(altura,altura));
	}
}