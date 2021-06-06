package com.training;
import java.sql.*;

import com.training.GetCon;
public class RegisterUser 
{
static int status=0;

public static int register(String username,String password,String repassword,double amount,String address,String phone){

	Connection con=GetCon.getCon();
	PreparedStatement ps;
	try {
		ps = con.prepareStatement("Insert into NEWACCOUNT values(?,?,?,?,?,?,?)");
		int	nextvalue1=GetCon.getPrimaryKey();
		ps.setInt(1,nextvalue1);
		ps.setString(2,username);
		ps.setString(3,password);
		ps.setString(4,repassword);
		ps.setDouble(5,amount);
		ps.setString(6,address);
		ps.setString(7,phone);
		
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return status;
	
}
}
