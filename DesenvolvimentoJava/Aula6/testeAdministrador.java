package Aula6;

import java.util.Scanner;

public class testeAdministrador {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub[
		
		String nome;
		String endereço;
		String telefone;
		String ajudaDeCusto;
		
		Scanner ler = new Scanner (System.in);	
		
		System.out.print("Nome do(a) Colaborador(a): ");
		nome = ler.next();
		System.out.print("Endereço: ");
		endereço = ler.next();
		System.out.print("Telefone: ");
		telefone = ler.next();
		System.out.print("Código Setor: ");
		ajudaDeCusto = ler.next();
		System.out.print("Salario Base: R$ ");
	
		Administrador contabil = new Administrador (nome, endereço, telefone, ajudaDeCusto);
		
		contabil.setNome(nome);
		contabil.setEndereço(endereço);
		contabil.setTelefone(telefone);
		contabil.setAjudaDeCusto(ajudaDeCusto);
		
		System.out.println("Total O valor total da ajuda de custo é: " + contabil.obterValorAjudaDeCusto());	
		
	}

}
