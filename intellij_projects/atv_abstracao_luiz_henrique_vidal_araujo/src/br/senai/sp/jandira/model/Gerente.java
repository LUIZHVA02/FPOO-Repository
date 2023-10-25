package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Gerente extends Funcionario{
    Scanner scanner = new Scanner(System.in);
    private double bonusGerencia;

    public double getBonusGerencia() {
        return bonusGerencia;
    }
    public void setBonusGerencia(double bonusGerencia) {
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public void calcularSalario(){
        System.out.println("Digite o valor do salário base:         ");
        double salBase = scanner.nextDouble();
        setSalarioBase(salBase);
        System.out.println("                                        ");
        System.out.println("Digite o valor do bônus de gerência:    ");
        double bonGerencia = scanner.nextDouble();
        scanner.nextLine();
        setBonusGerencia(bonGerencia);
        setSalario(getSalarioBase() + getBonusGerencia());
    }
}
