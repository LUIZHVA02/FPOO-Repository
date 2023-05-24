package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Atividade10 {
	
	public static void main(String[] args) {
		String nome, strAltura, strPeso;
		double altura, peso, resultado;
		
		
		nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
		strAltura = JOptionPane.showInputDialog(null, "Qual é a sua altura em metros?");
		strPeso = JOptionPane.showInputDialog(null, "Qual é o seu peso em quilos?");
		
		altura = Double.parseDouble(strAltura);
		peso = Double.parseDouble(strPeso);
		resultado = (peso/(altura*altura));
		
		if (resultado<18.5) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está abaixo do seu peso normal.", "Seu IMC!", 0, null);
			} else if (resultado < 25.0) {
				JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está no seu peso normal.", "Seu IMC!", 0, null);
				} else if (resultado < 30.0) {
					JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está com sobrepeso.", "Seu IMC!", 0, null);
					} else if (resultado < 35.0) {
						JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está com obesidade nível I.", "Seu IMC!", 0, null);
						} else if (resultado < 40.0) {
							JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está com obesidde nível II.", "Seu IMC!", 0, null);
							} else if (resultado >= 40.0) {
								JOptionPane.showMessageDialog(null, nome + " seu IMC é " + resultado + ". \n Você está com obesidde nível III.", "Seu IMC!", 0, null);
								}
}
}
