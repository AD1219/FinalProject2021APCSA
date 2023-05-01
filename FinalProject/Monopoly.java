import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowListener;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.Color;
/**
* Sources:
* - Create Gui: https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=7s&ab_channel=AlexLee
*/
public class Monopoly implements ActionListener{
   private JPanel panel;
   private JFrame frame;
   private JLabel playerLabel;
   private JTextField playersText;
   private JButton enterButton;
   private JLabel unsuccessful;
   public static ArrayList<Player> players;
  
 
   public Monopoly() {
 
       players = new ArrayList<Player>();
       frame = new JFrame();
 
       // Ask how many players would like to play
       playerLabel = new JLabel("Number of Players");
       playerLabel.setBounds(10, 20, 200, 25);
 
       playersText = new JTextField(20);
       playersText.setBounds(150, 20, 165, 25);
 
       enterButton = new JButton("Enter");
       enterButton.setBounds(320, 20, 80, 25);
       enterButton.addActionListener(this);
 
       unsuccessful = new JLabel("");
       unsuccessful.setBounds(100, 50, 300, 25);
       unsuccessful.setForeground(Color.RED);
 
       panel = new JPanel();
       panel.setLayout(null);
       panel.add(playerLabel);
       panel.add(playersText);
       panel.add(enterButton);
       panel.add(unsuccessful);
 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(430, 100);
       frame.add(panel);
       frame.setVisible(true);
 
      
   }
   public ArrayList<Player> getList()
   {
       return players;
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       // TODO Auto-generated method stub
 
       String strPlayers = playersText.getText();
       int numPlayers = 0;
      
       try {
           numPlayers = Integer.parseInt(strPlayers);
 
           if (numPlayers < 2 || numPlayers > 4) {
               unsuccessful.setText("Please enter a number betweem 2-4");
           }
           else {
               frame.dispose();
  
               // create the different players
               for (int i = 0; i < numPlayers; i++) {
                   players.add(new Player());
               }
          
               System.out.println("size of players list: " + players.size());
 
           }
       }
       catch (NumberFormatException ex) {
           unsuccessful.setText("Please enter a number betweem 2-4");
       }  
 
   }
 
   public static void main (String[] args) {
       new Monopoly();
       System.out.println(players.size());
   }
}

