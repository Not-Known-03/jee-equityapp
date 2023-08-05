package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.EquityBean;
import com.util.DbConnection;

public class EquityDao {

	public void addEquity(EquityBean eq) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into equity (name,price) values (?,?)");
			pstmt.setString(1, eq.getName());
			pstmt.setFloat(2, eq.getPrice());

			pstmt.executeUpdate();// insert update delete

		} catch (Exception e) {

		}
	}

	public void updateEquity(EquityBean eq) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("update equity set price = ? where name = ? ");
			pstmt.setFloat(1, eq.getPrice());
			pstmt.setString(2, eq.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
