import javax.swing.BoxLayout;
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
 * Sources: - Create Gui:
 * https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=7s&ab_channel=AlexLee
 */
public class GameMode
    implements ActionListener
{
    private JPanel                  panel;
    private JFrame                  frame;
    private JButton                 enterButton;
    private JLabel                  unsuccessful;
    private JLabel                  value;
    public static ArrayList<Player> players;
    private int rollVal;
    public GameMode()
    {
        rollVal = 0;
        players = new ArrayList<Player>();
        frame = new JFrame();
        value = new JLabel();
        // Ask how many players would like to play

        enterButton = new JButton("Roll");
        enterButton.setBounds(320, 20, 300, 50);
        enterButton.addActionListener(this);

        unsuccessful = new JLabel("");
        unsuccessful.setBounds(100, 50, 300, 25);
        unsuccessful.setForeground(Color.RED);

        value.setBounds(320, 20, 100, 50);
        value.setLocation(235, 550);
        panel = new JPanel();
        panel.setLayout(null);
        //panel.add(playerLabel);
        //panel.add(playersText);
        panel.add(enterButton);
        enterButton.setLocation(100, 500);
        panel.add(unsuccessful);
        panel.add(value);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
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
        rollVal = (int)((Math.random()*6)+1);
        value.setText("Rolled Number = " + rollVal+"");
    }


    public static void main(String[] args)
    {
        new GameMode();
        System.out.println(players.size());
    }
}
