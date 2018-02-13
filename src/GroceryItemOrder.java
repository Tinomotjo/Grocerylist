public class GroceryItemOrder
{
    private String GroceryName;
    private int Quantity;
    private int Price;

    public GroceryItemOrder (String GrocertyName,int Quantity, int Price )
    {
        this.GroceryName =  GrocertyName;
        this.Quantity = Quantity;
        this.Price = Price;

    }


    public int totalCost()
    {
        return Quantity * Price;
    }


    // Getters
    public String getGroceryName()
    {
        return GroceryName;
    }
    public int getQuantity()
    {
        return Quantity;
    }
    public double getPrice()
    {
        return Price;
    }

    // Setters
    public void setGroceryName(String groceryName)
    {
        GroceryName = groceryName;
    }
    public void setQuantity(int quantity)
    {
        Quantity = quantity;
    }
    public void setPrice(int price)
    {
        Price = price;
    }


    @Override
    public String toString()
    {
        return "\nGroceryItemOrder{" +
                "GroceryName = " + GroceryName +
                ", Quantity = " + Quantity +
                ", Price = " + Price + "Kr" +
                '}';
    }
}
