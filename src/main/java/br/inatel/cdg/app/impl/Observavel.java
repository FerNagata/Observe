package br.inatel.cdg.app.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.app.interfaces.iObservavel;

public class Observavel implements iObservavel {

	private String frase;
	private int qtdDePalavras;
	private int paresDeCaracteres;
	private int qtdPrimeiraLetraMaiuscula;
	private List<Observador> clientes;

	public Observavel() {
		clientes = new ArrayList<Observador>();
	}
	
	@Override
	public void registraObservador(Observador obs) {
		clientes.add(obs);
	}

	@Override
	public void notificaObservadores() {
		for (Observador observador : clientes) {
			observador.update(this);
		}
	}

	@Override
	public void executandoFuncoes(String frase){
		contadorDePalavras(frase);
		paresDeCaracteres(frase);
		palavrasComecadasEmMaiusculo(frase);
		notificaObservadores();
	}

	public void contadorDePalavras(String frase) {
		String[] palavras = frase.split(" ");
		this.qtdDePalavras = palavras.length;
	}

	public void paresDeCaracteres(String frase) {
		String[] palavras = frase.split(" ");
		int cont = 0;
		for (String palavra: palavras) {
			if (palavra.length()%2==0){
				cont += 1;
			}
		}
		this.paresDeCaracteres = cont;
	}

	public void palavrasComecadasEmMaiusculo(String frase) {
		String[] palavras = frase.split(" ");
		int cont = 0;
		for (String palavra: palavras) {
			if (Character.isUpperCase(palavra.charAt(0))){
				cont += 1;
			}
		}
		this.qtdPrimeiraLetraMaiuscula = cont;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public List<Observador> getClientes() {
		return clientes;
	}

	public void setClientes(List<Observador> clientes) {
		this.clientes = clientes;
	}

	public int getQtdDePalavras() {
		return qtdDePalavras;
	}

	public void setQtdDePalavras(int qtdDePalavras) {
		this.qtdDePalavras = qtdDePalavras;
	}

	public int getParesDeCaracteres() {
		return paresDeCaracteres;
	}

	public void setParesDeCaracteres(int paresDeCaracteres) {
		this.paresDeCaracteres = paresDeCaracteres;
	}

	public int getQtdPrimeiraLetraMaiuscula() {
		return qtdPrimeiraLetraMaiuscula;
	}

	public void setQtdPrimeiraLetraMaiuscula(int qtdPrimeiraLetraMaiuscula) {
		this.qtdPrimeiraLetraMaiuscula = qtdPrimeiraLetraMaiuscula;
	}
}
