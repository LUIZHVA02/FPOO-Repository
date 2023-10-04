package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String agencia = "1234-XX";
    private int numeroConta;
    private double saldo = 0;
    private Cliente cliente;

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void adicionarContaList(Conta conta){
        listConta.add(conta);
    }
    public void gerarConta(Cliente cliente){
        numeroConta = (int) (Math.random()*10000);
        this.cliente = cliente;
    }
    List <Conta> listConta = new ArrayList<>();
    public Conta pesquisarConta(long cpf){
        for (Conta conta : listConta) {
            long validaCPFConta = conta.cliente.getCpf();
            if(validaCPFConta == numeroConta){
                return conta;
            }
        }
        return null;
    }
    public void listarContas(){
        for (Conta conta : listConta) {
            System.out.println(conta.numeroConta);
        }
    }

    public void realizarSaque(double valorSaque){
        if(this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("Seu saldo atual é "+ this.saldo);

        } else {
            System.out.println("Insira um valor válido...");
        }

    }

    public void realizarDeposito(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Seu saldo atual é "+ this.saldo);
    }

    public void realizarTransferencia (double valorTransferencia){

    }
}
