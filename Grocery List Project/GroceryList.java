package GroceryList;
import java.util.*;
import java.util.ArrayList;
			


class GroceryList {
private GroceryItemOrder[] GIO;
private int count;
GroceryList(){
	int i;
	count=0;
	GIO=new GroceryItemOrder[10];
}
	public void add(GroceryItemOrder item)
{
	if(count >=10 ){
	System.out.println("List is full");
		return;}
	GIO[count++]=item;}
	public double getTotalCost(){
		int i;
		double price=0;
		for(i=0;i<count;i++){
		price += GIO[i].price * GIO[i].quant;}
		System.out.println("Total cost is "+price);
		return price;}
			
		
			



public static void main(String args[])
			{
GroceryList gl=new GroceryList();
GroceryItemOrder i1=new GroceryItemOrder("Item1",2,10);
GroceryItemOrder i2=new GroceryItemOrder("Item2",3,30);
i1.getCost();
i2.getCost();
gl.add(i1);
gl.add(i2);
gl.getTotalCost();}}
	    	
