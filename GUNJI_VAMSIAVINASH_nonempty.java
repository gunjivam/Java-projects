package dog;

import java.util.Arrays;
import java.util.List;

public class GUNJI_VAMSIAVINASH_nonempty implements dog{
//public static void main(String args[])
//{
//String[] Dog = new String[]{"Avi" , "vamsi" , 20};}
	int age;
	String name;
	String owner;
	
public void dog (int age,String name,String owner)

{
	this.age= age;
	this.name= name;
	this.owner= owner;
}
public static void main(String args[])
{
	List<dog> list=ArrayList<dog>();
	//Creating Dogs
	dog d1= new dog(4,"lily","nick");
	dog d2= new dog(10,"avi","marco");
	dog d3= new dog(5,"yohan","Sethi");
	list.add(d1);
	list.add(d2);
	list.add(d3);
			
			dog first =lod.get(0);
	dog last= lod.get(lod.size()-1);
}
public String getOwner() {
	return owner;
	
}
public String getName()
{
	return name;
	
}
public int getAge()
{
	return age;
}


	public GUNJI_VAMSIAVINASH_nonempty()
	{
	

	}

	//
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	///
	public dog getFirst() {
		// TODO Auto-generated method stub
		return
		list.get(0);
	}


	@Override
	public dog getRest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dog returnseniors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
