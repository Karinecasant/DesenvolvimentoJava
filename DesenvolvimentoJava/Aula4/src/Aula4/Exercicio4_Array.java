// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
// em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
// diagonal, ou seja, diagonal principal.

package Aula4;

import java.util.Scanner;

public class Exercicio4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int i,j,mat[][] = new int[2][4];
		
		Scanner ler = new Scanner (System.in);
		
		for(i=0;i<2;i++)
		{
			System.out.printf("Informe os elementos %da. linha: \n",(i+1));
			for(j=0;j<4;j++)
			{
				System.out.printf("Mat[%d] [%d] = ",i,j);
				mat[i][j] = ler.nextInt();
			}
		}
		System.out.printf("\n");
		
		for(i=0;i<2;i++)
		{
			System.out.printf(" %da. linha: ",(i+1));
			for(j=0;j<4;j++)
			{
				System.out.printf(" %d ",mat[i][j]);
			}
		}
	}

}

		
		