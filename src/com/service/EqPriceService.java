package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import com.bean.EquityBean;

public class EqPriceService {

	public static void main(String[] args) throws Exception {
		new EqPriceService().addEquity();
	}

	public ArrayList<EquityBean> addEquity() {
		ArrayList<EquityBean> list = new ArrayList<EquityBean>();

		try {
			File file = new File("C:\\Users\\tejas\\Downloads\\eq.csv");

			FileReader fr = new FileReader(file);// single character
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				// System.out.println(line);// coaline,xx,xx,xx,xx,x,x,x,x,x,x
				String data[] = line.split("\",\"");
				String price = data[5].replaceAll("\"", "").replaceAll(",", "");
				String name = data[0].replace("\"", "");
				System.out.println(name + " " + price);

				EquityBean eq = new EquityBean();
				eq.setName(name);
				eq.setPrice(Float.parseFloat(price));

				list.add(eq);

			}

			br.close();
		} catch (Exception e) {

		}
		return list;
	}
}
