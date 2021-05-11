import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Increment extends JFrame implements ActionListener {

	private int count = 0, total = 0, INCREMENT = 5;
	
	private JButton button;
	
	public Increment() {
		Container container = getContentPane();
		button = new JButton( "Click to Increment");
		button.addActionListener(this);
		container.add(button);
	}

	public static void main(String args[]) {
		Increment inc = new Increment();
		
		inc.setSize(250,250);
		inc.setVisible(true);
		
		inc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
	}
	
	public void actionPerformed( ActionEvent actionEvent ) {
		total+=INCREMENT;
		count++;
		showStatus("After Increment " + count + " :Total = " + total );
	}
}
