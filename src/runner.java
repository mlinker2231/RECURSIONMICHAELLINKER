import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class runner {
    public static void main(String[] args) {
//
//        JFrame f = new JFrame("Button Example");
//        JButton b = new JButton("Click Here");
//        b.setBounds(50, 100, 95, 30);
//        b.setBorderPainted(true);
//        b.setBackground(Color.red);
//        f.add(b);
//        f.setSize(400, 400);
//        f.setLayout(null);
//        f.setVisible(true);
        ShowColors application = new ShowColors();

        JFrame f=new JFrame("Button Example");
        Graphics c = makeColorPlain(Color.BLUE);
        c.fillRect(50,50,100,100);
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Javatpoint.");
                application.pain;
            }
        });
        f.add(b);f.add(tf);
        f.setBackground(Color.red);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static Graphics makeColorPlain(Color c) {
        Graphics g = new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public Color getColor() {
                return c;
            }

            @Override
            public void setColor(Color c) {

            }


        };
        return g;
    }

    public static class ShowColors extends JFrame {

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

    }
}

