package Aula6;

import java.util.Scanner;

public class testeAdministrador {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub[
		
		String nome;
		String endere�o;
		String telefone;
		String ajudaDeCusto;
		
		Scanner ler = new Scanner (System.in);	
		
		System.out.print("Nome do(a) Colaborador(a): ");
		nome = ler.next();
		System.out.print("Endere�o: ");
		endere�o = ler.next();
		System.out.print("Telefone: ");
		telefone = ler.next();
		System.out.print("C�digo Setor: ");
		ajudaDeCusto = ler.next();
		System.out.print("Salario Base: R$ ");
	
		Administrador contabil = new Administrador (nome, endere�o, telefone, ajudaDeCusto);
		
		contabil.setNome(nome);
		contabil.setEndere�o(endere�o);
		contabil.setTelefone(telefone);
		contabil.setAjudaDeCusto(ajudaDeCusto);
		
		System.out.println("Total O valor total da ajuda de custo �: " + contabil.obterValorAjudaDeCusto());	
		
	}

}
