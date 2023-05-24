package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nomeComodo, continuar, sim, nao;
		double largura, comprimento, resultado;
		
		largura = teclado.nextDouble();
		comprimento = teclado.nextDouble();
		nomeComodo = teclado.nextLine();
		resultado = largura * comprimento;
		
		
		for() {
			
		System.out.println("Qual Cômodo Deseja Medir?");
		nomeComodo = teclado.nextLine();
		
		System.out.println("Qual a Largura do Cômodo?");
		largura = teclado.nextDouble();
		
		System.out.println("Qual o Comprimento do Cômodo?");
		comprimento = teclado.nextDouble();
		
		System.out.println("A Área do Seu Cômodo é " + resultado + "m");
		}
		
	}

}
