package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EquityBean;
import com.dao.EquityDao;
import com.service.PriceService;

@WebServlet("/AddPriceServlet")
public class AddPriceServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PriceService priceService = new PriceService();
		ArrayList<EquityBean> list = priceService.getPrice();
		
		EquityDao eqDao = new EquityDao();
		for(EquityBean eq:list) {
				eqDao.updateEquity(eq);
		}
		
	}
}

//RIL : 2525 
//TVTODAY : 202 
//SOLIMAC : 73.50 
