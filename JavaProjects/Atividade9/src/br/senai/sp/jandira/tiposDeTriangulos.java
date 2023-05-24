package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class tiposDeTriangulos {

	public static void main(String[] args) {

		String strValorA, strValorB, strValorC, triangulo = null;
		double valorA, valorB, valorC;

		strValorA = JOptionPane.showInputDialog(null, "Qual é o valor A? \n Favor digitar apenas números!");
		strValorB = JOptionPane.showInputDialog(null, "Qual é o valor B? \n Favor digitar apenas números!");
		strValorC = JOptionPane.showInputDialog(null, "Qual é o valor C? \n Favor digitar apenas números!");

		valorA = Double.parseDouble(strValorA);
		valorB = Double.parseDouble(strValorB);
		valorC = Double.parseDouble(strValorC);

		if (valorA == valorB && valorB == valorC) {
			triangulo = "Equilátero";
		
		} else if (valorA == valorB && valorB != valorC && valorA != valorB && valorC == valorB) {
				triangulo = "Isósceles";
			
			} else if (valorA != valorB && valorB != valorC && valorA != valorC) {
					triangulo = "Escaleno";
					
				} else {}
		
		if (((valorA + valorB > valorC) && valorB + valorC > valorA) && valorA + valorC > valorB) {
			JOptionPane.showMessageDialog(null, "Esse triângulo é um triângulo " + triangulo, "Tipos de Triângulo", 0, null);
		} else {
			JOptionPane.showMessageDialog(null, "Esses valores não formam um triângulo!", "Tipos de Triângulo", 0, null);

		}
	}

}
