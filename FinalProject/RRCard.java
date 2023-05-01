public class RRCard extends Card
{
   private String name;
   private int price;
   private int rent;
   private boolean isOwned;
   private Player owner;
   private String type;
 
   public RRCard(String name, int price, int rent, boolean isOwned, Player owner, int mortgage, int indexOf)
   {
       super(name, price, isOwned, null, mortgage, indexOf);
       this.rent = rent;
       type = "RR";
   }
 
   public String getType()
   {
       return type;
   }
    public int getRent()
   {
       return rent;
   }
}

