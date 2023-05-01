import java.util.ArrayList;
import java.util.NoSuchElementException;
 
public class ListOfCards {
   public static ArrayList<Card> listOfCards;
   private CommunityChest cChest = new CommunityChest();
   private Chance chance = new Chance();
 
 
   public ListOfCards() {
       listOfCards = new ArrayList<Card>();
 
       listOfCards.add(new PropertyCard("Mediterranean Avenue", 60, 2, 50, false, 30, 1));
       listOfCards.add(new PropertyCard("Baltic Avenue", 60, 4, 50, false, 30, 3));
       listOfCards.add(new RRCard("Reading RailRoad", 200, 25, false, null, 100, 5));
       listOfCards.add(new PropertyCard("Oriental Avenue", 100, 6, 50, false, 50, 6));
       listOfCards.add(new PropertyCard("Vermont Avenue", 100, 6, 50, false, 50, 8));
       listOfCards.add(new PropertyCard("Connecticut Avenue", 120, 8, 50, false, 60, 9));
       listOfCards.add(new PropertyCard("St. Charles Place", 140, 10, 100, false, 70, 11));
       listOfCards.add(new UtilCard("Electric Company", 150, false, null, 75, 12));
       listOfCards.add(new PropertyCard("States Avenue", 140, 10, 100, false, 70, 13));
       listOfCards.add(new PropertyCard("Virginia Avenue", 160, 12, 100, false, 80, 14));
       listOfCards.add(new RRCard("Pennsylvania RailRoad", 200, 25, false, null, 100, 15));
       listOfCards.add(new PropertyCard("St. James Place", 180, 14, 100, false, 90, 16));
       listOfCards.add(new PropertyCard("Tennessee Avenue", 180, 14, 100, false, 90, 18));
       listOfCards.add(new PropertyCard("New York Avenue", 200, 16, 100, false, 100, 19));
       listOfCards.add(new PropertyCard("Kentucky Avenue", 220, 18, 150, false, 110, 21));
       listOfCards.add(new PropertyCard("Indiana Avenue", 220, 18, 150, false, 110,23));
       listOfCards.add(new PropertyCard("Illinois Avenue", 240, 20, 150, false, 120,24));
       listOfCards.add(new RRCard("B&Q RailRoad", 200, 25, false, null, 100, 25));
       listOfCards.add(new PropertyCard("Atlantic Avenue", 260, 22, 150, false, 130, 26));
       listOfCards.add(new PropertyCard("Ventnor Avenue", 260, 22, 150, false, 130, 27));
       listOfCards.add(new UtilCard("Water Works", 150, false, null, 75, 28));
       listOfCards.add(new PropertyCard("Marvin Gardens", 280, 24, 150, false, 140, 29));
       listOfCards.add(new PropertyCard("Pacific Avenue", 300, 26, 200, false, 150, 31));
       listOfCards.add(new PropertyCard("North Carolina Avenue", 300, 26, 200, false, 150, 32));
       listOfCards.add(new PropertyCard("Pennsylvania Avenue", 320, 28, 200, false, 160, 34));
       listOfCards.add(new RRCard("Short Line", 200, 25, false, null, 100, 35));
       listOfCards.add(new PropertyCard("Park Place", 350, 35, 200, false, 175, 37));
       listOfCards.add(new PropertyCard("Boardwalk", 400, 50, 200, false, 200, 39));
   }
 
   public Card getCard(int val) {
      
       for (int i = 0; i < listOfCards.size(); i++) {
           if (listOfCards.get(i).getIndexOfPropertyCard() == val) {
               return listOfCards.get(i);
           }
       }
 
       throw new NoSuchElementException();
   }
}

