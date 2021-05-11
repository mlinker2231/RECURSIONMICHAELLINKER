
import java.awt.*;
import javax.swing.*;

public class TrivialApplication extends JFrame {

	public TrivialApplication() {
		
		super( "Test of Container");
		
		JTextArea outputArea = new JTextArea();
		
		Container container = getContentPane();
		
		container.add( outputArea );
			
		int result;
		String output= "";
			
		for( int x = 1; x <= 10; x++ ) {
			result = square( x );
			output += "The square of " + x + " is " + result + "\n";
		}
			
		outputArea.setText(output);
		
	}	
			
	public int square( int y ) {
		return y*y;
	}

	public static void main(String args[]) {
		
		TrivialApplication trivial = new TrivialApplication();
		
		trivial.setSize(250,250);
		trivial.setVisible(true);
		
		trivial.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
	}
}
