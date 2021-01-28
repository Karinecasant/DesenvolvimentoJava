package Aula1;

import java.util.Scanner; 

public class Exercicio1_logica {
	public static void main (String args[])
	{
		int dias, meses, anos, multiplicacao, soma, multiplicacao2, resultado;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			System.out.println("Informe a quantidade de anos (inteiros):");
			anos = ler.nextInt();
			System.out.println("Informe a quantidade de meses (inteiros):");
			meses = ler.nextInt();
			System.out.println("Informe a quantidade de dias:");
			dias = ler.nextInt();
		
		soma=dias;
		multiplicacao=meses*30;
		multiplicacao2 = anos*365;
		resultado = multiplicacao + multiplicacao2 + soma;
		
		System.out.println("\nA sua idade em dias é:"+resultado);
	}
}
