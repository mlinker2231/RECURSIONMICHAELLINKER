import java.awt.event.*;
import javax.swing.*;

public class KeyListenerTest extends JFrame {
	
	public KeyListenerTest(){
		KeyListenerObject obj = new KeyListenerObject( );
		addKeyListener(obj);
	}

	public static void main( String args[] ) {
		KeyListenerTest window = new KeyListenerTest();
		window.setSize(200,200);
		window.setVisible( true );
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class KeyListenerObject implements KeyListener {
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+" typed");
		}
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar()+" pressed");
		}
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyChar()+" released");
		}
	}
}