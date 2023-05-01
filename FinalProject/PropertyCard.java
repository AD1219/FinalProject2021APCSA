public class PropertyCard extends Card{
    private String name;
    private String type;
    private int price;
    private int rent;
    private int houseCost, hotelCost;
    private int numOfHouses;
    private int numOfHotels;
    private boolean isOwned;
    private String owner;
   
    public PropertyCard(String name1, int price1, int rent1, int housePrice, boolean isOwned1, int mortgage, int indexOf)
    {
        super(name1, price1, isOwned1, null, mortgage, indexOf);
        this.rent = rent1;
        houseCost = housePrice;
        hotelCost = housePrice *2;
        numOfHotels = 0;
        numOfHouses = 0;
        type = "P";
    }
    public String getType()
    {
        return type;
    }
    public int getRent()
    {
        int rentAmt = this.rent;
        int returnVal;
        if(numOfHouses == 0 && numOfHotels == 0)
        {
            returnVal = rentAmt;
            return returnVal;
        }
        else if(numOfHouses > 0 && numOfHotels == 0)
        {
            returnVal = rentAmt * (numOfHouses+1);
            return returnVal;
        }
        else
        {
            returnVal = rentAmt * 5;
  
            return returnVal;
        }
    }
    public void addHouse()
    {
        numOfHouses ++;
    }
    public void addHotel()
    {
        numOfHotels ++;
        numOfHouses = 0;
    }
    public int getHouseCost()
    {
        return houseCost;
    }
    public int getHotelCost()
    {
        return hotelCost;
    }
 }
 
