package com.github.leonardowiest.enumerator;

public enum TipoSincronizacaoEnum {

	SINCRONIZACAO_PRIMARIA("sincronizacaoPrimaria");

	private final String bean;

	TipoSincronizacaoEnum(String beanName) {
		this.bean = beanName;
	}

	public String getBean() {
		return bean;
	}

}
