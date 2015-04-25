package Busboy;
//import ADT.*;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;











import Login.LoginWindow;
import Shared.Gradients.GradientButton;
import Shared.Gradients.GradientPanel;
import Shared.Notifications.NotificationGUI;

import javax.swing.JSeparator;
@SuppressWarnings("unused")

public class BusboyProject extends JFrame implements ActionListener{
	//Swing Variables
	//Notification GUI
	private NotificationGUI notification;
			private JPanel rootPanel,titlePanel;
			private GradientPanel MainPanel;
			private GradientButton logoutButton;
			public GradientButton Help;
			public GradientButton Message;
			//private GradientButton logoutButton;
			private JLabel titleLabel,dateAndTime;
			//Other Variables
			private Timer timer;
			private JPanel TableStatus;
			
			public JToggleButton Table1;
			public JToggleButton Table2;
			public JToggleButton Table3;
			public JToggleButton Table5;
			public JToggleButton Table6;
			public JToggleButton Table4;
			public JToggleButton Table9;
			public JToggleButton Table8;
			public JToggleButton Table7;
			public JToggleButton Table10;
			private Busboy_Handler b = new Busboy_Handler(); 
			
	public BusboyProject() {
		
		super();
		initialize();
		
	}

	
	private void initialize() {
		this.setTitle("Your GUI");
		this.setVisible(false);
		this.setResizable(true);
		this.setSize(1200,700);
		this.frameManipulation();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().add(rootPanel);
		
		 addWindowListener(new WindowAdapter() // To open login again if you hit the corner "X"
	        {
	            @Override
	            public void windowClosing(WindowEvent e)
	            {
	    			notification.close();
	    			b.disconnect();
	    			new LoginWindow();
	    			dispose();
	            }
	        });
		
		this.setVisible(true);
		
		}
	
	
	public void frameManipulation()
	{
		setBackgroundPanel();
		setTitlePanel();
		setButtonPanel();
		setRootPanel();
	}
	
	private void setRootPanel()
	{
		rootPanel = new JPanel();
		// Create Notification GUI
		notification = new NotificationGUI(25,"Busboy");
		rootPanel.add(notification);
		rootPanel.setLayout(null);
		rootPanel.add(titlePanel);
		rootPanel.add(MainPanel);
		rootPanel.setVisible(true);
	}
	
