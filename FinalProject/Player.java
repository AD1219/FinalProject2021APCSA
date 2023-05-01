import java.util.ArrayList;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Player implements ActionListener{
  
   private int money;
   ArrayList<Card> properties;
   private boolean isJailed;
   private int doubleCounter;
   private int getOutFree;
   private String name;
   private boolean isBankrupt;
 
   private JPanel panel;
   private JFrame frame;
   private JLabel playerLabel;
   private JTextField playerName;
   private JButton enterButton;
   private Card currentCard;
   private int currentPosition;
   private int numRoundsInJail;
 
   public Player()
   {
       // Ask user for name
       numRoundsInJail = 0;
       money = 1500;
       properties = new ArrayList<Card>();
       isJailed = false;
       doubleCounter = 0;
       getOutFree = 0;
       isBankrupt = false;
       currentPosition = 0;
 
       frame = new JFrame();
 
       playerLabel = new JLabel("Player Name");
       playerLabel.setBounds(10, 20, 200, 25);
 
       playerName = new JTextField(20);
       playerName.setBounds(150, 20, 165, 25);
 
       enterButton = new JButton("Enter");
       enterButton.setBounds(320, 20, 80, 25);
       enterButton.addActionListener(this);
       
       panel = new JPanel();
       panel.setLayout(null);
       panel.add(playerLabel);
       panel.add(playerName);
       panel.add(enterButton);
 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(430, 100);
       frame.add(panel);
       frame.setVisible(true);
      
 
   }
 
   public JLabel setLabel() {
       return this.playerLabel;
   }
 
   public boolean hasProperty(Card card) {
       for (int i = 0; i < properties.size(); i++) {
           if (properties.get(i).getName().equals(card.getName())) {
               return true;
           }
       }
       return false;
   }
 
   public int numOfUtilCard() {
       int count = 0;
       for (int i = 0; i < properties.size(); i++) {
           if(properties.get(i) instanceof UtilCard)
           {
               count ++;
           }
       }
       return count;
   }
    public int numOfRRCard() {
       int count = 0;
       for (int i = 0; i < properties.size(); i++) {
           if(properties.get(i) instanceof RRCard)
           {
               count ++;
           }
       }
       return count;
   }
  
 
   public int getNumRoundsInJail() {
       return this.numRoundsInJail;
   }
 
   public void addNumRoundsInJail(int i) {
       numRoundsInJail += i;
   }
 
   public void resetNumRoundsInJail() {
       numRoundsInJail = 0;
   }
 
   public int getCurrentPosition()
   {
       return this.currentPosition;
   }
 
   public void setCurrentPosition(int p) {
       this.currentPosition = p;
   }
 
   public void addMoney(int num)
   {
       this.money += num;
   }
   public void subtractMoney(int num)
   {
       this.money -= num;
   }
   public void addProperty(Card pc)
   {
       properties.add(pc);
   }
   public void removeProperty(Card pc)
   {
       properties.remove(pc);
   }
   public boolean ownsProperty(Card c)
   {
       return properties.contains(c);
   }
   public void toJail()
   {
       this.isJailed = true;
   }
   public void rolledDouble()
   {
       this.doubleCounter++;
   }
   public void newGoF()
   {
       this.getOutFree++;
   }
   public int getMoney()
   {
       return this.money;
   }
   public boolean isJailed()
   {
       return this.isJailed;
   }
   public void setJailed(boolean b) {
       isJailed = b;
   }
 
   public int getdoubleCounter()
   {
       return this.doubleCounter;
   }
   public int getGoF()
   {
       return this.getOutFree;
   }
   public String getName()
   {
       return this.name;
   }
   public ArrayList<Card> getProperties() {
       return properties;
   }
   public void setBankrupt(boolean bankrupt) {
       isBankrupt = bankrupt;
   }
   public boolean isBankrupt() {
       return isBankrupt;
   }
 
   @Override
   public void actionPerformed(ActionEvent e)
   {
       // TODO Auto-generated method stub
       name = playerName.getText();
       frame.dispose();
 
       new PlayerPlatform(this);
      
 
   }
 
}

