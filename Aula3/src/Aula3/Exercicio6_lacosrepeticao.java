// 6 - Escrever um programa que receba v�rios n�meros inteiros no teclado. 
// E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

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
		System.out.println("M�dia dos n�meros m�ltiplos de 3: " + mediamult3);
	 }
   }
}