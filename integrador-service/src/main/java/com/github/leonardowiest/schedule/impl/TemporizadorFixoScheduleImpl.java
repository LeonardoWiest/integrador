package com.github.leonardowiest.schedule.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.github.leonardowiest.schedule.TemporizadorFixoSchedule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@EnableScheduling
@Component
public class TemporizadorFixoScheduleImpl implements TemporizadorFixoSchedule {

	@Override
	@Scheduled(cron = "*/10 * * * * *") // A cada 10 segundos
	public void sincronizar() {
		log.trace("==> Executando o método sincronizar.");
	}

}
