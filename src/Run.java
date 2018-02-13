import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.util.Scanner;
public class Run
{
    public static void main(String[] args) throws Exception
    {

        System.out.println(" Array Grocerys!");
        GroceryList grocery = new GroceryList();
        Scanner input = new Scanner(new File("src/List"));
        while (input.hasNextLine())
        {
            GroceryItemOrder item = new GroceryItemOrder(input.next(),input.nextInt(),input.nextInt());
            grocery.AddGrocery(item);

        }
        System.out.println(grocery);
        System.out.println();


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ArrayList Grocerys!");
        GroceryList2 groceryList2 = new GroceryList2();
        Scanner input2 = new Scanner(new File("src/List2"));
        while (input2.hasNextLine())
        {
            GroceryItemOrder item2 = new GroceryItemOrder(input2.next(),input2.nextInt(),input2.nextInt());
            groceryList2.AddGrocery2(item2);

        }
        System.out.println(groceryList2);



    }
}
