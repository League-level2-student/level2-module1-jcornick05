package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JFrame f;
	JPanel p;
	JButton a;
	JButton b;
	ArrayList<String> x = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook c = new GuestBook();
		c.play();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		
	}
	void play() {
		f = new JFrame();
		p = new JPanel();
		a = new JButton();
		b = new JButton();
	b.setText("View Names");
	a.setText("Add Name");
	f.add(p);
	p.add(a);
	p.add(b);
	a.addActionListener(this);
	b.addActionListener(this);
	f.pack();
	f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked==a) {
			String i = JOptionPane.showInputDialog("Enter name here");
			x.add(i);
		}
		if(buttonClicked==b) {
			for (int i = 0; i < x.size(); i++) {
				String a = x.get(i);
				System.out.println("Guest #"+i+" "+a);
			}
			}
		
	}
	
	

	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	     
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	
	
}