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
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
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
import Shared.GUITemplates.SubframeTemplate;
import Shared.Gradients.GradientButton;
import Shared.Gradients.GradientPanel;

import javax.swing.JSeparator;
@SuppressWarnings("unused")

public class BusboyProject extends JFrame implements ActionListener{
	//Swing Variables
			private JPanel rootPanel,titlePanel;
			private GradientPanel MainPanel;
			private GradientButton logoutButton;
			//private GradientButton logoutButton;
			private JLabel titleLabel,dateAndTime;
			//Other Variables
			private Timer timer;
			private JPanel TableStatus;
			private JLabel lblMap;
			
			public JToggleButton Table1;
			public JToggleButton Table2;
			public JToggleButton Table3;
			public JToggleButton Table4;
			public JToggleButton Table5;
			public JToggleButton Table6;
			public JToggleButton Table7;
			public JToggleButton Table8;
			public JToggleButton Table9;
			public JToggleButton Table10;
			
			public JButton Table1_Map;
			public JButton Table2_Map;
			public JButton Table3_Map;
			public JButton Table4_Map;
			public JButton Table5_Map;
			public JButton Table6_Map;
			public JButton Table7_Map;
			public JButton Table8_Map;
			public JButton Table9_Map;
			public JButton Table10_Map;
			
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
		logoutButton.setBounds(187, 550, 825, 66);
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
		Title_Status.setBounds(201, 13, 371, 58);
		TableStatus.add(Title_Status);
		
		lblMap = new JLabel("Map");
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMap.setBounds(805, 13, 371, 58);
		TableStatus.add(lblMap);
		
		JButton Seperator_vertical = new JButton("");
		Seperator_vertical.setEnabled(false);
		Seperator_vertical.setBounds(791, 0, 2, 482);
		TableStatus.add(Seperator_vertical);
		
		JButton Seperator_horizontal = new JButton("");
		Seperator_horizontal.setEnabled(false);
		Seperator_horizontal.setBounds(0, 473, 1188, 9);
		TableStatus.add(Seperator_horizontal);
		
		JToggleButton Table6 = new JToggleButton("Table 6");
		Table6.setForeground(Color.WHITE);
		Table6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table6.setBackground(Color.RED);
		Table6.setBounds(12, 292, 161, 58);
		TableStatus.add(Table6);
		
		JToggleButton Table3 = new JToggleButton("Table 3");
		Table3.setForeground(Color.WHITE);
		Table3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table3.setBackground(Color.RED);
		Table3.setBounds(211, 191, 161, 58);
		TableStatus.add(Table3);
		
		JToggleButton Table4 = new JToggleButton("Table 4");
		Table4.setForeground(Color.WHITE);
		Table4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table4.setBackground(Color.RED);
		Table4.setBounds(411, 191, 161, 58);
		TableStatus.add(Table4);
		
		JToggleButton Table9 = new JToggleButton("Table 9");
		Table9.setForeground(Color.WHITE);
		Table9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table9.setBackground(Color.RED);
		Table9.setBounds(618, 292, 161, 58);
		TableStatus.add(Table9);
		
		JToggleButton Table2 = new JToggleButton("Table 2");
		Table2.setForeground(Color.WHITE);
		Table2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table2.setBackground(Color.RED);
		Table2.setBounds(12, 191, 161, 58);
		TableStatus.add(Table2);
		
		JToggleButton Table7 = new JToggleButton("Table 7");
		Table7.setForeground(Color.WHITE);
		Table7.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table7.setBackground(Color.RED);
		Table7.setBounds(211, 292, 161, 58);
		TableStatus.add(Table7);
		
		JToggleButton Table8 = new JToggleButton("Table 8");
		Table8.setForeground(Color.WHITE);
		Table8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table8.setBackground(Color.RED);
		Table8.setBounds(411, 292, 161, 58);
		TableStatus.add(Table8);
		
		JToggleButton Table5 = new JToggleButton("Table 5");
		Table5.setForeground(Color.WHITE);
		Table5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table5.setBackground(Color.RED);
		Table5.setBounds(618, 191, 161, 58);
		TableStatus.add(Table5);
		
		JToggleButton Table10 = new JToggleButton("Table 10");
		Table10.setForeground(Color.WHITE);
		Table10.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table10.setBackground(Color.RED);
		Table10.setBounds(306, 381, 161, 58);
		TableStatus.add(Table10);
		
		JToggleButton Table1 = new JToggleButton("Table 1");
		Table1.addActionListener(this);
		Table1.setForeground(Color.WHITE);
		Table1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table1.setBackground(Color.RED);
		Table1.setBounds(306, 106, 161, 58);
		TableStatus.add(Table1);
		TableStatus.setVisible(true);
		
		
		logoutButton.addActionListener(this);
		
