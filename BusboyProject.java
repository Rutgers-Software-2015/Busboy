package Busboy;
//import ADT.*;

import java.awt.EventQueue;




import javax.swing.JFrame;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import ADT.*;
import Login.LoginWindow;
@SuppressWarnings("unused")

public class BusboyProject extends JFrame implements ActionListener{

	// Here I declared a new frame to place all of my buttons and panels upon, and new buttons, as well as panels. They we declared here so that they could be
	// reused by other classes throughout my code. Boolean values were also defined here so they could be used by all of my functions as needed.
	
	public JFrame frame;
	private JPanel Panel_1_Welcome;
	private JPanel panel_2_TableStatus;
	private JPanel panel_3_Status;
	private JPanel panel_4_Updated;
	private JButton Table_1_i;
	private JButton Table_2_i;
	private JButton Table_3_i;
	private JButton Table_4_i;
	private JButton Table_5_i;
	private JButton Table_6_i;
	private boolean Enable_Table_1,Enable_Table_2,Enable_Table_3,Enable_Table_4,Enable_Table_5,Enable_Table_6;
	private boolean Disable_Table_1,Disable_Table_2,Disable_Table_3,Disable_Table_4,Disable_Table_5,Disable_Table_6;
	public TableHandler tablehandler = new TableHandler();

	
// Public function used to create the frame and initialize all of my specifications for each panel within the frame. This was also used within the login screen 
	// so that it would link to my interface once I logged in.
	public BusboyProject() {
		//BusboyProject window = new BusboyProject();
		initialize();
		this.frame.setVisible(true);
	}

	
	// The contents of the frame would be initialized here.
	private void initialize() {
		
		// Here I declared a new statement "new run for busboy" so that I would be able to do some testing on my function. It would contain the initial statuses
		// of each table. 
		System.out.println("NEW RUN FOR BUSBOY");
		System.out.println("------------------------");
		
		// A new frame for the busboy GUI is declared here, as well as its particular specifications, like its size and what happens when it is closed (just exits)
		// Its card layout will also be declared here, which means that any newly declared panels will sit on the frame like a deck of cards, and can be
		// "shuffled" through as required by the code.
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		// A new panel is declared here, and will be the welcome window. It will contain several buttons, and titles to help the interface be more user friendly.
		// Each new panel will be declared this way, and will have its own background, and will be set visible and invisible by action listeners so that panels
		// can be swapped through easily, while having each of their states saved. 
		
		final JPanel Panel_1_Welcome = new JPanel();
		Panel_1_Welcome.setBackground(new Color(255, 255, 153));
		frame.getContentPane().add(Panel_1_Welcome, "Busboy Interface");
		Panel_1_Welcome.setLayout(null);
		Panel_1_Welcome.setVisible(true);
		
		// This is the format for a new button declaration. Each button will have its own size, location on the panel, font style, color, and will be added to 
		// the panel in such a format. (Many buttons will be declared throughout the code).
		JButton btnBusboyInterface = new JButton("Change Table Status");
		btnBusboyInterface.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnBusboyInterface.setForeground(new Color(255, 0, 0));
		btnBusboyInterface.setBackground(SystemColor.controlHighlight);
		btnBusboyInterface.setBounds(233, 188, 407, 97);
		Panel_1_Welcome.add(btnBusboyInterface);
		
		JButton button = new JButton("Logout");
		button.setForeground(Color.RED);
		button.setFont(new Font("Papyrus", Font.BOLD, 28));
		button.setBackground(SystemColor.controlHighlight);
		button.setBounds(233, 336, 407, 97);
		Panel_1_Welcome.add(button);
		
		JLabel lblBusboyInterface = new JLabel("Busboy Interface",SwingConstants.CENTER);
		lblBusboyInterface.setForeground(new Color(0, 0, 255));
		lblBusboyInterface.setFont(new Font("Mistral", Font.BOLD, 46));
		lblBusboyInterface.setBounds(259, 0, 362, 162);
		Panel_1_Welcome.add(lblBusboyInterface);
		
		final JPanel panel_2_TableStatus = new JPanel();
		panel_2_TableStatus.setBackground(UIManager.getColor("Panel.background"));
		frame.getContentPane().add(panel_2_TableStatus, "Table Status");
		panel_2_TableStatus.setLayout(null);
		Panel_1_Welcome.setVisible(false);
	
		JButton button_2 = new JButton("Logout");
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Papyrus", Font.BOLD, 28));
		button_2.setBackground(SystemColor.controlHighlight);
		button_2.setBounds(196, 449, 223, 68);
		panel_2_TableStatus.add(button_2);
		
		JLabel lblTableStatus = new JLabel("Table Status", SwingConstants.CENTER);
		lblTableStatus.setForeground(Color.BLUE);
		lblTableStatus.setFont(new Font("Mistral", Font.BOLD, 46));
		lblTableStatus.setBounds(260, 36, 362, 76);
		panel_2_TableStatus.add(lblTableStatus);
		
		JButton btnPrevious = new JButton("<- Previous");
		btnPrevious.setForeground(Color.RED);
		btnPrevious.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnPrevious.setBackground(SystemColor.controlHighlight);
		btnPrevious.setBounds(41, 36, 223, 76);
		panel_2_TableStatus.add(btnPrevious);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.setForeground(Color.RED);
		btnNext.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnNext.setBackground(SystemColor.controlHighlight);
		btnNext.setBounds(632, 36, 223, 76);
		panel_2_TableStatus.add(btnNext);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setForeground(Color.RED);
		btnHelp.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnHelp.setBackground(SystemColor.controlHighlight);
		btnHelp.setBounds(481, 449, 219, 68);
		panel_2_TableStatus.add(btnHelp);
		
		/********************************************/
		System.out.println("INITIAL TABLE STATUSES:");
		System.out.println("------------------------");
		/********************************************/
		
		// These buttons will be indicators showing the colors of the individual table status. If these buttons are visible, then the indicator will be red, and 
		// if they are not, then they will be set invisible and an indicator behind them will glow green. Green represents a clean table, and Red represents a 
		// dirty table.
		
		Table_1_i = new JButton("");
		Table_1_i.setEnabled(false);
		Table_1_i.setBackground(new Color(255, 51, 0));
		Table_1_i.setBounds(91, 224, 223, 27);
		panel_2_TableStatus.add(Table_1_i);
		
		Table_2_i = new JButton("");
		Table_2_i.setEnabled(false);
		Table_2_i.setBackground(new Color(255, 51, 0));
		Table_2_i.setBounds(341, 224, 223, 27);
		panel_2_TableStatus.add(Table_2_i);
		
		Table_3_i = new JButton("");
		Table_3_i.setEnabled(false);
		Table_3_i.setBackground(new Color(255, 51, 0));
		Table_3_i.setBounds(600, 224, 223, 27);
		panel_2_TableStatus.add(Table_3_i);
		
		Table_4_i = new JButton("");
		Table_4_i.setEnabled(false);
		Table_4_i.setBackground(new Color(255, 51, 0));
		Table_4_i.setBounds(91, 377, 223, 27);
		panel_2_TableStatus.add(Table_4_i);
		
		Table_5_i = new JButton("");
		Table_5_i.setEnabled(false);
		Table_5_i.setBackground(new Color(255, 51, 0));
		Table_5_i.setBounds(341, 377, 223, 27);
		panel_2_TableStatus.add(Table_5_i);
		
		Table_6_i = new JButton("");
		Table_6_i.setEnabled(false);
		Table_6_i.setBackground(new Color(255, 51, 0));
		Table_6_i.setBounds(600, 377, 223, 27);
		panel_2_TableStatus.add(Table_6_i);
		
		
		// The following represents the initial statuses of the table. If the indicator buttons are green, then the table is clean, or else it is unclean.
		if(Table_1_i.isVisible()){
			System.out.println("Table 1: Unclean");
		} else {System.out.println("Table 1: Clean");}
		if(Table_2_i.isVisible()){
			System.out.println("Table 2: Unclean");
		} else {System.out.println("Table 2: Clean");}
		if(Table_3_i.isVisible()){
			System.out.println("Table 3: Unclean");
		} else {System.out.println("Table 3: Clean");}
		if(Table_4_i.isVisible()){
			System.out.println("Table 4: Unclean");
		} else {System.out.println("Table 4: Clean");}
		if(Table_5_i.isVisible()){
			System.out.println("Table 5: Unclean");
		} else {System.out.println("Table 5: Clean");}
		if(Table_6_i.isVisible()){
			System.out.println("Table 6: Unclean");
		} else {System.out.println("Table 6: Clean");}
		System.out.println("------------------------");
		
		
		// The buttons are used to display options for the table once the table is selected. They are toggle buttons since it is easier to activate a new panel
		// once they are selected.
		
		final JToggleButton Table1 = new JToggleButton("Table 1");
		Table1.setForeground(new Color(255, 51, 0));
		Table1.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table1.setBounds(91, 149, 223, 76);
		panel_2_TableStatus.add(Table1);
		
		final JToggleButton Table2 = new JToggleButton("Table 2");
		Table2.setForeground(new Color(255, 51, 0));
		Table2.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table2.setBounds(341, 149, 223, 76);
		panel_2_TableStatus.add(Table2);
		
		final JToggleButton Table3 = new JToggleButton("Table 3");
		Table3.setForeground(new Color(255, 51, 0));
		Table3.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table3.setBounds(600, 149, 223, 76);
		panel_2_TableStatus.add(Table3);
		
		final JToggleButton Table4 = new JToggleButton("Table 4");
		Table4.setForeground(new Color(255, 51, 0));
		Table4.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table4.setBounds(91, 300, 223, 76);
		panel_2_TableStatus.add(Table4);
		
		final JToggleButton Table5 = new JToggleButton("Table 5");
		Table5.setForeground(new Color(255, 51, 0));
		Table5.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table5.setBounds(341, 300, 223, 76);
		panel_2_TableStatus.add(Table5);
		
		final JToggleButton Table6 = new JToggleButton("Table 6");
		Table6.setForeground(new Color(255, 51, 0));
		Table6.setFont(new Font("Papyrus", Font.BOLD, 28));
		Table6.setBounds(600, 300, 223, 76);
		panel_2_TableStatus.add(Table6);
		
		JButton button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(91, 224, 223, 27);
		panel_2_TableStatus.add(button_1);
		
		JButton button_3 = new JButton("");
		button_3.setEnabled(false);
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(341, 224, 223, 27);
		panel_2_TableStatus.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setEnabled(false);
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(600, 224, 223, 27);
		panel_2_TableStatus.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setEnabled(false);
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(91, 377, 223, 27);
		panel_2_TableStatus.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setEnabled(false);
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(341, 377, 223, 27);
		panel_2_TableStatus.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setEnabled(false);
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(600, 377, 223, 27);
		panel_2_TableStatus.add(button_7);
		
		final JPanel panel_3_Status = new JPanel();
		panel_3_Status.setBackground(new Color(255, 204, 255));
		frame.getContentPane().add(panel_3_Status, "Status of Table");
		panel_3_Status.setLayout(null);
		
		JLabel lblStatus = new JLabel("Status", SwingConstants.CENTER);
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setFont(new Font("Mistral", Font.BOLD, 46));
		lblStatus.setBounds(243, 33, 362, 76);
		panel_3_Status.add(lblStatus);
		
		JButton btnCleanAndReady = new JButton("Clean and ready for customers!");
		btnCleanAndReady.setForeground(Color.RED);
		btnCleanAndReady.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnCleanAndReady.setBackground(SystemColor.controlHighlight);
		btnCleanAndReady.setBounds(184, 178, 507, 76);
		panel_3_Status.add(btnCleanAndReady);
		
		JButton btnTableIsUnclean = new JButton("Table is unclean and not ready");
		btnTableIsUnclean.setForeground(Color.RED);
		btnTableIsUnclean.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnTableIsUnclean.setBackground(SystemColor.controlHighlight);
		btnTableIsUnclean.setBounds(184, 319, 507, 76);
		panel_3_Status.add(btnTableIsUnclean);
		
		JButton btnReturn = new JButton("< Return ");
		btnReturn.setForeground(Color.RED);
		btnReturn.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnReturn.setBackground(SystemColor.controlHighlight);
		btnReturn.setBounds(33, 37, 206, 76);
		panel_3_Status.add(btnReturn);
		
		final JPanel panel_4_Updated = new JPanel();
		panel_4_Updated.setBackground(new Color(204, 153, 255));
		frame.getContentPane().add(panel_4_Updated, "Thank you, this table has been updated!");
		panel_4_Updated.setLayout(null);
		
		JLabel lblThankYouThis = new JLabel("Thank you! This table has been updated.", SwingConstants.CENTER);
		lblThankYouThis.setForeground(Color.BLUE);
		lblThankYouThis.setFont(new Font("Mistral", Font.BOLD, 46));
		lblThankYouThis.setBounds(60, 157, 771, 76);
		panel_4_Updated.add(lblThankYouThis);
		
		JButton btnReturnToTable = new JButton("< Return to table status");
		btnReturnToTable.setForeground(Color.RED);
		btnReturnToTable.setFont(new Font("Papyrus", Font.BOLD, 28));
		btnReturnToTable.setBackground(SystemColor.controlHighlight);
		btnReturnToTable.setBounds(184, 305, 507, 76);
		panel_4_Updated.add(btnReturnToTable);
		
		
		// The next code represents listeners. 
		// When a button is pressed, a panel will be invisible, and another will be set to visible (or vice versa). This is to flip between paneles./
		// Listeners can also activate different indicators to go on and off depending on the type of table selected.
		
		/*************************************/
		// Listeners Panel 1 (Busboy Interface)
		/*************************************/
		btnBusboyInterface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_1_Welcome.setVisible(false);
				panel_2_TableStatus.setVisible(true);
				
			}
		});
		
		/***********************************/
		//Listeners Panel 2 (Table Statuses)
		/***********************************/
		
		//Table1
		Table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_TableStatus.setVisible(false);
				panel_3_Status.setVisible(true);
			}
				});
		
		//Table2
				Table2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_2_TableStatus.setVisible(false);
						panel_3_Status.setVisible(true);
					}
				});
		//Table3
				Table3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_2_TableStatus.setVisible(false);
						panel_3_Status.setVisible(true);
					}
				});
		//Table4
				Table4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_2_TableStatus.setVisible(false);
						panel_3_Status.setVisible(true);
					}
				});
		//Table5
				Table5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_2_TableStatus.setVisible(false);
						panel_3_Status.setVisible(true);
					}
				});
		//Table6
				Table6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_2_TableStatus.setVisible(false);
						panel_3_Status.setVisible(true);
					}
				});
			
		
		//Next
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "No more tables available!");
			}
		});
		//Previous
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "No more tables available!");
			}
		});
		
		//Help
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "A Red indicator means the table is UnClean and not ready. A non-yellow indicator means the table is Clean and Ready.");
			}
		});
		
		/********************************************/
		//Listeners Panel 3 (Individual Stable Status)
		/********************************************/
		
		//Return
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Table1.isSelected()){
					Table1.setSelected(false);
				}
				if(Table2.isSelected()){
					Table2.setSelected(false);
				}
				if(Table3.isSelected()){
					Table3.setSelected(false);
				}
				if(Table4.isSelected()){
					Table4.setSelected(false);
				}
				if(Table5.isSelected()){
					Table5.setSelected(false);
				}
				if(Table6.isSelected()){
					Table6.setSelected(false);
				}
				panel_3_Status.setVisible(false);
				panel_2_TableStatus.setVisible(true);
				
			}
		});
		
		//Clean and Ready
		btnCleanAndReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Table1.isSelected()){
					Table_1_i.setVisible(false);
					Table1.setSelected(false);
					System.out.println("Table 1 Updated: Clean");
				}
				if(Table2.isSelected()){
					Table_2_i.setVisible(false);
					Table2.setSelected(false);
					System.out.println("Table 2 Updated: Clean");
				}
				if(Table3.isSelected()){
					Table_3_i.setVisible(false);
					Table3.setSelected(false);
					System.out.println("Table 3 Updated: Clean");
				}
				if(Table4.isSelected()){
					Table_4_i.setVisible(false);
					Table4.setSelected(false);
					System.out.println("Table 4 Updated: Clean");
				}
				if(Table5.isSelected()){
					Table_5_i.setVisible(false);
					Table5.setSelected(false);
					System.out.println("Table 5 Updated: Clean");
				}
				if(Table6.isSelected()){
					Table_6_i.setVisible(false);
					Table6.setSelected(false);
					System.out.println("Table 6 Updated: Clean");
				}
				panel_3_Status.setVisible(false);
				panel_2_TableStatus.setVisible(true);
				//Update system with new table status (clean and ready)
			}
		});
		
		//Unclean and not Ready
		btnTableIsUnclean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Table1.isSelected()){
					Table_1_i.setVisible(true);
					Table1.setSelected(false);
					System.out.println("Table 1 Updated: Unclean");
					
				}
				if(Table2.isSelected()){
					Table_2_i.setVisible(true);
					Table2.setSelected(false);
					System.out.println("Table 2 Updated: Unclean");
				}
				if(Table3.isSelected()){
					Table_3_i.setVisible(true);
					Table3.setSelected(false);
					System.out.println("Table 3 Updated: Unclean");
				}
				if(Table4.isSelected()){
					Table_4_i.setVisible(true);
					Table4.setSelected(false);
					System.out.println("Table 4 Updated: Unclean");
				}
				if(Table5.isSelected()){
					Table_5_i.setVisible(true);
					Table5.setSelected(false);
					System.out.println("Table 5 Updated: Unclean");
				}
				if(Table6.isSelected()){
					Table_6_i.setVisible(true);
					Table6.setSelected(false);
					System.out.println("Table 6 Updated: Unclean");
				}
				panel_3_Status.setVisible(false);
				panel_2_TableStatus.setVisible(true);
				
				//Update system with new table status (unclean and not ready)
				}
		
			
		});
		
		//FINAL INFORMATION
		//After the logout button is pressed, then the final statuses of the tables will be displayed on the console for testing (to make sure the program did
		//as it was supposed to do)
	
		/************************************/
		// Logouts
		/************************************/
		
		// Logout main screen
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,"Thank you for using the system!");
						System.out.println("FINAL STATUSES OF TABLES");
						System.out.println("------------------------");
						if(Table_1_i.isVisible()){
							System.out.println("Table 1: Unclean");
						} else {System.out.println("Table 1: Clean");}
						if(Table_2_i.isVisible()){
							System.out.println("Table 2: Unclean");
						} else {System.out.println("Table 2: Clean");}
						if(Table_3_i.isVisible()){
							System.out.println("Table 3: Unclean");
						} else {System.out.println("Table 3: Clean");}
						if(Table_4_i.isVisible()){
							System.out.println("Table 4: Unclean");
						} else {System.out.println("Table 4: Clean");}
						if(Table_5_i.isVisible()){
							System.out.println("Table 5: Unclean");
						} else {System.out.println("Table 5: Clean");}
						if(Table_6_i.isVisible()){
							System.out.println("Table 6: Unclean");
						} else {System.out.println("Table 6: Clean");}
						System.out.println("------------------------");
						System.out.println("RUN END");
						new LoginWindow();
						frame.dispose();
					}
				});
			// Panel 2 Logout
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,"Thank you for using the system!");
						System.out.println("FINAL STATUSES OF TABLES");
						System.out.println("------------------------");
						if(Table_1_i.isVisible()){
							System.out.println("Table 1: Unclean");
						} else {System.out.println("Table 1: Clean");}
						if(Table_2_i.isVisible()){
							System.out.println("Table 2: Unclean");
						} else {System.out.println("Table 2: Clean");}
						if(Table_3_i.isVisible()){
							System.out.println("Table 3: Unclean");
						} else {System.out.println("Table 3: Clean");}
						if(Table_4_i.isVisible()){
							System.out.println("Table 4: Unclean");
						} else {System.out.println("Table 4: Clean");}
						if(Table_5_i.isVisible()){
							System.out.println("Table 5: Unclean");
						} else {System.out.println("Table 5: Clean");}
						if(Table_6_i.isVisible()){
							System.out.println("Table 6: Unclean");
						} else {System.out.println("Table 6: Clean");}
						System.out.println("------------------------");
						System.out.println("RUN END");
						new LoginWindow();
						frame.dispose();
					}
				});
		}
	/**
	 * Launch the application.
	 */
	
	// The following function is meant to communicate with the Host GUI to signify that the table statuses have been updated. It uses handlers, but it will be 
	// later implemented to use a database. For this demo, this function is irrelevant.
	public void updateTables()
	{
		//FINAL INFORMATION
		if(Table_1_i.isVisible()){
			//table1_v.Table_enable = true;
			//Disable_Table_1 = true;
			tablehandler.unset(1);
			//Table 1: Unclean
		} else {
			//table1_v.Table_enable = true;
			tablehandler.set(1);
			//Enable_Table_1 = true;
			/*Table 2: Clean*/}
		
		if(Table_2_i.isVisible()){
			//table2_v.Table_enable = false;
			//Disable_Table_2 = true;
			tablehandler.unset(2);
			//Table 2: Unclean
		} else {
			//table2_v.Table_enable = true;
			tablehandler.set(2);
			//Enable_Table_2 = true;
			/*Table 2:Clean*/}
		
		if(Table_3_i.isVisible()){
			//table3_v.Table_enable = false;
			//Disable_Table_3 = true;
			tablehandler.unset(3);
			//Table 3: Unclean
		} else {
			//table3_v.Table_enable = true;
			tablehandler.set(3);
			//Enable_Table_3 = true;
			/*Table 3:Clean*/}
		
		if(Table_4_i.isVisible()){
			//table4_v.Table_enable = false;
			tablehandler.unset(4);
			//Disable_Table_4 = true;
			//Table 4: Unclean
		} else {
			//table4_v.Table_enable = true;
			tablehandler.set(4);
			//Enable_Table_4 = true;
			/*Table 4:Clean*/}
		
		if(Table_5_i.isVisible()){
			//table5_v.Table_enable = false;
			tablehandler.unset(5);
			//Disable_Table_5 = true;
			//Table 5: Unclean
		} else {
			//table5_v.Table_enable = true;
			tablehandler.set(5);
			//Enable_Table_5 = true;
			/*Table 5:Clean*/}
		
		if(Table_6_i.isVisible()){
			//table6_v.Table_enable = false;
			tablehandler.unset(6);
			//Disable_Table_6 = true;
			//Table 6: Unclean
		} else {
			//table6_v.Table_enable = true;
			tablehandler.set(6);
			///Enable_Table_6 = true;
			/*Table 6:Clean*/}
		
	}
	
	// Used to eliminate a simple error. Irrelevant.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
		


