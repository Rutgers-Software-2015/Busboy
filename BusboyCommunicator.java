package Busboy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



//import Manager.EmpObj;
import Manager.ManagerCommunicator.*;
import Manager.ManagerGUIs.*;
import Manager.ManagerHandlers.*;

import javax.swing.JToggleButton;



import Shared.Communicator.DatabaseCommunicator;

public class BusboyCommunicator extends DatabaseCommunicator {
	
	/**
	 * Class created for using the Busboy System
	 * Uses DB as required throughout the code
	 * 
	 * @author David Arakelyan
	 * @tester David Arakelyan
	 * @debugger David Arakelyan
	 * 
	 */
	
	public BusboyCommunicator(){
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
		System.out.println(" ... done calculating");
		return T_Status_List;
	}
	
	/**
	 * This function updates the table within the database which corresponds
	 * to table statuses. Depending on the condition of the JToggleButton
	 * (toggled or not toggled), it will update the specific region of the
	 * database with "Clean" or "Unclean". 
	 * 
	 * @return = none
	 * @param = JToggleButton,int
	 * 
	 */
	
	public void ChangeTableStatus(JToggleButton Table, int Table_ID){
		tell("use MAINDB;");
		tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
		if(Table.isSelected()== true){
			update("UPDATE MAINDB.Table_Statuses SET T_Status = 'Clean' WHERE TABLE_ID = "+Table_ID+";");
		}
		if(Table.isSelected()== false){
			update("UPDATE MAINDB.Table_Statuses SET T_Status = 'Unclean' WHERE TABLE_ID = "+Table_ID+";");
		}
	}
	
	/**
	 * This function updates the status of the ToggleButton depending on the
	 * status of the table within the database. If the database marks the table
	 * as unclean, the ToggleButton will be unselected. The opposite happens with
	 * the table is clean.
	 * 
	 * @return = none
	 * @param = JToggleButton,int
	 * 
	 */
	
	public void initialTableStatus(JToggleButton Table,int index){
		tell("use MAINDB;");
		tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
		try {
			if (T_Status().get(index).toString().equals("Unclean")){
				Table.setSelected(false);
			}
			if (T_Status().get(index).toString().equals("Clean")){
				Table.setSelected(true);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
