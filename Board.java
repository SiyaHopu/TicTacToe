import javax.swing.JFrame;
import java.awt.*;


public class Board{
  
  JFrame gameBoard;
  
  Board(){
    
    gameBoard =  new JFrame();
    
    gameBoard.setLayout(new GridLayout(rows,cols));
    gameboard.setSize(300,300);
    gameBoard.setVisible(true);
    
  }
    
  public static void main(String [] args){
    
    new Board();
    
  }
}
