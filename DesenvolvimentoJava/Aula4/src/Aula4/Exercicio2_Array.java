// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
// quantas foram as ocorr�ncias da maior pontua��o.

package Aula4;

import java.util.Scanner;

public class Exercicio2_Array {
	
	public static void main (String[] args) {
		
		int i,n=10; // --> indice ou posi��o
		int vet[] = new int[n],soma=0;
		
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			System.out.printf("Informe %2do. valor de %d: ",(i+1),n);
			vet[i] = ler.nextInt();
		}
		//Processamento: somar todos os valores, definir o maior e o menor valor
		int menor=vet[0],maior=vet[0];
		for(i=0;i<n;i++)//8 10 3
		{
			soma = soma + vet[i];
			if(vet[i]<menor)
			{
				menor = vet[i];//3
			}
			
			if(vet[i]>maior)
			{
				maior = vet[i];//10
			}
		}
		//Sa�da dos dados
		System.out.printf("\n");
		for(i=0;i<n;i++)
		{
			if(vet[i] == menor)
			{
				System.out.printf("Vet[%d] = %2d <-- Menor valor \n",i,vet[i]);
			}
			else if(vet[i] == maior)
			{
				System.out.printf("Vet[%d] = %2d <-- Maior valor \n",i,vet[i]);
			}
			else
			{
				System.out.printf("Vet[%d] = %2d\n",i,vet[i]);
			}
		}
		System.out.printf("\nSoma = %d\n",soma);
		
	}

}
