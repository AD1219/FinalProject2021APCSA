import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
public class PlayerMovement{
   
   BoardPanel bp;
    public PlayerMovement(BoardPanel p){
        bp = p;
        final double propertySize = bp.boardFrame.getWidth() * 0.081;
        final double cornerSize = bp.boardFrame.getWidth() * 0.135;
        ArrayList<Dimension> centerLocs = new ArrayList<Dimension>(40);
        //
        centerLocs.add(0, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)(propertySize*9 + cornerSize * 1.5) ));
        centerLocs.add(1, new Dimension( (int)(propertySize*8.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(2, new Dimension( (int)(propertySize*7.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(3, new Dimension( (int)(propertySize*6.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(4, new Dimension( (int)(propertySize*5.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(5, new Dimension( (int)(propertySize*4.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(6, new Dimension( (int)(propertySize*3.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(7, new Dimension( (int)(propertySize*2.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(8, new Dimension( (int)(propertySize*1.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        centerLocs.add(9, new Dimension( (int)(propertySize*0.5 + cornerSize * 1), (int)(propertySize*9 + cornerSize * 1.5)));
        //10 in jail
        //__________________________________________________________________________________________________________________________________________________
        //MASSIVE FUCKING EDGE CASE HDWAJHJDNWANDAWNJNWADNJ
        //AWDKNWDNAWDKNAWKDWA
        //LOOK HERE FOOL
        //IF PERSON GOES INTO JAIL GUI PORTION bruh
        //__________________________________________________________________________________________________________________________________________________
        centerLocs.add(10, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*9 + cornerSize * 1.5)));
        //start chaning y
        centerLocs.add(11, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*8.5 + cornerSize )));
        centerLocs.add(12, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*7.5 + cornerSize )));
        centerLocs.add(13, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*6.5 + cornerSize )));
        centerLocs.add(14, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*5.5 + cornerSize )));
        centerLocs.add(15, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*4.5 + cornerSize )));
        centerLocs.add(16, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*3.5 + cornerSize )));
        centerLocs.add(17, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*2.5 + cornerSize )));
        centerLocs.add(18, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*1.5 + cornerSize )));
        centerLocs.add(19, new Dimension( (int)(cornerSize * 0.5), (int)(propertySize*0.5 + cornerSize )));
        //20 IS EDGE
        centerLocs.add(20, new Dimension( (int)(cornerSize * 0.5), (int)( cornerSize * 0.5)));
        //CHANGE X AGAIN
        centerLocs.add(21, new Dimension( (int)(propertySize*0.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(22, new Dimension( (int)(propertySize*1.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(23, new Dimension( (int)(propertySize*2.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(24, new Dimension( (int)(propertySize*3.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(25, new Dimension( (int)(propertySize*4.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(26, new Dimension( (int)(propertySize*5.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(27, new Dimension( (int)(propertySize*6.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(28, new Dimension( (int)(propertySize*7.5 +cornerSize ), (int)( cornerSize * 0.5)));
        centerLocs.add(29, new Dimension( (int)(propertySize*8.5 +cornerSize ), (int)( cornerSize * 0.5)));
        //30 IS EDGE
        centerLocs.add(30, new Dimension ((int)(propertySize*9 + cornerSize * 1.5), (int)( cornerSize * 0.5)));
        // CHANGE Y AGAIN
        centerLocs.add(31, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*0.5 + cornerSize )));
        centerLocs.add(32, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*1.5 + cornerSize )));
        centerLocs.add(33, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*2.5 + cornerSize )));
        centerLocs.add(34, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*3.5 + cornerSize )));
        centerLocs.add(35, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*4.5 + cornerSize )));
        centerLocs.add(36, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*5.5 + cornerSize )));
        centerLocs.add(37, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*6.5 + cornerSize )));
        centerLocs.add(38, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*7.5 + cornerSize )));
        centerLocs.add(39, new Dimension( (int)(propertySize*9 + cornerSize * 1.5), (int)( propertySize*8.5 + cornerSize )));
        //
        bp.boardFrame.getContentPane();
 
        ImageIcon image1 = new ImageIcon(new ImageIcon("broc.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        JLabel label1 = new JLabel(image1);
        label1.setBounds(100,100,image1.getIconWidth(), image1.getIconHeight());
       
        JButton b1 = new JButton("one");
        b1.setBackground(Color.BLACK);
        bp.boardFrame.add(label1);
        b1.setVisible(true);
 
        Dimension size = b1.getPreferredSize();
       
 
        //Container Bcontainer = getContentPane();
        bp.boardFrame.add(b1);
        bp.boardFrame.setVisible(true);
 
        for (Dimension item : centerLocs) {
            bp.boardFrame.setVisible(true);
            b1.setBounds( (int)item.getWidth(), (int)item.getHeight(), size.width,size.height);
            System.out.println("width" + (int)item.getWidth() + "height" + (int)item.getHeight());
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
 
    }
    public void allCenters()
    {
        
    }
    public static void main(String[] args) {
        new PlayerMovement(new BoardPanel());
    }
}
