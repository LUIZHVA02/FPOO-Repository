package br.senai.sp.jandira;

public class MatrizMutidimencional {

	public static void main(String[] args) {
		String veiculos [][]= new String [5][4];
		veiculos [0][0]="Ka";
		veiculos [0][1]="Ford";
		veiculos [0][2]="2001";
		veiculos [0][3]="ABC1234";
		
		veiculos [1][0]="Palio";
		veiculos [1][1]="Fiat";
		veiculos [1][2]="2008";
		veiculos [1][3]="XXX6698";
		
		veiculos [2][0]="HB20";
		veiculos [2][1]="Hyundai";
		veiculos [2][2]="2020";
		veiculos [2][3]="PPP9658";
		
		veiculos [3][0]="Fusca";
		veiculos [3][1]="Volkswagen";
		veiculos [3][2]="1970";
		veiculos [3][3]="YYY7894";
		
		veiculos [4][0]="Camaro";
		veiculos [4][1]="Chevrolet";
		veiculos [4][2]="2022";
		veiculos [4][3]="HBX9965";
		
		System.out.printf("%-15s %-15s %-6s %-7s %n","|Modelo", "|Fabricante", "|Ano", "|Placa");
		System.out.println("------------------------------------------------------------------");
		for(int linha = 0;linha < veiculos.length;linha++) {
			System.out.printf("%-15s %-15 %-6 %7 %n","|"+ veiculos[linha][0],"|"+ veiculos[linha][1], "|"+ veiculos[linha][2],"|"+ veiculos[linha][3]);
		}
	}

}
