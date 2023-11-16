package br.inatel.cdg.app.impl;

import br.inatel.cdg.app.interfaces.iObservador;

public class Observador implements iObservador {

	String _nome;

	public Observador(String nome) {
		this._nome = nome;
	}

	@Override
	public void update(Observavel aplicativo) {
		System.out.println("Cliente: " + this._nome);
		System.out.println("Quantidade de palavras: " + aplicativo.getQtdDePalavras());
		System.out.println("Quantidade de palavras que possuem um número par de caracteres: " + aplicativo.getParesDeCaracteres());
		System.out.println("Quantidade de palavras que começam com maiúscula: " + aplicativo.getQtdPrimeiraLetraMaiuscula());
	}
	
}