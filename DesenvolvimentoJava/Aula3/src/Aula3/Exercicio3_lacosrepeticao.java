// 3 -Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99 (WHILE)

package Aula3;

import java.util.Scanner;

public class Exercicio3_lacosrepeticao {

	public static void main (String args [])
	{
		int idade = 0, menor21=0, maior50=0;
		
		try (Scanner ler = new Scanner(System.in)) {
			while(idade!=-99)
			{
				System.out.println("Digite sua idade (inteiro) e -99 para obter o resultado geral:");
				idade = ler.nextInt();
				
			
			if(idade<21 );
			{
				menor21=menor21+1; //mesma sintaxe menor21++
			
			if(idade>50)
				
				maior50=maior50+1; //mesma sintaxe maior50++
			} 
				
		    }
			
		System.out.println("A quantidade de pessoas com idade inferior a 21 anos é de: "+ menor21 + " pessoas");
		System.out.println("A quantidade de pessoas com idade superior a 50 anos é de: "+ maior50 + " pessoas");
      }
   }	
}		



