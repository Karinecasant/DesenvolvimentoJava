package Aula6;

public class TesteVendedor {
	
//1- Criar Main
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub[
		
		Vendedor vendedor = new Vendedor ("Karine", "Rua New York", "114444-2685","Santos", "Harry Potter", 1000, 10);
		
		vendedor.caculaComissao();
		vendedor.ImprimirInfo();
	
		
	}

}