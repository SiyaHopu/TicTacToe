import javax.swing.*;
import java.awt.*;


public class Board{
  
  JFrame gameBoard;
  // Constuctor
  
  Board(int rows, int cols){
    
    // Initiates the game board
    gameBoard =  new JFrame();
    
    // Sets the 3x3 grid layout.
    gameBoard.setLayout(new GridLayout(rows,cols));
    gameboard.setSize(300,300);
    gameBoard.setVisible(true);
    
  }
    
  public static void main(String [] args){
    
    int rows = 3;
    int cols = 3;
    
    new Board(rows, cols);
    
  }
}
