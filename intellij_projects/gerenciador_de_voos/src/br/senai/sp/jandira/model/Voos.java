package br.senai.sp.jandira.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Voos {
    long numeroVoo, capacidadePassageiros;
    String origem, destino, companhia;
    LocalDateTime dataPartida;
    LocalTime horaPartida;

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

    public LocalDateTime getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDateTime dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }
}
