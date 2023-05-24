package br.senai.sp.jandira;

public class Atividade18 {

	public static void main(String[] args) {
		
		int matrizB [] = new int[10];
		int matrizA [] = new int[10];
		matrizA[0] = 1;
		matrizA[1] = 12;
		matrizA[2] = 123;
		matrizA[3] = 134;
		matrizA[4] = 145;
		matrizA[5] = 156;
		matrizA[6] = 167;
		matrizA[7] = 178;
		matrizA[8] = 189;
		matrizA[9] = 19;
		
		for (int v = 0; v < matrizA.length;v++) {
			if(matrizA [v] % 2 == 0) {
				matrizB[v] = matrizA[v] * 5;
				System.out.println("o valor do vetor "+ (v + 1) +" é " + matrizB[v]);
				
			} else {
				matrizB[v] = matrizA[v] + 5;
				System.out.println("o valor do vetor "+ (v + 1) +" é " + matrizB[v]);

			}
		}
	}

}
