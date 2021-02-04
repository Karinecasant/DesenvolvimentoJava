package Aula6;


// 1- Criar extends: Cria a heran�a herdada da Pessoa
public class Administrador extends Pessoa
{
	
// 2- Criar os atributos do Administrador
	private String ajudaDeCusto;
	
// 3- Criar o construtor e passar os argumentos da super classe e criar outro da pr�pria classe Administrador
	public Administrador(String nome, String endere�o, String telefone, String ajudaDeCusto)
	{
// 4- Super cria rela��o com a classe m�e e atributos, e atribui o atributo ajudaDeCusto dentro da pr�pria classe ajudaDeCusto	
		super(nome, endere�o, telefone);
		this.ajudaDeCusto = ajudaDeCusto;	
	}

// 5- Crie m�todos
  	public void obterValorAjudaDeCusto ()
  	{
  		int valorAjudaDeCusto;
		int ajudaViagem=100;
		int ajudaEstadia=20;
  		valorAjudaDeCusto = (ajudaViagem + ajudaEstadia);
  		System.out.println("O Valor total da ajuda de custo � de: " + valorAjudaDeCusto + " reais");
  	}
 		
// 6- Fazer encapsulamento com getters e setters	
	public String getAjudaDeCusto() {
		return ajudaDeCusto;
			
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

}
