//1.Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
//  Encontre ap�s a maior pontua��o e a apresente. 

package Aula4;

import java.util.Scanner;

public class Exercicio1_Array {
	
	public static void main (String[] args) {
		
		float [] vetor;
		float maior;
		
			vetor = new float [5];
			maior = 0;
			
			for (int i = 0; i < 5; i++) {
				System.out.print ("Digite o " + (i+1) + "� valor: ");
				vetor[i] = new Scanner(System.in).nextFloat();
				
				if (vetor [i] > maior) {
					maior = vetor[i];
					
				}
 			}
			
			System.out.println("O maior valor �: " + maior);
					
		}
		
	 
	}


