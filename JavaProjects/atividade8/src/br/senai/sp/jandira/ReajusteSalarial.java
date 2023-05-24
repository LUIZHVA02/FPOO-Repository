package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class ReajusteSalarial {

	public static void main(String[] args) {
		String nome, strSalario;
		double salario;
		
		nome = JOptionPane.showInputDialog(null, "Digite o seu nome completo");
		strSalario = JOptionPane.showInputDialog(null, "Digite o seu salário atual: \n (Favor digitar apenas números)");
		
		salario = Double.parseDouble(strSalario);
		if(salario<1500){
			JOptionPane.showMessageDialog(null, "Olá " + nome + " seu novo salário é " + (salario*15/100+salario) + ". \n Seu reajuste foi de 15%, R$" + (salario*15/100), "Reajuste Salarial", 0, null);
		}
		else {
			if(salario<3000) {
			JOptionPane.showMessageDialog(null, "Olá " + nome + " seu novo salário é " + (salario*10/100+salario) + ". \n Seu reajuste foi de 10%, R$" + (salario*10/100), "Reajuste Salarial", 0, null);
			} 
			else {
				if(salario>3000) {
					JOptionPane.showMessageDialog(null, "Olá " + nome + " seu novo salário é " + (salario*05/100+salario)+ ". \n Seu reajuste foi de 5%, R$" + (salario*5/100), "Reajuste Salarial", 0, null);
				}
			}
		}
	}
}
