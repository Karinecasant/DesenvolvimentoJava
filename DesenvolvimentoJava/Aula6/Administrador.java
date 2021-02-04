package Aula6;


// 1- Criar extends: Cria a herança herdada da Pessoa
public class Administrador extends Pessoa
{
	
// 2- Criar os atributos do Administrador
	private String ajudaDeCusto;
	
// 3- Criar o construtor e passar os argumentos da super classe e criar outro da própria classe Administrador
	public Administrador(String nome, String endereço, String telefone, String ajudaDeCusto)
	{
// 4- Super cria relação com a classe mãe e atributos, e atribui o atributo ajudaDeCusto dentro da própria classe ajudaDeCusto	
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;	
	}

// 5- Crie métodos
  	public void obterValorAjudaDeCusto ()
  	{
  		int valorAjudaDeCusto;
		int ajudaViagem=100;
		int ajudaEstadia=20;
  		valorAjudaDeCusto = (ajudaViagem + ajudaEstadia);
  		System.out.println("O Valor total da ajuda de custo é de: " + valorAjudaDeCusto + " reais");
  	}
 		
// 6- Fazer encapsulamento com getters e setters	
	public String getAjudaDeCusto() {
		return ajudaDeCusto;
			
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

}
