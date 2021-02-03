// 2) Crie uma classe avião e apresente os atributos e métodos referentes
// esta classe, em seguida crie um objeto avião, defina as instancias deste
// objeto e apresente as informações deste objeto no console.

package Aula5;

public class Aviao {

	public void testaAviao() 
	{
		System.out.printf("Quantidade de lugares no voo em numero inteiro: %d \n", lugaresvoo(186));
		System.out.printf("Preço para fretagem do voo: %f \n", precofretagem(200.5));
	}
	public int lugaresvoo(int valorInt) 
	{
		System.out.printf("A quantidade de lugares no voo é: %d \n", valorInt);
		return valorInt * 1;
	}
	public double precofretagem(double valorDouble)  
    {
		System.out.printf("O valor da fretagem do voo é: %f \n", valorDouble);
		return valorDouble * 186;
    }
    
}

