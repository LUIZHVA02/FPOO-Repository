package br.senai.sp.jandira.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Voos {
    long numeroVoo, capacidadePassageiros;
    String origem, destino, companhia;
    String dataPartida   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String horaPartida   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public long getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(long numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public long getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(long capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
