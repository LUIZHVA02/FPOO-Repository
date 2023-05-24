package br.senai.sp.jandira;

public class Atividade20 {

	public static void main(String[] args) {
		
		int matrizA [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int matrizB [] = new int [20];
		int mB = 0, vI=matrizA.length;
		System.out.println("Valores da Matriz A: ");
		while( mB < matrizA.length) {
			System.out.println("O valor "+ (mB +1) + " da matriz A é: " + matrizA[mB]);
			mB++;
			}
			System.out.println("  ");
			System.out.println("Valores da Matriz B: ");
			mB = 0;
		while( mB < matrizA.length) {
			matrizB[mB]= matrizA[vI -1];
			System.out.println("O valor "+ (mB +1) + " da matriz B é: " + matrizB[mB]);
			mB++;
			vI--;
		}
	}

}
