import java.util.ArrayList;

// Laver en liste ud fra et ArrayList
public class GroceryList2
{

   ArrayList<GroceryItemOrder> grocery2;


   public GroceryList2()
   {
      this.grocery2 = new ArrayList<>();
   }

   public void AddGrocery2(GroceryItemOrder items)
   {
      grocery2.add(items);
   }

   public int getTheTotalCost2()
   {
      int finalprice2 = 0;
      for (GroceryItemOrder Grocery2 : grocery2)
      {
         finalprice2 += Grocery2.totalCost();
      }
      return finalprice2;
   }


   @Override
   public String toString()
   {
      return "GroceryList2{" +
              "grocery2=" + grocery2 +
              '}' + " \nTotal prisen = "+getTheTotalCost2() +"Kr";
   }
}
