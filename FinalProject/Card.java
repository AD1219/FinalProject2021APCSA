public class Card
{
   private String name;
   private int price;
   private boolean isOwned;
   private Player owner;
   private int mortgage;
   private int indexOfPropertyCard;
 
   public Card(String name, int price, boolean isOwned, Player owner, int mortgage, int indexOfPropertyCard)
   {
       this.name = name;
       this.price = price;
       this.isOwned = isOwned;
       this.owner = owner;
       this.mortgage = mortgage;
       this.indexOfPropertyCard = indexOfPropertyCard;
   }
   public void own()
   {
       isOwned = true;
   }
   public boolean getOwned()
   {
       return this.isOwned;
   }
   public void setOwner(Player name)
   {
       this.owner = name;
   }
   public Player getOwner()
   {
       return this.owner;
   }
   public String getName()
   {
       return this.name;
   }
   public int getPrice()
   {
       return this.price;
   }
   public int getMortgage()
   {
       return this.mortgage;
   }
   public int getIndexOfPropertyCard() {
       return this.indexOfPropertyCard;
   }
}

