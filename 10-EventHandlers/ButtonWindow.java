import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonWindow extends JFrame {

	private JButton helloButton;
	
	public ButtonWindow() {
		
		ActionEventHandler handler = new ActionEventHandler();
		
		Container container = getContentPane();
		container.setLayout( new FlowLayout() );
		
		helloButton = new JButton( "Hello" );
		helloButton.addActionListener( handler );
		container.add( helloButton );
		
	}

	public static void main( String args[] ) {
		ButtonWindow window = new ButtonWindow();
		
		window.setSize(200,200);
		window.setVisible( true );
	}
	
	private class ActionEventHandler
		implements ActionListener {
		
		public void actionPerformed( ActionEvent event ) {
			
			System.out.println( event.getSource() );
		
		}
	}
}
