package com.github.leonardowiest.factory;

import com.github.leonardowiest.enumerator.TipoSincronizacaoEnum;

@FunctionalInterface
public interface SincronizacaoFactory {

	public abstract void sincronizar(TipoSincronizacaoEnum tipoSincronizacaoEnum);
}
