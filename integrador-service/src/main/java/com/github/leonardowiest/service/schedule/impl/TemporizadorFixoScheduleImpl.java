package com.github.leonardowiest.service.schedule.impl;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.github.leonardowiest.enumerator.TipoSincronizacaoEnum;
import com.github.leonardowiest.service.factory.SincronizacaoFactory;
import com.github.leonardowiest.service.schedule.TemporizadorFixoSchedule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Scope(value = SCOPE_SINGLETON)
@EnableScheduling
@Component
public class TemporizadorFixoScheduleImpl implements TemporizadorFixoSchedule {

	@Lazy
	@Autowired
	private SincronizacaoFactory sincronizacaoFactory;

	@Override
	@Scheduled(cron = "*/10 * * * * *") // A cada 10 segundos
	public void sincronizar() {
		log.trace("==> Executando o método sincronizar.");

		sincronizacaoFactory.sincronizar(TipoSincronizacaoEnum.SINCRONIZACAO_PRIMARIA);
	}

}
