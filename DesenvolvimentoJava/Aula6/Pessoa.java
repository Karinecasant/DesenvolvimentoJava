// 1. Cria uma Classe Pessoa, contendo os atributos encapsulados,
// com seus respectivos seletores (getters) e modificadores (setters), 
// e ainda o construtor padr�o e pelo menos mais duas op��es de construtores 
// conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 

package Aula6;

// 1- Criar classe Pessoa
    public class Pessoa {

// 2- Criar os atributos	
	private String nome;
	private String endere�o;
	private String telefone;
	
// 3- Criar construtor e parametros
	public Pessoa (String nome, String endere�o, String telefone)
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;		
	}
	
// 4- Fazer encapsulamento com getters e setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}









///