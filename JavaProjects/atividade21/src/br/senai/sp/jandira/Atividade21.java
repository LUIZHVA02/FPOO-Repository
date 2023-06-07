package br.senai.sp.jandira;
import java.util.Scanner;
public class Atividade21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int maxAlunos;
		
		String alunos [][] = new String [35][2];
		
		alunos[00][00] = "Simon"; 
		alunos[01][00] = "Simon"; 
		alunos[02][00] = "Simon"; 
		alunos[03][00] = "Simon";
		alunos[04][00] = "Simon"; 
		alunos[05][00] = "Simon"; 
		alunos[06][00] = "Simon"; 
		alunos[07][00] = "Simon";
		alunos[ 8][00] = "Simon";  
		alunos[ 9][00] = "Simon";  
		alunos[10][00] = "Simon"; 
		alunos[11][00] = "Simon";
		alunos[12][00] = "Simon"; 
		alunos[13][00] = "Simon"; 
		alunos[14][00] = "Simon"; 
		alunos[15][00] = "Simon";
		alunos[16][00] = "Simon"; 
		alunos[17][00] = "Simon"; 
		alunos[18][00] = "Simon"; 
		alunos[19][00] = "Simon";
		alunos[20][00] = "Simon"; 
		alunos[21][00] = "Simon"; 
		alunos[22][00] = "Simon"; 
		alunos[23][00] = "Simon";
		alunos[24][00] = "Simon"; 
		alunos[25][00] = "Simon"; 
		alunos[26][00] = "Simon"; 
		alunos[27][00] = "Simon";
		alunos[28][00] = "Simon"; 
		alunos[29][00] = "Simon"; 
		alunos[30][00] = "Simon"; 
		alunos[31][00] = "Simon";
		alunos[32][00] = "Simon"; 
		alunos[33][00] = "Simon"; 
		alunos[34][00] = "Simon";
		
		alunos[00][01] = "Aprovado"; 
		alunos[01][01] = "Aprovado"; 
		alunos[02][01] = "Aprovado"; 
		alunos[03][01] = "Aprovado";
		alunos[04][01] = "Aprovado"; 
		alunos[05][01] = "Aprovado"; 
		alunos[06][01] = "Aprovado"; 
		alunos[07][01] = "Aprovado";
		alunos[ 8][01] = "Aprovado";  
		alunos[ 9][01] = "Aprovado";  
		alunos[10][01] = "Aprovado"; 
		alunos[11][01] = "Aprovado";
		alunos[12][01] = "Aprovado"; 
		alunos[13][01] = "Aprovado"; 
		alunos[14][01] = "Aprovado"; 
		alunos[15][01] = "Aprovado";
		alunos[16][01] = "Aprovado"; 
		alunos[17][01] = "Aprovado"; 
		alunos[18][01] = "Aprovado"; 
		alunos[19][01] = "Aprovado";
		alunos[20][01] = "Aprovado"; 
		alunos[21][01] = "Aprovado"; 
		alunos[22][01] = "Aprovado"; 
		alunos[23][01] = "Aprovado";
		alunos[24][01] = "Aprovado"; 
		alunos[25][01] = "Aprovado"; 
		alunos[26][01] = "Aprovado"; 
		alunos[27][01] = "Aprovado";
		alunos[28][01] = "Aprovado"; 
		alunos[29][01] = "Aprovado"; 
		alunos[30][01] = "Aprovado"; 
		alunos[31][01] = "Aprovado";
		alunos[32][01] = "Aprovado"; 
		alunos[33][01] = "Aprovado"; 
		alunos[34][01] = "Aprovado";
		
		double notasAlunos [][] = new double [35][4];
		notasAlunos[00][00] = 1; 
		notasAlunos[01][00] = 1; 
		notasAlunos[02][00] = 1; 
		notasAlunos[03][00] = 1;
		notasAlunos[04][00] = 1; 
		notasAlunos[05][00] = 1; 
		notasAlunos[06][00] = 1;
		notasAlunos[07][00] = 1;
		notasAlunos[ 8][00] = 1;  
		notasAlunos[ 9][00] = 1;  
		notasAlunos[10][00] = 1; 
		notasAlunos[11][00] = 1;
		notasAlunos[12][00] = 1; 
		notasAlunos[13][00] = 1; 
		notasAlunos[14][00] = 1; 
		notasAlunos[15][00] = 1;
		notasAlunos[16][00] = 1; 
		notasAlunos[17][00] = 1; 
		notasAlunos[18][00] = 1; 
		notasAlunos[19][00] = 1;
		notasAlunos[20][00] = 1; 
		notasAlunos[21][00] = 1; 
		notasAlunos[22][00] = 1; 
		notasAlunos[23][00] = 1;
		notasAlunos[24][00] = 1; 
		notasAlunos[25][00] = 1; 
		notasAlunos[26][00] = 1; 
		notasAlunos[27][00] = 1;
		notasAlunos[28][00] = 1; 
		notasAlunos[29][00] = 1; 
		notasAlunos[30][00] = 1; 
		notasAlunos[31][00] = 1;
		notasAlunos[32][00] = 1; 
		notasAlunos[33][00] = 1; 
		notasAlunos[34][00] = 1;
		
		notasAlunos[00][01] = 1; 
		notasAlunos[01][01] = 1; 
		notasAlunos[02][01] = 1; 
		notasAlunos[03][01] = 1;
		notasAlunos[04][01] = 1; 
		notasAlunos[05][01] = 1; 
		notasAlunos[06][01] = 1;
		notasAlunos[07][01] = 1;
		notasAlunos[ 8][01] = 1;  
		notasAlunos[ 9][01] = 1;  
		notasAlunos[10][01] = 1; 
		notasAlunos[11][01] = 1;
		notasAlunos[12][01] = 1; 
		notasAlunos[13][01] = 1; 
		notasAlunos[14][01] = 1; 
		notasAlunos[15][01] = 1;
		notasAlunos[16][01] = 1; 
		notasAlunos[17][01] = 1; 
		notasAlunos[18][01] = 1; 
		notasAlunos[19][01] = 1;
		notasAlunos[20][01] = 1; 
		notasAlunos[21][01] = 1; 
		notasAlunos[22][01] = 1; 
		notasAlunos[23][01] = 1;
		notasAlunos[24][01] = 1; 
		notasAlunos[25][01] = 1; 
		notasAlunos[26][01] = 1; 
		notasAlunos[27][01] = 1;
		notasAlunos[28][01] = 1; 
		notasAlunos[29][01] = 1; 
		notasAlunos[30][01] = 1; 
		notasAlunos[31][01] = 1;
		notasAlunos[32][01] = 1; 
		notasAlunos[33][01] = 1; 
		notasAlunos[34][01] = 1;
		
		notasAlunos[00][02] = 1; 
		notasAlunos[01][02] = 1; 
		notasAlunos[02][02] = 1; 
		notasAlunos[03][02] = 1;
		notasAlunos[04][02] = 1; 
		notasAlunos[05][02] = 1; 
		notasAlunos[06][02] = 1;
		notasAlunos[07][02] = 1;
		notasAlunos[ 8][02] = 1;  
		notasAlunos[ 9][02] = 1;  
		notasAlunos[10][02] = 1; 
		notasAlunos[11][02] = 1;
		notasAlunos[12][02] = 1; 
		notasAlunos[13][02] = 1; 
		notasAlunos[14][02] = 1; 
		notasAlunos[15][02] = 1;
		notasAlunos[16][02] = 1; 
		notasAlunos[17][02] = 1; 
		notasAlunos[18][02] = 1; 
		notasAlunos[19][02] = 1;
		notasAlunos[20][02] = 1; 
		notasAlunos[21][02] = 1; 
		notasAlunos[22][02] = 1; 
		notasAlunos[23][02] = 1;
		notasAlunos[24][02] = 1; 
		notasAlunos[25][02] = 1; 
		notasAlunos[26][02] = 1; 
		notasAlunos[27][02] = 1;
		notasAlunos[28][02] = 1; 
		notasAlunos[29][02] = 1; 
		notasAlunos[30][02] = 1; 
		notasAlunos[31][02] = 1;
		notasAlunos[32][02] = 1; 
		notasAlunos[33][02] = 1; 
		notasAlunos[34][02] = 1;
		
		notasAlunos[00][03] = 1; 
		notasAlunos[01][03] = 1; 
		notasAlunos[02][03] = 1; 
		notasAlunos[03][03] = 1;
		notasAlunos[04][03] = 1; 
		notasAlunos[05][03] = 1; 
		notasAlunos[06][03] = 1;
		notasAlunos[07][03] = 1;
		notasAlunos[ 8][03] = 1;  
		notasAlunos[ 9][03] = 1;  
		notasAlunos[10][03] = 1; 
		notasAlunos[11][03] = 1;
		notasAlunos[12][03] = 1; 
		notasAlunos[13][03] = 1; 
		notasAlunos[14][03] = 1; 
		notasAlunos[15][03] = 1;
		notasAlunos[16][03] = 1; 
		notasAlunos[17][03] = 1; 
		notasAlunos[18][03] = 1; 
		notasAlunos[19][03] = 1;
		notasAlunos[20][03] = 1; 
		notasAlunos[21][03] = 1; 
		notasAlunos[22][03] = 1; 
		notasAlunos[23][03] = 1;
		notasAlunos[24][03] = 1; 
		notasAlunos[25][03] = 1; 
		notasAlunos[26][03] = 1; 
		notasAlunos[27][03] = 1;
		notasAlunos[28][03] = 1; 
		notasAlunos[29][03] = 1; 
		notasAlunos[30][03] = 1; 
		notasAlunos[31][03] = 1;
		notasAlunos[32][03] = 1; 
		notasAlunos[33][03] = 1; 
		notasAlunos[34][03] = 1;
		
		double mediaAlunos[][]= new double [35][1];
		mediaAlunos[00][00] = 1; 
		mediaAlunos[01][00] = 1; 
		mediaAlunos[02][00] = 1; 
		mediaAlunos[03][00] = 1;
		mediaAlunos[04][00] = 1; 
		mediaAlunos[05][00] = 1; 
		mediaAlunos[06][00] = 1;
		mediaAlunos[07][00] = 1;
		mediaAlunos[ 8][00] = 1;  
		mediaAlunos[ 9][00] = 1;  
		mediaAlunos[10][00] = 1; 
		mediaAlunos[11][00] = 1;
		mediaAlunos[12][00] = 1; 
		mediaAlunos[13][00] = 1; 
		mediaAlunos[14][00] = 1; 
		mediaAlunos[15][00] = 1;
		mediaAlunos[16][00] = 1; 
		mediaAlunos[17][00] = 1; 
		mediaAlunos[18][00] = 1; 
		mediaAlunos[19][00] = 1;
		mediaAlunos[20][00] = 1; 
		mediaAlunos[21][00] = 1; 
		mediaAlunos[22][00] = 1; 
		mediaAlunos[23][00] = 1;
		mediaAlunos[24][00] = 1; 
		mediaAlunos[25][00] = 1; 
		mediaAlunos[26][00] = 1; 
		mediaAlunos[27][00] = 1;
		mediaAlunos[28][00] = 1; 
		mediaAlunos[29][00] = 1; 
		mediaAlunos[30][00] = 1; 
		mediaAlunos[31][00] = 1;
		mediaAlunos[32][00] = 1; 
		mediaAlunos[33][00] = 1; 
		mediaAlunos[34][00] = 1;
		
		
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

			for(int aL = 0; aL < maxAlunos;aL++) {
				System.out.println("Digite o nome do aluno(a) " + (aL+1));
				alunos[aL][0]=teclado.next();
			}
			
			for(int nA = 0;nA < 4; nA++) {
				System.out.println("Digite a " + (nA+1) + "º nota bimestral do aluno(a): " + (alunos [0][0]));
				notasAlunos[0][nA]=teclado.nextDouble();
			}
			for(int nA = 0;nA < 4; nA++) {
				System.out.println("Digite a " + (nA+1) + "º nota bimestral do aluno(a): " + (alunos [1][0]));
				notasAlunos[1][nA]=teclado.nextDouble();
			}
			for(int nA = 0;nA < 4; nA++) {
				System.out.println("Digite a " + (nA+1) + "º nota bimestral do aluno(a): " + (alunos [2][0]));
				notasAlunos[2][nA]=teclado.nextDouble();
			}
			for(int nA = 0;nA < 4; nA++) {
				System.out.println("Digite a " + (nA+1) + "º nota bimestral do aluno(a): " + (alunos [3][0]));
				notasAlunos[3][nA]=teclado.nextDouble();
			}
			int mdAL = 0;
			while (mdAL < maxAlunos) {
			mediaAlunos[mdAL][0] = (notasAlunos[mdAL][0] + notasAlunos[mdAL][1] + notasAlunos[mdAL][2]+ notasAlunos[mdAL][3])/4 ;
			mdAL++;
			}
			for (int mxA = 0;mxA < maxAlunos; mxA++) {
			if (mediaAlunos[0][maxAlunos] >= 5){
				alunos[maxAlunos][1] = "Aprovado"; 
			} else if (mediaAlunos[0][maxAlunos] < 5){
				alunos[maxAlunos][1] = "Reprovado"; 
			}
			}
			System.out.printf("%-20s %-9s %-9s %-9s %-9s %-9s %-10s %n","|Nome", "|Nota 1", "|Nota 2", "|Nota 3", "|Nota 4", "|Média", "|Situação|");
			System.out.println("------------------------------------------------------------------");
			int maxA = 0;
			for(;maxA < maxAlunos;maxA++) {
				System.out.printf("%-20s %-9s %-9s %-9s %-9s %-9s %-10s %n","|"+ alunos[maxA][0],"|"+ notasAlunos[maxA][0],
																			"|"+ notasAlunos[maxA][1],"|"+ notasAlunos[maxA][2],
																			"|"+ notasAlunos[maxA][3],"|"+ mediaAlunos[maxA][0],
																			"|"+ alunos[maxA][1] +"|");
			}
		

}
}

