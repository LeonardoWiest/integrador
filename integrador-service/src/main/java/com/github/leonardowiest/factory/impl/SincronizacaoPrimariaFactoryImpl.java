package com.github.leonardowiest.factory.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.leonardowiest.factory.SincronizacaoPrimariaFactory;

public class SincronizacaoPrimariaFactoryImpl implements SincronizacaoPrimariaFactory {

	@Override
	public Boolean sincronizar() {

		List<?> sincronizacoesDesatualizadas = buscarSincronizacoesDesatualizadas();

		return Boolean.TRUE;
	}

	private List<?> buscarSincronizacoesDesatualizadas() {
		
		return new ArrayList<>();
	}

}
