//1-	Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

package Aula3;

public class Exercicio1_lacosrepeticao {
	
	public static void main (String args[])
	{
		int x;

		for(x=1000;x<2000;x++) //para esse caso, n�o colocar ";". Caso coloque, n�o vai compilar
			
		if(x%11==5)
		{
			System.out.println("\nOs resultados obtidos foram:"+ x);
		} 
	    }
	}	