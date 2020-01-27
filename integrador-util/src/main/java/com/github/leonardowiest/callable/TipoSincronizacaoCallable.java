package com.github.leonardowiest.callable;

import java.util.concurrent.Callable;

import com.github.leonardowiest.abstracted.TipoSincronizacaoAbstract;
import com.github.leonardowiest.enumerator.TipoSincronizacaoEnum;

public class TipoSincronizacaoCallable implements Callable<Boolean> {

	private TipoSincronizacaoAbstract serviceASerInvocado;

	private TipoSincronizacaoEnum tipoSincronizacaoASerInvocado;

	public TipoSincronizacaoCallable(TipoSincronizacaoAbstract tipoSincronizacaoAbstract,
			TipoSincronizacaoEnum tipoSincronizacaoEnum) {

		this.serviceASerInvocado = tipoSincronizacaoAbstract;
		this.tipoSincronizacaoASerInvocado = tipoSincronizacaoEnum;
	}

	@Override
	public Boolean call() throws Exception {

		System.out.println("Tipo de sincronização invocada: " + tipoSincronizacaoASerInvocado.getBean());

		serviceASerInvocado.sincronizar();

		// Rever essa parte...
		return Boolean.TRUE;
	}

}
