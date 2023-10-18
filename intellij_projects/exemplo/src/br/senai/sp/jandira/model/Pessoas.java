package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Pessoas{
    Scanner scanner = new Scanner(System.in);

    private String nome, apelido, endereco;
    private int idade;
    private long rg, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void printarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
    }

    public void falar(){
        System.out.println("A pessoa está falando...");
    }
}