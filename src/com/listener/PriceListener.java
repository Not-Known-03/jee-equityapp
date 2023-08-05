package com.listener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.service.PriceService;

//@WebListener
public class PriceListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent arg0) {
		// server start

		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
		MyPrice myprice = new MyPrice();
		ex.scheduleAtFixedRate(myprice, 0, 24, TimeUnit.HOURS);

	}

	public void contextDestroyed(ServletContextEvent arg0) {

		// stop
	}

}

class MyPrice extends Thread {
	public void run() {
		PriceService p = new PriceService();
		p.getPrice();

	}
}
