// 1. Cria uma Classe Pessoa, contendo os atributos encapsulados,
// com seus respectivos seletores (getters) e modificadores (setters), 
// e ainda o construtor padrão e pelo menos mais duas opções de construtores 
// conforme sua percepção. Atributos: String nome; String endereço; String telefone; 

package Aula6;

// 1- Criar classe Pessoa
    public class Pessoa {

// 2- Criar os atributos	
	private String nome;
	private String endereço;
	private String telefone;
	
// 3- Criar construtor e parametros
	public Pessoa (String nome, String endereço, String telefone)
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;		
	}
	
// 4- Fazer encapsulamento com getters e setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}









///