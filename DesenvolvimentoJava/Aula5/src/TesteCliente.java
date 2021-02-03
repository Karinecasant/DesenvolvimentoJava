package Aula5;

public class TesteCliente {

	public static void main(String[] args) 
	{
		Cliente func = new Cliente();
		func.setCategoria("Gold");
		func.setPontos(5000);

		System.out.println("O cliente possui a quantidade de: " + func.getPontos() + " pontos");
		System.out.println("De acordo com a pontuação, a categoria do cliente é: " + func.getCategoria());	

	}

}
