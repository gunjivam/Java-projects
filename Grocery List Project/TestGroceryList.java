package GroceryList;


	import java.util.*;
	public class TestGroceryList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner console = new Scanner(System.in);
			
			System.out.println("How many items do you want to create? ");
			int numItem = console.nextInt();
			
			GroceryList myList = new GroceryList();
			
			for (int i = 0; i < numItem; i++){
				
				System.out.println("Enter the name for the item " + (i+1) + ": ");
				String name = console.next();
				
				System.out.println("Enter the price for the item " + (i+1) + ": ");
				double price = console.nextDouble();
								
				GroceryItemOrder item = new GroceryItemOrder(name,0,price);
				
				System.out.println("Enter the quantity for the item " + (i+1) + ": ");
				int quantity = console.nextInt();
				item.setQuant(quantity);
				
				System.out.println ("The total price for " + item.toString() + " is: " + item.getCost());
				
				myList.add(item);
			}
			
			//********call getTotalCost method
			System.out.println("*********************");
			System.out.println("The total price for the grocery list is: " + myList.getTotalCost());
		}

	
}

