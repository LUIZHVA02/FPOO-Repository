package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Programador extends Funcionario{
    Scanner scanner = new Scanner(System.in);
    private double numeroHorasExtras=10.0;
    private double valorHoraExtra=150.0;

    public double getNumeroHorasExtras() {
        return numeroHorasExtras;
    }
    public void setNumeroHorasExtras(double numeroHorasExtras) {
        this.numeroHorasExtras = numeroHorasExtras;
    }
    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
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
        System.out.println("Digite o numero de horas extras:        ");
        double nHoraExtra = scanner.nextDouble();
        setNumeroHorasExtras(nHoraExtra);
        System.out.println("                                        ");
        System.out.println("Digite o valor da hora extra:           ");
        double valHoraExtra = scanner.nextDouble();
        setValorHoraExtra(valHoraExtra);
        scanner.nextLine();
        setSalario(getSalarioBase() + (getNumeroHorasExtras() * getValorHoraExtra()));
    }
}
