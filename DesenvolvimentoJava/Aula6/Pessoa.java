// 1. Cria uma Classe Pessoa, contendo os atributos encapsulados,
// com seus respectivos seletores (getters) e modificadores (setters), 
// e ainda o construtor padrão e pelo menos mais duas opções de construtores 
// conforme sua percepção. Atributos: String nome; String endereço; String telefone; 

package Aula6;

// 1- Criar classe Pessoa
    public class Pessoa {

// 2- Criar os atributos	
	private String nome;
	private String endereco;
	private String telefone;
	private String sobrenome;
	private String filmeFavorito;
	
	
// 3- Criar construtor e parametros
	public Pessoa (String nome, String endereco, String telefone, String sobrenome, String filmeFavorito)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sobrenome = sobrenome;
		this.filmeFavorito = filmeFavorito;
	}

// 4- Fazer encapsulamento com getters e setters	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getFilmeFavorito() {
		return filmeFavorito;
	}


	public void setFilmeFavorito(String filmeFavorito) {
		this.filmeFavorito = filmeFavorito;
	}
	
   }	
	