import java.awt.*;
import javax.swing.*;

public class Cells extends Board{
  
  public static void main(String [] args){
   
    JFrame frame = new JFrame();
    
    // Creates buttons or cells for each grid space of the game board.
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    
    //Adds each button to the game board.
    
    frame.add(b1);
    frame.add(b2);
    frame.add(b3);
    frame.add(b4);
    frame.add(b5);
    frame.add(b6);
    frame.add(b7);
    frame.add(b8);
    frame.add(b9);
    
  }
}
