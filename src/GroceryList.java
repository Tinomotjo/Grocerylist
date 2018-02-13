import java.util.Arrays;

// Laver en liste ud fra et Array
public class GroceryList
{

    private GroceryItemOrder[] grocery = new GroceryItemOrder[10];

    public void AddGrocery(GroceryItemOrder items)
    {
        for (int i = 0; i < grocery.length; i++)
        {
            if(grocery[i] == null)
            {
                grocery[i] = items;
                break;
            }
        }
    }



   public int getTheTotalCost()
   {
       int finalprice = 0;
       for (int i = 0; i < grocery.length; i++)
       {
           if(grocery[i] !=null)
           {
               finalprice += grocery[i].totalCost();
           }
       }
       return finalprice;
   }

    @Override
    public String toString()
    {
        return "GroceryList{" +
                "grocery=" + Arrays.toString(grocery) +
                '}' + " \nTotal prisen = "+getTheTotalCost() +"Kr";
    }
}



