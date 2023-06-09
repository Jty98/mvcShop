package com.javalec.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.o_adminDao;
import com.javalec.dto.o_orderDto;

public class o_salesCommand implements ACommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		o_adminDao dao = new o_adminDao();
		
		ArrayList<String> salesList = new ArrayList<>();
		
		String daySales = dao.searchDaySales();
		String weekSales = dao.searchWeekSales();
		String monthSales = dao.searchMonthSales();
		
		salesList.add(daySales);
		salesList.add(weekSales);
		salesList.add(monthSales);
		
		request.setAttribute("salesList", salesList);

	}

}
