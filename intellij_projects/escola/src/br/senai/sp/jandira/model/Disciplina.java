package br.senai.sp.jandira.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Disciplina {
    public String nome;
    public int cargaHoraria;
    public ArrayList<Professor> professores = new ArrayList<>();

    public String exibirDetalhes(){
        String detalhes = "Disciplina: ";
        detalhes = detalhes + nome + "\n";
        detalhes = detalhes + cargaHoraria  + " horas.\n";

        String profs = "";

        for(Professor p : professores){
            profs += p.nome + ", ";
        }

        detalhes += "Professores: " + profs;

        return detalhes;
    }
}
