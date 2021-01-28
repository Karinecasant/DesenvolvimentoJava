package Aula2;

import java.util.Scanner; 

public class Exercicio1_lacos{
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
			
		if (num1 >=num2 && num1 >=num3)
		{
			System.out.println("\nA maior nota é:"+num1);
		}
		
		else if (num2 >=num1 && num2 >=num3)
		{	
			System.out.println("\nA maior nota é:"+num2);
		}
		else 
		{	
			System.out.println("\nA maior nota é:"+num3);		
        }
	 }	
}