		UIManager.put("ToggleButton.select", Color.GREEN);
		SwingUtilities.updateComponentTreeUI(Table1);
		SwingUtilities.updateComponentTreeUI(Table2);
		SwingUtilities.updateComponentTreeUI(Table3);
		SwingUtilities.updateComponentTreeUI(Table4);
		SwingUtilities.updateComponentTreeUI(Table5);
		SwingUtilities.updateComponentTreeUI(Table6);
		SwingUtilities.updateComponentTreeUI(Table7);
		SwingUtilities.updateComponentTreeUI(Table8);
		SwingUtilities.updateComponentTreeUI(Table9);
		SwingUtilities.updateComponentTreeUI(Table10);
		
		JButton Table1_Map = new JButton("1");
		Table1_Map.setBackground(Color.RED);
		Table1_Map.setForeground(Color.WHITE);
		Table1_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table1_Map.setBounds(805, 84, 371, 47);
		TableStatus.add(Table1_Map);
		
		JButton Table2_Map = new JButton("2");
		Table2_Map.setBackground(Color.RED);
		Table2_Map.setForeground(Color.WHITE);
		Table2_Map.setEnabled(false);
		Table2_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table2_Map.setBounds(805, 144, 111, 63);
		TableStatus.add(Table2_Map);
		
		JButton Table3_Map = new JButton("3");
		Table3_Map.setBackground(Color.RED);
		Table3_Map.setForeground(Color.WHITE);
		Table3_Map.setEnabled(false);
		Table3_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table3_Map.setBounds(1065, 144, 111, 63);
		TableStatus.add(Table3_Map);
		
		JButton Table4_Map = new JButton("4");
		Table4_Map.setBackground(Color.RED);
		Table4_Map.setForeground(Color.WHITE);
		Table4_Map.setEnabled(false);
		Table4_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table4_Map.setBounds(805, 225, 111, 63);
		TableStatus.add(Table4_Map);
		
		JButton Table5_Map = new JButton("5");
		Table5_Map.setForeground(Color.WHITE);
		Table5_Map.setBackground(Color.RED);
		Table5_Map.setEnabled(false);
		Table5_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table5_Map.setBounds(1065, 225, 111, 63);
		TableStatus.add(Table5_Map);
		
		JButton Table6_Map = new JButton("6");
		Table6_Map.setForeground(Color.WHITE);
		Table6_Map.setBackground(Color.RED);
		Table6_Map.setEnabled(false);
		Table6_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table6_Map.setBounds(805, 312, 111, 63);
		TableStatus.add(Table6_Map);
		
		JButton Table7_Map = new JButton("7");
		Table7_Map.setBackground(Color.RED);
		Table7_Map.setForeground(Color.WHITE);
		Table7_Map.setEnabled(false);
		Table7_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table7_Map.setBounds(1065, 312, 111, 63);
		TableStatus.add(Table7_Map);
		
		JButton Table8_Map = new JButton("8");
		Table8_Map.setForeground(Color.WHITE);
		Table8_Map.setBackground(Color.RED);
		Table8_Map.setEnabled(false);
		Table8_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table8_Map.setBounds(805, 390, 371, 47);
		TableStatus.add(Table8_Map);
		
		JButton Table9_Map = new JButton("9");
		Table9_Map.setBackground(Color.RED);
		Table9_Map.setForeground(Color.WHITE);
		Table9_Map.setEnabled(false);
		Table9_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table9_Map.setBounds(946, 144, 93, 105);
		TableStatus.add(Table9_Map);
		
		JButton Table10_Map = new JButton("10");
		Table10_Map.setBackground(Color.RED);
		Table10_Map.setForeground(Color.WHITE);
		Table10_Map.setEnabled(false);
		Table10_Map.setFont(new Font("Tahoma", Font.BOLD, 16));
		Table10_Map.setBounds(946, 268, 93, 105);
		TableStatus.add(Table10_Map);
		
		MainPanel.setVisible(true);
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
			new LoginWindow();
			dispose();
		}
	if(a == timer)
		{
			updateClock();
		}
	if(a == Table1)
	{
		Table1_Map.setVisible(false);
		
	}
	if(a == Table2)
	{
		
	}
	if(a == Table3)
	{
		
	}
	if(a == Table4)
	{
		
	}
	if(a == Table5)
	{
		
	}
	if(a == Table6)
	{
		
	}
	if(a == Table7)
	{
		
	}
	if(a == Table8)
	{
		
	}
	if(a == Table9)
	{
		
	}
	if(a == Table10)
	{
		
	}
	
	}
	}
		


