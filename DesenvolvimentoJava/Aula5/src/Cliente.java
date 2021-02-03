// 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente,
// defina as instancias deste objeto e apresente as informações deste objeto no console.

package Aula5;

//1- Criei 4 atributos da classe Cliente
public class Cliente {
	private double pontos;
	private String categoria;
	
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}