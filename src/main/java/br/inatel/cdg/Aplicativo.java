package br.inatel.cdg;

import br.inatel.cdg.app.impl.Observavel;
import br.inatel.cdg.app.impl.Observador;

public class Aplicativo {

	public static void main(String[] args) {

		// Criando o observavel
		Observavel aplicativo = new Observavel();

		//Criando 3 observadores
		Observador obs1 = new Observador("John");
		Observador obs2 = new Observador("Peter");
		Observador obs3 = new Observador("Brad");

		//Fazendo a inscrição dos observadores no aplicativo.
		aplicativo.registraObservador(obs1);
		aplicativo.registraObservador(obs2);
		aplicativo.registraObservador(obs3);

		String frase = "Ola tudo bem, como AnDa a vida?";

		aplicativo.executandoFuncoes(frase);
	}

}
