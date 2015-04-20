package Busboy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Manager.EmpObj;
import Shared.Communicator.DatabaseCommunicator;

public class Busboy_Handler extends DatabaseCommunicator {
	public Busboy_Handler()
	{
		super();
		connect("admin","gradMay17");
		tell("use MAINDB;");
		tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
	}
	
	public ArrayList<String> T_Status() throws SQLException{
		tell("use MAINDB;");
		tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
		ResultSet rs = tell("Select * from Table_Statuses Order by Table_ID;");
		ArrayList<String> T_Status_List = new ArrayList<String>();
		rs.beforeFirst();
		while(rs.next() == true){
			String temp = rs.getString("T_Status");
			T_Status_List.add(temp);
		}
		//this.disconnect();
		return T_Status_List;
	}
}
