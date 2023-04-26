package br.senai.sp.jandira;

import java.util.Scanner;

public class GasolinaOuAlcool {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 double pGasolina, pÁlcool;
		 
		 System.out.println("*******************************************************");
		 System.out.println("                   Gasolina ou Álcool                  ");
		 System.out.println("*******************************************************");
		 System.out.println(" ");
		 System.out.println("Qual o Preço da Gasolina? " );
		 pGasolina = teclado.nextDouble();
		 System.out.println("Qual o preço do Álcool? " );
		 pÁlcool = teclado.nextDouble();
		 System.out.println(" ");
		 System.out.println("*******************************************************");
		 System.out.println("  ");
		 
		 if(pGasolina*0.7<=pÁlcool) {
			System.out.println("No momento é mais vantajoso abastecer com GASOLINA!");
		 }
		 else {
			 System.out.println("No momento é mais vantajoso abastecer com Álcool!");
		 }
		 
		 System.out.println(" ");
		 System.out.println("*******************************************************");
	}

}
