// Fig. 12.10: ButtonTest.java
// Creating JButtons.

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;
import javax.swing.border.Border;

public class ButtonTest extends JFrame {
   private JButton plainButton, fancyButton;

   // set up GUI
   public ButtonTest()
   {
      super( "Testing Buttons" );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // create buttons
      plainButton = new JButton( "Plain Button" );
      plainButton.setBackground(Color.green);
      plainButton.updateUI();
      container.add( plainButton );

      Icon bug1 = new ImageIcon( "bug1" );
      Icon bug2 = new ImageIcon( "bug2.gif" );
      fancyButton = new JButton( "Fancy Button", bug1 );
      container.add( fancyButton );

      // create an instance of inner class ButtonHandler
      // to use for button event handling 
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );

      setSize( 275, 100 );
      setVisible( true );
   }

   // execute application
   public static void main( String args[] )
   {
      ButtonTest application = new ButtonTest();

      application.setDefaultCloseOperation(
              JFrame.HIDE_ON_CLOSE );
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener {

      // handle button event
      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( null,
            "You pressed: " + event.getActionCommand() );
         plainButton.setBackground(Color.green);
         plainButton.updateUI();
         plainButton.disable();
      }

   }  // end private inner class ButtonHandler

}  // end class ButtonTest

