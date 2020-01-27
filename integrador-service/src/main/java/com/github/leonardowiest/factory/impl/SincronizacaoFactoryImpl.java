package com.github.leonardowiest.factory.impl;

import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.github.leonardowiest.abstracted.TipoSincronizacaoAbstract;
import com.github.leonardowiest.callable.TipoSincronizacaoCallable;
import com.github.leonardowiest.enumerator.TipoSincronizacaoEnum;
import com.github.leonardowiest.factory.SincronizacaoFactory;

@Component
public class SincronizacaoFactoryImpl implements SincronizacaoFactory {

	@Autowired
	private ApplicationContext applicationContext;

	private ExecutorService executorService = Executors.newCachedThreadPool();

	private EnumMap<TipoSincronizacaoEnum, Future<Boolean>> sincronizacoesEnum = new EnumMap<>(
			TipoSincronizacaoEnum.class);

	@Override
	public void sincronizar(TipoSincronizacaoEnum tipoSincronizacaoEnum) {

		if (!sincronizacoesEnum.containsKey(tipoSincronizacaoEnum)) {

			sincronizacoesEnum.put(tipoSincronizacaoEnum, estabelecerSincronizacaoPorTipo(tipoSincronizacaoEnum));
		}

	}

	private Future<Boolean> estabelecerSincronizacaoPorTipo(TipoSincronizacaoEnum tipoSincronizacaoEnum) {

		TipoSincronizacaoAbstract tipoSincronizacaoAbstract = applicationContext
				.getBean(tipoSincronizacaoEnum.getBean(), TipoSincronizacaoAbstract.class);

		TipoSincronizacaoCallable tipoSincronizacaoCallable = new TipoSincronizacaoCallable(tipoSincronizacaoAbstract,
				tipoSincronizacaoEnum);

		return executorService.submit(tipoSincronizacaoCallable);
	}

}
