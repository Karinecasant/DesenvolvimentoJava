// 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
// esta classe, em seguida crie um objeto avi�o, defina as instancias deste
// objeto e apresente as informa��es deste objeto no console.

package Aula5;

public class Aviao {

	public void testaAviao() 
	{
		System.out.printf("Quantidade de lugares no voo em numero inteiro: %d \n", lugaresvoo(186));
		System.out.printf("Pre�o para fretagem do voo: %f \n", precofretagem(200.5));
	}
	public int lugaresvoo(int valorInt) 
	{
		System.out.printf("A quantidade de lugares no voo �: %d \n", valorInt);
		return valorInt * 1;
	}
	public double precofretagem(double valorDouble)  
    {
		System.out.printf("O valor da fretagem do voo �: %f \n", valorDouble);
		return valorDouble * 186;
    }
    
}

