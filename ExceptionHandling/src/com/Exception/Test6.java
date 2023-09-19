//throws :

package com.Exception;

import java.sql.SQLException;

public class Test6 {
	public static void m1() throws SQLException{
		throw new SQLException();
	}
	
    public static void m2() throws SQLException{
		m1();	
	}
	public static void main(String[] args) {
		try {
			m2();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled inside main()");
		}

	}

}
