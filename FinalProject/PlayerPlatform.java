import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
 
public class PlayerPlatform {
  
   private JPanel panel;
   public static JFrame playerPlatformFrame;
   private JLabel moneyLabel;
   private JLabel propertiesLabel;
   private JLabel jailFreeLabel;
   private JLabel isJailed;
 
   public PlayerPlatform (Player player) {
 
       playerPlatformFrame = new JFrame();
 
       moneyLabel = new JLabel("Money: $" + player.getMoney());
       moneyLabel.setBounds(10, 20, 200, 25);
 
       propertiesLabel = new JLabel();
       propertiesLabel.setBounds(10, 50, 200, 25);
       String property = "Properties:\n";
       for (int i = 0; i < player.getProperties().size(); i++) {
           property += player.getProperties().get(i).getName() + "\n";
       }
       propertiesLabel.setText(property);
 
       jailFreeLabel = new JLabel("Number of Jail Free Cards: " + player.getGoF());
       jailFreeLabel.setBounds(10, 80, 200, 25);
 
       isJailed = new JLabel("Is Jailed: " + player.isJailed());
       isJailed.setBounds(10, 110, 200, 25);
 
       panel = new JPanel();
       panel.setLayout(null);
       panel.add(moneyLabel);
       panel.add(propertiesLabel);
       panel.add(jailFreeLabel);
       panel.add(isJailed);
 
       playerPlatformFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       playerPlatformFrame.setSize(430, 300);
       playerPlatformFrame.setTitle(player.getName());
       playerPlatformFrame.add(panel);
       playerPlatformFrame.setVisible(true);
   }
 
}

