package br.inatel.cdg.app.interfaces;

import br.inatel.cdg.app.impl.Observador;

public interface iObservavel {

	public void registraObservador(Observador obs);

	public void executandoFuncoes(String string);

	public void notificaObservadores();
	
}