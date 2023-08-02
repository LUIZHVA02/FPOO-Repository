package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Disciplina;
import br.senai.sp.jandira.model.Professor;

public class Main {
    public static void main(String[] args) {

       Professor prof1 = new Professor();
       Professor prof2 = new Professor();
       Professor prof3 = new Professor();

       prof1.nome = "João Pedro";
       prof1.matricula = 1212;

       prof2.nome = "Beatriz Gomes";
       prof2.matricula = 1313;

       prof3.nome = "Ana Maria";
       prof3.matricula = 1414;

       Disciplina matematica = new Disciplina();
       matematica.nome = "Matemática";
       matematica.cargaHoraria = 200;
       matematica.professores.add(prof1);
       matematica.professores.add(prof2);
       matematica.professores.add(prof3);

       String retorno = matematica.exibirDetalhes();

        System.out.println(retorno);
    }
}
