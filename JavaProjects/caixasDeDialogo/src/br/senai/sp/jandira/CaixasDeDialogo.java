package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class CaixasDeDialogo {

	public static void main(String[] args) {
		
		//Caixas de Mensagem
		//JOptionPane.showMessageDialog(null, "Olá, Mundo!", "SENAI Jandira", -1, null);
		//JOptionPane.showMessageDialog(null, "Olá, Mundo!", "SENAI Jandira", 0, null);
		//JOptionPane.showMessageDialog(null, "Olá, Mundo!", "SENAI Jandira", 1, null);
		//JOptionPane.showMessageDialog(null, "Olá, Mundo!", "SENAI Jandira", 2, null);
		//JOptionPane.showMessageDialog(null, "Olá, Mundo!", "SENAI Jandira", 3, null);
		
		//Caixas de Entrada
		//String nome;
		//nome = JOptionPane.showInputDialog("Qual o seu nome?");
		//JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
		
		//Calculando a soma de dois números
		int valor1, valor2, resultado;
		String strValorA, strValorB;
		
		strValorA = JOptionPane.showInputDialog("Digite o valor A: ");
		valor1 = Integer.parseInt(strValorA);
		
		strValorB = JOptionPane.showInputDialog("Digite o valor B: ");
		valor2 = Integer.parseInt(strValorB);
		
		double valor3, valor4;
		String strValorC, strValorD;
		
		strValorC = JOptionPane.showInputDialog("Digite o valor C: ");
		valor3 = Double.parseDouble (strValorC);
		
		resultado = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, "A soma de A e B é " + resultado + "!");
	}

}
