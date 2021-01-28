package Aula2;

import java.util.Scanner; 

public class Exercicio2_lacos{
	public static void main (String args[])
	{
		int num1, num2, num3;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			System.out.println("Digite o primeiro numero (inteiro):");
			num1 = ler.nextInt();
			System.out.println("Digite o segundo numero (inteiro):");
			num2 = ler.nextInt();
			System.out.println("Digite o terceiro numero (inteiro):");
			num3 = ler.nextInt();
			
		if (num1 < num2) {
			if (num2 < num3) {
				
			System.out.println("A ordem dos numeros é:" + num1 + " " + num2 + " " + num3);
			}
			else if (num1 < num3) {
				
			System.out.println("A ordem dos numeros é:" + num1 + " " + num3 + " " + num2);			
			}
			else {
			System.out.println("A ordem dos numeros é:" + num3 + " " + num1 + " " + num2);			
			}
				
			}
		    else if(num2 < num3) {
		    	
			if(num1 < num3) {
				
			System.out.println("A ordem dos numeros é:" + num2 + " " + num1 + " " + num3);	
			}
			else {
				System.out.println("A ordem dos numeros é:" + num1 + " " + num2 + " " + num3);	
			}	
				
			}
			
		}
	}
	
