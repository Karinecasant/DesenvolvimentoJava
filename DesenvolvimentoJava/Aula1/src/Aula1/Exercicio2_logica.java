package Aula1;

import java.util.Scanner; 

public class Exercicio2_logica {
	public static void main (String args[])
	{
		int segundos, divisao, divisao2;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			System.out.println("Digite o tempo total da maquina (em segundos):");
			segundos = ler.nextInt();
		
		divisao=segundos/60;
		divisao2=segundos/3600;
		
		System.out.println("\nO tempo total dessa maquina é: "+divisao +" minutos");
		System.out.println("\nO tempo total dessa maquina é: "+divisao2+" horas");
	}
}