	private void setBackgroundPanel()
	{
		// Create Background Panel
		MainPanel = new GradientPanel();
		MainPanel.setGradient(Color.white,new Color(153,230,255));
		//backgroundPanel.setBrightness(backgroundPanel.getColor2(),1);
		MainPanel.setLayout(null);
		MainPanel.setBounds(0,0,1200,652);
		
		logoutButton = new GradientButton("LOGOUT");
		logoutButton.setBounds(10, 551, 371, 66);
		logoutButton.setFocusPainted(false);
		logoutButton.setFont(logoutButton.getFont().deriveFont(16.0f));
		MainPanel.add(logoutButton);
		// Only adjust horizontal and vertical gaps for this layout
		// DO NOT adjust panel size or location!!
		
		TableStatus = new JPanel();
		TableStatus.setBounds(0, 55, 1188, 482);
		MainPanel.add(TableStatus);
		TableStatus.setLayout(null);
		
		TableStatus.setOpaque(false);
		
		JLabel Title_Status = new JLabel("Change Table Status");
		Title_Status.setFont(new Font("Tahoma", Font.PLAIN, 28));
		Title_Status.setHorizontalAlignment(SwingConstants.CENTER);
		Title_Status.setBounds(422, 13, 371, 58);
		TableStatus.add(Title_Status);
		
		JButton Seperator_horizontal = new JButton("");
		Seperator_horizontal.setEnabled(false);
		Seperator_horizontal.setBounds(0, 473, 1188, 9);
		TableStatus.add(Seperator_horizontal);
		
		Table4 = new JToggleButton("Table 4");
		Table4.setForeground(Color.WHITE);
		Table4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table4.setBackground(Color.RED);
		Table4.setBounds(249, 217, 161, 58);
		TableStatus.add(Table4);
		Table4.addActionListener(this);
		
		Table3 = new JToggleButton("Table 3");
		Table3.setForeground(Color.WHITE);
		Table3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table3.setBackground(Color.RED);
		Table3.setBounds(782, 123, 161, 58);
		TableStatus.add(Table3);
		Table3.addActionListener(this);
		
		Table5 = new JToggleButton("Table 5");
		Table5.setForeground(Color.WHITE);
		Table5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table5.setBackground(Color.RED);
		Table5.setBounds(521, 176, 161, 58);
		TableStatus.add(Table5);
		Table5.addActionListener(this);
		
		Table7 = new JToggleButton("Table 7");
		Table7.setForeground(Color.WHITE);
		Table7.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table7.setBackground(Color.RED);
		Table7.setBounds(249, 303, 161, 58);
		TableStatus.add(Table7);
		Table7.addActionListener(this);
		
		Table2 = new JToggleButton("Table 2");
		Table2.setForeground(Color.WHITE);
		Table2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table2.setBackground(Color.RED);
		Table2.setBounds(521, 84, 161, 58);
		TableStatus.add(Table2);
		Table2.addActionListener(this);
		
		Table9 = new JToggleButton("Table 9");
		Table9.setForeground(Color.WHITE);
		Table9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table9.setBackground(Color.RED);
		Table9.setBounds(782, 303, 161, 58);
		TableStatus.add(Table9);
		Table9.addActionListener(this);
		
		Table8 = new JToggleButton("Table 8");
		Table8.setForeground(Color.WHITE);
		Table8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table8.setBackground(Color.RED);
		Table8.setBounds(521, 269, 161, 58);
		TableStatus.add(Table8);
		Table8.addActionListener(this);
		
		Table6 = new JToggleButton("Table 6");
		Table6.setForeground(Color.WHITE);
		Table6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table6.setBackground(Color.RED);
		Table6.setBounds(782, 217, 161, 58);
		TableStatus.add(Table6);
		Table6.addActionListener(this);
		
		Table10 = new JToggleButton("Table 10");
		Table10.setForeground(Color.WHITE);
		Table10.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table10.setBackground(Color.RED);
		Table10.setBounds(521, 369, 161, 58);
		TableStatus.add(Table10);
		Table10.addActionListener(this);
		
		Table1 = new JToggleButton("Table 1");
		Table1.addActionListener(this);
		Table1.setForeground(Color.WHITE);
		Table1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table1.setBackground(Color.RED);
		Table1.setBounds(249, 123, 161, 58);
		TableStatus.add(Table1);
		TableStatus.setVisible(true);
		Table1.addActionListener(this);
		
		UIManager.put("ToggleButton.select", Color.GREEN);
		SwingUtilities.updateComponentTreeUI(Table1);
		SwingUtilities.updateComponentTreeUI(Table2);
		SwingUtilities.updateComponentTreeUI(Table3);
		SwingUtilities.updateComponentTreeUI(Table5);
		SwingUtilities.updateComponentTreeUI(Table6);
		SwingUtilities.updateComponentTreeUI(Table4);
		SwingUtilities.updateComponentTreeUI(Table9);
		SwingUtilities.updateComponentTreeUI(Table8);
		SwingUtilities.updateComponentTreeUI(Table7);
		SwingUtilities.updateComponentTreeUI(Table10);
		
		Help = new GradientButton("HELP");
		
		Help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPanel, "Select a table to toggle its status. Red = Unclean, Green = Clean");
			}
		});
		
		Help.setText("HELP");
		Help.setFont(Help.getFont().deriveFont(16f));
		Help.setFocusPainted(false);
		Help.setBounds(418, 551, 371, 66);
		MainPanel.add(Help);
		
		Message = new GradientButton("MESSAGE");
		Message.setText("MESSAGE");
		Message.setFont(Message.getFont().deriveFont(16f));
		Message.setFocusPainted(false);
		Message.setBounds(817, 551, 371, 66);
		MainPanel.add(Message);
		
		logoutButton.addActionListener(this);
		
		MainPanel.setVisible(true);
		
		//Initial Table Status
		initialTableStatus(Table1,0);
		initialTableStatus(Table2,1);
		initialTableStatus(Table3,2);
		initialTableStatus(Table4,3);
		initialTableStatus(Table5,4);
		initialTableStatus(Table6,5);
		initialTableStatus(Table7,6);
		initialTableStatus(Table8,7);
		initialTableStatus(Table9,8);
		initialTableStatus(Table10,9);
	}
	
	
	//*********************************************************
	//DO NOT edit the following function except for title name
	//*********************************************************
	
	private void setTitlePanel()
	{
		// Create Title Panel
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setOpaque(false);
		titlePanel.setBounds(new Rectangle(0, 0, 1200, 56));
		// Set Title
		titleLabel = new JLabel("Busboy Interface");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(titleLabel.getFont().deriveFont(38f));
		titleLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		titleLabel.setBounds(new Rectangle(0, 0, 793, 56));
		// Create a timer to update the clock
		timer = new Timer(500,this);
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.addActionListener(this);
        timer.start();

		// Add components to Title Panel
		titlePanel.add(titleLabel);
		// Set Date and Time
		dateAndTime = new JLabel();
		dateAndTime.setBounds(792, 0, 402, 56);
		titlePanel.add(dateAndTime);
		dateAndTime.setHorizontalAlignment(JLabel.CENTER);
		dateAndTime.setFont(dateAndTime.getFont().deriveFont(28f));
		dateAndTime.setBorder(BorderFactory.createLineBorder(Color.black));
		
		titlePanel.setVisible(true);
	}
	
	private void setButtonPanel()
	{
		
	}
	private void updateClock() {
        dateAndTime.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
	
public void actionPerformed(ActionEvent e) {
	Object a = e.getSource();
	if(a == logoutButton)
		{
		notification.close();
		b.disconnect();
		new LoginWindow();
		dispose();
		}
	if(a == timer)
		{
			updateClock();
		}
	if(a == Message)
		{
	
		}
	if(a == Table1){
		ChangeTableStatus(Table1,1);
	}
	if(a == Table2){
		ChangeTableStatus(Table2,2);
	}
	if(a == Table3){
		ChangeTableStatus(Table3,3);
	}
	if(a == Table4){
		ChangeTableStatus(Table4,4);
	}
	if(a == Table5){
		ChangeTableStatus(Table5,5);
	}
	if(a == Table6){
		ChangeTableStatus(Table6,6);
	}
	if(a == Table7){
		ChangeTableStatus(Table7,7);
	}
	if(a == Table8){
		ChangeTableStatus(Table8,8);
	}
	if(a == Table9){
		ChangeTableStatus(Table9,9);
	}
	if(a == Table10){
		ChangeTableStatus(Table10,10);
	}

	}
public void ChangeTableStatus(JToggleButton Table, int Table_ID){
	b.tell("use MAINDB;");
	b.tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
	if(Table.isSelected()== true){
		b.update("UPDATE MAINDB.Table_Statuses SET T_Status = 'Clean' WHERE TABLE_ID = "+Table_ID+";");
	}
	if(Table.isSelected()== false){
		b.update("UPDATE MAINDB.Table_Statuses SET T_Status = 'Unclean' WHERE TABLE_ID = "+Table_ID+";");
	}
}
public void initialTableStatus(JToggleButton Table,int index){
	b.tell("use MAINDB;");
	b.tell("Select * from MAINDB.Table_Statuses Order by Table_ID;");
	try {
		if (b.T_Status().get(index).toString().equals("Unclean")){
			Table.setSelected(false);
		}
		if (b.T_Status().get(index).toString().equals("Clean")){
			Table.setSelected(true);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
		


