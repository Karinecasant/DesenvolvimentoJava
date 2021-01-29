//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Aula3;

import java.util.Scanner; 

public class Exercicio2_lacosrepeticao {
	
	public static void main (String args [])
	{
		int x,num, somapar=0,somaimpar=0;
		
		try (Scanner ler = new Scanner(System.in)) {
			for(x=1;x<=10;x++)
			{
				System.out.println("Digite um numero (inteiro):");
				num = ler.nextInt();
				
			
			if(num%2==0)
			{
				somapar=somapar+1; //mesma sintaxe para: somapar++
			} 
			
			else 
			{
				somaimpar=somaimpar+1; //mesma sintaxe para: somaimpar++
			}
				
 }
		}
			
		System.out.println("\nA quantidade de numeros pares foram: "+ somapar + "e a quantidade de numeros impares foram: " + somaimpar);
    }
}	



