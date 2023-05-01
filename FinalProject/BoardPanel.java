import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.Image;
public class BoardPanel {
   public static JFrame boardFrame;
 
   public BoardPanel() {
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       int maxWidth = (int)screenSize.getWidth();
       int maxHeight = (int)screenSize.getHeight();
       //System.out.println(maxHeight + "height");
      
       //Border border = BorderFactory.createLineBorder(Color.green,3);
       //label.setBorder(border);
       //label.setBounds(0,0,height,height);
      
 
       // ImageIcon image = new ImageIcon("monopoly.png");
       JLabel label = new JLabel();
       Dimension labelMaxSize = new Dimension(maxHeight,maxHeight);
       label.setMaximumSize(labelMaxSize);
       // // label.setIcon(image);
 
       // BufferedImage img = null;
       // try {
       //     img = ImageIO.read(new File("monopoly.png"));
       // } catch (IOException e) {
       //     e.printStackTrace();
       // }
 
       // Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
       // ImageIcon imageIcon = new ImageIcon(dimg);
       //label.setIcon(imageIcon);
      
       label.setIcon(new ImageIcon(new ImageIcon("gameboard.png").getImage().getScaledInstance(maxHeight, maxHeight, Image.SCALE_DEFAULT)));
       boardFrame = new JFrame();
       boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       boardFrame.setResizable(true);
       //frame.setLayout(null);
 
       //this is causing resize and
       boardFrame.setMaximumSize(labelMaxSize);
       boardFrame.setSize(maxHeight,maxHeight);
       //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       boardFrame.setVisible(true);
       boardFrame.add(label);
       boardFrame.pack();
       //frame.createImage(producer)
     
       // getContentPane().addComponentListner(new ComponentAdapter() {
       //     public void componentResized(ComponentEvent e) {
       //         Component c = (Component)e.getSource();
       //     }
       // });
 
       //not in use rn
       Container cPane = boardFrame.getContentPane();
       ComponentListener componenetListener = new ComponentListener() {
       @Override
       public void componentHidden(ComponentEvent event) {
      
           dump("Hidden");
      
       }
       @Override
       public void componentMoved(ComponentEvent event) {
      
           dump("Moved");
      
       }
       @Override
       public void componentResized(ComponentEvent event) {
      
           dump("Resized");
           resize(event);
           //frame.pack();
      
       }
       @Override
       public void componentShown(ComponentEvent event) {
      
           dump("Shown");
      
       }
       private void resize(ComponentEvent event) {
      
           int w = (int)event.getComponent().getSize().getWidth();
           int h = (int)event.getComponent().getSize().getHeight();
           int larger;
           if (w >= h) {
               larger = w;
           }
           else {
               larger = h;
           }
           event.getComponent().setSize(larger, larger);
       }
       public void dump (String str) {
           System.out.println(str);
       }
       };
          
       boardFrame.addComponentListener(componenetListener);
      
      
      
           }
   // public static void main(String[] args) {
   //     new BoardPanel();
   // }
 
 
}
