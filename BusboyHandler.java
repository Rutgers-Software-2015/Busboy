package Busboy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import java.util.LinkedList;





import Customer.CustomerCommunicator;
//import Manager.EmpObj;
import Manager.ManagerCommunicator.*;
import Manager.ManagerGUIs.*;
import Manager.ManagerHandlers.*;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;







import Shared.Communicator.DatabaseCommunicator;
import Waiter.WaiterCommunicator;

public class BusboyHandler{
	
	/**
	 * This class facilitates interaction between the Busboy GUI
	 * and the Busboy communicator
	 * 
	 * @author David Arakelyan
	 * @tester David Arakelyan
	 * @debugger David Arakelyan
	 * 
	 */
	
	public BusboyCommunicator b;
	public LinkedList dirtyTables = new LinkedList();
	
	/**
	 * Constructor
	 * 
	 * @return nothing
	 * 
	 */
	
	public BusboyHandler(BusboyCommunicator b)
	{
		this.b = b;
		this.b.connect("admin", "gradMay17");
		this.b.tell("use MAINDB;");
	}
	
	/**
	 * This function is used to view the initial table statuses (Clean or unclean). 
	 * It sends the request from the GUI to the communicator.
	 * 
	 * @param List of Tables (JToggleButtons)
	 * 
	 * 
	 */
	
	public void InitialTableStatuses(ArrayList<JToggleButton> List){
		
		b.initialTableStatus(List.get(0),0);
		b.initialTableStatus(List.get(1),1);
		b.initialTableStatus(List.get(2),2);
		b.initialTableStatus(List.get(3),3);
		b.initialTableStatus(List.get(4),4);
		b.initialTableStatus(List.get(5),5);
		b.initialTableStatus(List.get(6),6);
		b.initialTableStatus(List.get(7),7);
		b.initialTableStatus(List.get(8),8);
		b.initialTableStatus(List.get(9),9);
		
	}
	
	/**
	 * This function is used to update the table status. It sends the request from the GUI to the communicator.
	 * 
	 * @param List of tables (JToggleButtons)
	 * 
	 */
	
	public void ChangeTableStatus(ArrayList<JToggleButton> List,int Table){
		
		b.ChangeTableStatus(List.get(0),1);
		b.ChangeTableStatus(List.get(1),2);
		b.ChangeTableStatus(List.get(2),3);
		b.ChangeTableStatus(List.get(3),4);
		b.ChangeTableStatus(List.get(4),5);
		b.ChangeTableStatus(List.get(5),6);
		b.ChangeTableStatus(List.get(6),7);
		b.ChangeTableStatus(List.get(7),8);
		b.ChangeTableStatus(List.get(8),9);
		b.ChangeTableStatus(List.get(9),10);
		
	}

	
	
	
	
	
}
