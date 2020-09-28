import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.io.File; 
import java.io.IOException;

public class Menu implements ActionListener  {
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem1, menuItem2, menuItem3, menuItem4;
	
	public Menu() {
		
		System.out.print("Test");
		
		// Creating the Menu Bar
		menuBar = new JMenuBar();
		
		// Creating the drop down for the menu
		menu = new JMenu("Menu");
		menuBar.add(menu);
		
		// Creating the first Menu Item
		menuItem1 = new JMenuItem("Time and Date");
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		// Creating the first Menu Item
		menuItem2 = new JMenuItem("Text File");
		menuItem2.addActionListener(this);
		menu.add(menuItem2);
		
		// Creating the first Menu Item
		menuItem3 = new JMenuItem("Change Background Color");
		menuItem3.addActionListener(this);
		menu.add(menuItem3);
		
		// Creating the first Menu Item
		menuItem4 = new JMenuItem("Exit");
		menuItem4.addActionListener(this);
		menu.add(menuItem4);
		
		// Creating the JFrame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("User Interface I");
		frame.setSize(350, 350);
		frame.setVisible(true);
		frame.setJMenuBar(menuBar);
	
	}

	public static void main(String[] args) {
		
		new Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == menuItem1) {
			
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date date = new Date();
			JOptionPane.showMessageDialog(null, formatter.format(date), "Date and Time", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (e.getSource() == menuItem2) {
			
			try {
				File myObj = new File("log.txt");
				
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      }
			      else {
			        System.out.println("File already exists.");
			      }
				}

			catch (IOException i) {
			      System.out.println("An error occurred.");
			      i.printStackTrace();
			    }
			  }
		
		if (e.getSource() == menuItem3) {
			
			// Creating random green color
			Color Cgreen = new Color(51, 153, 51);
			
			// JFrame does not let you use a custom color
			frame.getContentPane().setBackground(Color.green);
			
		}
		
		if (e.getSource() == menuItem4) {
			
			System.exit(0);
		}
		
	}

}



