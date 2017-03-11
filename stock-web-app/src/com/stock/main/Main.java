package com.stock.main;

import com.stock.dao.MySQLAccess;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();

	}

}
