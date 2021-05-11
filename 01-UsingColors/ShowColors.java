// Fig. 11.5: ShowColors.java
// Demonstrating Colors.

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class ShowColors extends JFrame {

   // constructor sets window's title bar string and dimensions
   public ShowColors()
   {
      super( "Using colors" );

      setSize( 400, 130 );
      show();
   }

   // draw rectangles and Strings in different colors
   public void paint( Graphics g )
   {
      // call superclass's paint method
      super.paint( g );

      // set new drawing color using integers
      g.setColor( new Color( 255, 0, 0 ) );
      g.fillRect( 25, 25, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 40 );

      // set new drawing color using floats
      g.setColor( new Color( 0.0f, 1.0f, 0.0f ) );
      g.fillRect( 25, 50, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 65 );

      // set new drawing color using static Color objects
      g.setColor( Color.blue );
      g.fillRect( 25, 75, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 90 );

      // display individual RGB values
      Color color = Color.magenta;
      g.setColor( color );
      g.fillRect( 25, 100, 100, 20 );
      g.drawString( "RGB values: " + color.getRed() + ", " +
         color.getGreen() + ", " + color.getBlue(), 130, 115 );
   }

   // execute application
   public static void main( String args[] )
   {
      ShowColors application = new ShowColors();

      application.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
   }

}  // end class ShowColors

