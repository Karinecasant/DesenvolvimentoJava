package Aula1;

import java.util.Scanner; 

public class Exercicio3_logica{
	public static void main (String args[])
	{
		float nota1, nota2, nota3, peso1=2, peso2=3, peso3=5, somanota,somapond, resultadofinal;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			System.out.println("Digite a primeira nota");
			nota1 = ler.nextFloat();
			System.out.println("Digite a segunda nota");
			nota2 = ler.nextFloat();
			System.out.println("Digite a terceira nota");
			nota3 = ler.nextFloat();
			
			somanota = nota1*peso1 + nota2*peso2 + nota3*peso3;
			somapond = peso1 + peso2 + peso3;
			resultadofinal = somanota/ somapond;
		
		System.out.println("\nSua nota final é:"+ resultadofinal);
	}
}
