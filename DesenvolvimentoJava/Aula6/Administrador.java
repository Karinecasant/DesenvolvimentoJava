package Aula6;


// 1- Criar extends: Cria a herança herdada da Pessoa
public class Administrador extends Pessoa
{
	
// 2- Criar os atributos do Administrador
	private String ajudaDeCusto;
	
// 3- Criar o construtor e passar os argumentos da super classe e criar outro da própria classe Administrador
	public Administrador(String nome, String endereco, String telefone, String ajudaDeCusto, String sobrenome, String corFavorita)
	{
// 4- Super cria relação com a classe mãe e atributos, e atribui o atributo ajudaDeCusto dentro da própria classe ajudaDeCusto	
		super(nome, endereco, telefone, sobrenome, corFavorita);
		this.ajudaDeCusto = ajudaDeCusto;	
	}

// 5- Crie métodos
  	public void ImprimirInfo ()
  	{
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Ajuda de custo: " + getAjudaDeCusto());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Filme favorito: " + getFilmeFavorito());
		System.out.println("-----------------------------------------------");
  	}
 		
// 6- Fazer encapsulamento com getters e setters	
	public String getAjudaDeCusto() {
		return ajudaDeCusto;
			
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

}
