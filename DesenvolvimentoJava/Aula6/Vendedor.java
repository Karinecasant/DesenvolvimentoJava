// 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor 
// tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
// (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao 
// (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). 

package Aula6;

//1- Criar extends: Cria a herança herdada da Pessoa
public class Vendedor extends Pessoa
{
	
//2- Criar os atributos do Vendedor
	private double valorVendas;
	private double comissao;
	
//3- Criar o construtor e passar os argumentos da super classe e criar outro da própria classe Vendedor
	public Vendedor (String nome, String endereco, String telefone, String sobrenome, String filmeFavorito, double valorVendas, double comissao)
	{
//4- Super cria relação com a classe mãe e atributos, e atribui o atributo ajudaDeCusto dentro da própria classe ajudaDeCusto	
		super(nome, endereco, telefone, sobrenome, filmeFavorito);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
			
	}

//5- Crie métodos
	
	public void caculaComissao() 
	{
		double valorBase = 1500;
		double valorcomissao =   (valorVendas * comissao / 100); 
		System.out.println("-----------------------------------------------");
		System.out.println("Valor total recebido: " + (valorBase + valorcomissao) + ".");
	}
	
	public void ImprimirInfo ()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Filme favorito: " + getFilmeFavorito());
		System.out.println("Valor vendas: " + getValorVendas());
		System.out.println("Valor comissão: " + getComissao());
		System.out.println("-----------------------------------------------");
	}

// 6- Fazer encapsulamento com getters e setters	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


}	
		

	
