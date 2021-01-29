// 6 - Escrever um programa que receba vários números inteiros no teclado. 
// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

package Aula3;

import java.util.Scanner;

public class Exercicio6_lacosrepeticao {

	public static void main (String args [])
	{
		int x=0;
		float mediamult3,somamult3=0,contmult3=0;
		
		try (Scanner ler = new Scanner(System.in)) {

		do
		{
			System.out.println("Entre com um numero: ");
			x = ler.nextInt();
			if(x!=0)
			{
				if(x%3==0)
				{
				somamult3 = somamult3 + x;
				contmult3++;
				}
			}
		}
		while(x!=0);
		mediamult3 = somamult3 / contmult3;
		System.out.println("Média dos números múltiplos de 3: " + mediamult3);
	 }
   }
}