package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade21 {

	private static String S;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int maxAlunos;

		String alunos[][] = new String[35][2];

		alunos[00][00] = "Simon";
		alunos[01][00] = "Simon";
		alunos[02][00] = "Simon";
		alunos[03][00] = "Simon";
		alunos[04][00] = "Simon";
		alunos[05][00] = "Simon";

		alunos[00][01] = "Aprovado";
		alunos[01][01] = "Aprovado";
		alunos[02][01] = "Aprovado";
		alunos[03][01] = "Aprovado";
		alunos[04][01] = "Aprovado";
		alunos[05][01] = "Aprovado";

		double notasAlunos[][] = new double[35][4];
		notasAlunos[00][00] = 1;
		notasAlunos[01][00] = 1;
		notasAlunos[02][00] = 1;
		notasAlunos[03][00] = 1;
		notasAlunos[04][00] = 1;
		notasAlunos[05][00] = 1;

		notasAlunos[00][01] = 1;
		notasAlunos[01][01] = 1;
		notasAlunos[02][01] = 1;
		notasAlunos[03][01] = 1;
		notasAlunos[04][01] = 1;
		notasAlunos[05][01] = 1;

		notasAlunos[00][02] = 1;
		notasAlunos[01][02] = 1;
		notasAlunos[02][02] = 1;
		notasAlunos[03][02] = 1;
		notasAlunos[04][02] = 1;
		notasAlunos[05][02] = 1;

		notasAlunos[00][03] = 1;
		notasAlunos[01][03] = 1;
		notasAlunos[02][03] = 1;
		notasAlunos[03][03] = 1;
		notasAlunos[04][03] = 1;
		notasAlunos[05][03] = 1;

		double mediaAlunos[][] = new double[35][1];
		mediaAlunos[00][00] = 1;
		mediaAlunos[01][00] = 1;
		mediaAlunos[02][00] = 1;
		mediaAlunos[03][00] = 1;
		mediaAlunos[04][00] = 1;
		mediaAlunos[05][00] = 1;

		System.out.println("-----------------------------------------------");
		System.out.println("---------------- Notas Finais -----------------");
		System.out.println("-----------------------------------------------");
		System.out.println("                                               ");
		System.out.println("Digite o número de alunos que deseja registrar: \nOBS: Escolha um número entre 1 e 35");
		maxAlunos = teclado.nextInt();

		while (maxAlunos > 35) {
			System.out.println("Número inválido!");
			System.out.println("Digite outro valor:");
			maxAlunos = teclado.nextInt();
		}
		while (maxAlunos <= 0) {
			System.out.println("Número inválido!");
			System.out.println("Digite outro valor:");
			maxAlunos = teclado.nextInt();
		}

		for (int aL = 0; aL < maxAlunos; aL++) {
			System.out.print("Digite o nome do aluno(a) " + (aL + 1)+": ");
			alunos[aL][0] = teclado.next();
		}
		for (int nA = 0; nA < maxAlunos; nA++) {
			System.out.println("                                               ");
			System.out.println("Notas do aluno(a): " + (alunos[nA][0]));
			System.out.println("                                               ");
			System.out.print("Digite a 1º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][0] = teclado.nextDouble();
			System.out.print("Digite a 2º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][1] = teclado.nextDouble();
			System.out.print("Digite a 3º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][2] = teclado.nextDouble();
			System.out.print("Digite a 4º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][3] = teclado.nextDouble();
			System.out.println("                                               ");
		}
		System.out.println("Cadastrar outro aluno(a)? (S)Sim (N)Não");
		String resposta = teclado.next();

		for (String r = resposta; "Sin".equals(r) || "Sim".equals(r) || "S".equals(r) || "sin".equals(r)
				|| "sim".equals(r) || "s".equals(r) || "Yes".equals(r) || "Ies".equals(r) || "Y".equals(r)
				|| "yes".equals(r) || "ies".equals(r) || "y".equals(r); maxAlunos++) {

			int aL = maxAlunos;
			System.out.println("Digite o nome do aluno(a) " + (aL + 1));
			alunos[aL][0] = teclado.next();

			int nA = aL;
			System.out.println("                                               ");
			System.out.println("Notas do aluno(a): " + (alunos[nA][0]));
			System.out.println("                                               ");
			System.out.print("Digite a 1º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][0] = teclado.nextDouble();
			System.out.print("Digite a 2º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][1] = teclado.nextDouble();
			System.out.print("Digite a 3º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][2] = teclado.nextDouble();
			System.out.print("Digite a 4º nota bimestral do aluno(a) " + (alunos[nA][0]) + ": ");
			notasAlunos[nA][3] = teclado.nextDouble();
			System.out.println("                                               ");

			System.out.println("                                       ");
			System.out.println("Cadastrar outro aluno(a)? (S)Sim (N)Não");
			r = teclado.next();

		}

		System.out.println("                                                                                   ");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("|                               Média Final Da Turma                              |");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.printf("%-20s %-9s %-9s %-9s %-9s %-9s %-10s %n", "|Nome", "|Nota 1", "|Nota 2", "|Nota 3",
				"|Nota 4", "|Média", "| Situação |");
		System.out.println("+---------------------------------------------------------------------------------+");
		for (int mxA = 0; mxA < maxAlunos; mxA++) {

			mediaAlunos[mxA][0] = (notasAlunos[mxA][0] + notasAlunos[mxA][1] + notasAlunos[mxA][2]
					+ notasAlunos[mxA][3]) / 4;

			if (mediaAlunos[mxA][0] >= 5) {
				alunos[mxA][1] = " Aprovado ";
			} else if (mediaAlunos[mxA][0] < 5) {
				alunos[mxA][1] = "Reprovado ";
			}

			System.out.printf("%-20s %-9s %-9s %-9s %-9s %-9s %-10s %n", "|" + alunos[mxA][0],
					"|" + notasAlunos[mxA][0], "|" + notasAlunos[mxA][1], "|" + notasAlunos[mxA][2],
					"|" + notasAlunos[mxA][3], "|" + mediaAlunos[mxA][0], "|" + alunos[mxA][1] + "|");

		}
		System.out.println("+---------------------------------------------------------------------------------+");

	}
}