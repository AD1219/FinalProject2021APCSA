import java.util.LinkedList;
import java.util.Queue;
 
/**
   Sources: https://www.monopolyland.com/list-monopoly-chance-community-chest-cards/
*/
 
 
public class Chance {
   Queue<String> messages;
   String msg = "";
 
   public Chance() {
       messages = new LinkedList<String>();
       messages.add("Advance to Boardwalk");
       messages.add("Advance to Illinois Avenue. If you pass 'Go' Collect $200");
       messages.add("Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay wonder twice the rental to which they are otherwise entitled");
       messages.add("Get Out of Jail Free");
       messages.add("Go to Jail. Go directly to Jail, do not pass Go, do not collect $200");
       messages.add("Advance to St. Charles Place. If you pass Go, collect $200");
       messages.add("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times amount thrown");
       messages.add("Take a trip to Reading Railroad. If you pass Go, collect $200");
       messages.add("Your building loan matures. Collect $150");
       messages.add("Advance to Go (Collect $200)");
     
       //randNum = (int) (Math.random() * 10 + 1);
   }
 
   public String getMessage() {
       msg = messages.remove();
       messages.add(msg);
       return msg;
   }
  
}
