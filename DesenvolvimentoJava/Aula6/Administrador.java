package Aula6;


// 1- Criar extends: Cria a heran�a herdada da Pessoa
public class Administrador extends Pessoa
{
	
// 2- Criar os atributos do Administrador
	private String ajudaDeCusto;
	
// 3- Criar o construtor e passar os argumentos da super classe e criar outro da pr�pria classe Administrador
	public Administrador(String nome, String endereco, String telefone, String ajudaDeCusto, String sobrenome, String corFavorita)
	{
// 4- Super cria rela��o com a classe m�e e atributos, e atribui o atributo ajudaDeCusto dentro da pr�pria classe ajudaDeCusto	
		super(nome, endereco, telefone, sobrenome, corFavorita);
		this.ajudaDeCusto = ajudaDeCusto;	
	}

// 5- Crie m�todos
  	public void ImprimirInfo ()
  	{
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Endere�o: " + getEndereco());
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
