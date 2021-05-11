import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerTest extends JFrame {
	
	public MouseListenerTest() {
		
		MousePressListener listener = new MousePressListener();
		addMouseListener( listener );
	}

	public static void main( String args[] ) {
		MouseListenerTest window = new MouseListenerTest();
		
		window.setSize(200,200);
		window.setVisible( true );
	}
	
	private class MousePressListener implements MouseListener {
		
		public void mousePressed( MouseEvent event ) {
			System.out.println( "MousePressed= " + event.getX() );
		}
		
		public void mouseReleased( MouseEvent event ) {
			System.out.println( "MouseReleased= " + event.getX() );
		}
		
		public void mouseClicked( MouseEvent event ) {
			System.out.println( "MouseClicked= " + event.getX() );
		}
		
		public void mouseEntered( MouseEvent event ) {
			System.out.println( "MouseEntered= " + event.getX() );
		}
		
		public void mouseExited( MouseEvent event ) {
			System.out.println( "MouseExited= " + event.getX() );
		}
	}
}
