import java.util.LinkedList;
import java.util.Queue;
 
/**
   Sources: https://www.monopolyland.com/list-monopoly-chance-community-chest-cards/
*/
 
public class CommunityChest {
   Queue<String> messages;
   String msg = "";
 
   public CommunityChest() {
       messages = new LinkedList<String>();
       messages.add( "Advance to Go (Collect $200)");
       messages.add( "Bank error in your favor. Collect $200");
       messages.add( "Doctor's fee. Pay $50");
       messages.add( "From sale of stock you get $50");
       messages.add( "Go to Jail. Go directly to jail, do not pass Go, do not collect $200");
       messages.add( "Holiday fund matures. Recieve $100");
       messages.add( "Income tax refund. Collect $20");
       messages.add( "Pay hospital fees of $100");
       messages.add( "Get Out of Jail Free");
       messages.add("You inherit $100");
 
       //randNum = (int) (Math.random() * 10 + 1);
   }
 
   public String getMessage() {
       msg = messages.remove();
       messages.add(msg);
       return msg;
   }
}
