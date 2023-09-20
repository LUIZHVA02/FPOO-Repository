package br.senai.sp.jandira.model;

public class Conta {
    private String agencia;
    private int numeroConta;
    private double saldo = 5000.00;

    public void realizarSaque(double valorSaque){
        if(valorSaque > saldo) {
            System.out.println("O Valor Inserido é Inválido!!!\n " +
                               "Você não tem esse valor em sua conta");

            System.out.println("Seu saldo atual é "+ this.saldo);

        } else if (valorSaque < saldo) {
            this.saldo -= valorSaque;

            System.out.println("Seu saldo atual é "+ this.saldo);
        }

    }

    public void realizarDeposito(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Seu saldo atual é "+ this.saldo);
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é "+ this.saldo);

    }
}
