package Aula5;

public class ProdutoEletronico {
	String cor;
	String modelo;

//método construtor

	public ProdutoEletronico(String cor , String modelo) 
	
	{
		this.modelo = modelo;
		this.cor = cor;
	}
	
	//declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("O aparelho eletrônico possui" + cor + "vermelho" + " e " + modelo + "electrolux");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}	

