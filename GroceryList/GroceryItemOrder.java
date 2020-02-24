package GroceryList;




public class GroceryItemOrder {

	
	
	private String name;
	public int quant;
	
	public double price;
	GroceryItemOrder(String s,int quantity,double pricePerUnit)
	{
	name=s;
	quant = quantity;
	price = pricePerUnit;
	}
	
	public double getCost()
	{
	System.out.println("Cost of "+name +" is "+price*quant);
	return (price*quant);
	}
	
	public void setQuant(int q)
	{
	quant=q;
	}
	
	
	public String toString() {
		return (Integer.toString(quant) + "*" + name);}}

