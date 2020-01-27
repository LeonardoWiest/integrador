package com.github.leonardowiest.enumerator;

public enum TipoSincronizacaoEnum {

	TABELAS_INFORMACOES_BASICAS("sincTabelasInformacoesBasicasBean");

	private final String bean;

	TipoSincronizacaoEnum(String beanName) {
		this.bean = beanName;
	}

	public String getBean() {
		return bean;
	}

}
