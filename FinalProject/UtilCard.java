public class UtilCard extends Card{
    private String name;
    private int price;
    private boolean isOwned;
    private Player owner;
    private String type;
    private int howManyOwned = 0;
  
  
  
    public UtilCard(String name, int price, boolean isOwned, Player owner, int mortgage, int indexOf)
    {
        super(name, price, isOwned, null, mortgage, indexOf);
        type = "U";
    }
  
    public void addHowManyOwned() {
        howManyOwned++;
    }
   
    public String getType()
    {
        return type;
    }
  
  
 }
 
