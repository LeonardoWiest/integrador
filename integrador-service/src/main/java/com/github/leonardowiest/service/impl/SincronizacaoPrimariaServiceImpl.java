package com.github.leonardowiest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.github.leonardowiest.abstracted.TipoSincronizacaoAbstract;
import com.github.leonardowiest.service.factory.SincronizacaoPrimariaFactory;

@Service("sincronizacaoPrimaria")
public class SincronizacaoPrimariaServiceImpl implements TipoSincronizacaoAbstract {

	@Lazy
	@Autowired
	private SincronizacaoPrimariaFactory sincronizacaoPrimariaFactory;

	@Override
	public void sincronizar() {

		sincronizacaoPrimariaFactory.sincronizar();
	}

}
