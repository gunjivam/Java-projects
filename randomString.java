package Dictionary;

import java.util.ArrayList;
import java.util.Random;

public class randomString {
	public static String make_randomString(int len) {
		String s = "";
		for(int i = 0; i < len; i++) {
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'a');
			s += c;
		}
		return s;
	}
	
	public static ArrayList<Item<String,String>> randomItemsArray(int size) { 
		ArrayList<Item<String,String>> A = new ArrayList<Item<String,String>>(0);
		for(int i = 0; i < size; i++) {
			String key = make_randomString(7);
			String elem = make_randomString(7);
			Item<String,String> I = new Item<String,String>(key,elem);
			A.add(I);
		}
		return A;
	}
	
	
	public static int fillTable_LP(ArrayList<Item<String,String>> A, LPHash<String,String> ht) {
		for(Item<String,String> I: A) {
			ht.insert(I.getKey(), I.getElem());
		}
		return ht.collisionCount();
	}
	
	public static int fillTable_DH(ArrayList<Item<String,String>> A, DoubleHash<String,String> ht) {
		for(Item<String,String> I: A) {
			ht.insert(I.getKey(), I.getElem());
		}
		return ht.collisionCount();
	}
	
	public static int argmin(ArrayList<Integer> a) {
		  int loc = 0;
		  int min = a.get(0);
		  for (int i = 1; i < a.size(); i++) {
		    if (a.get(i) < min) {
		      min = a.get(i);
		      loc = i;
		    }
		  }
		  return loc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashComparator<String> scomp = new StringComparator();
		LPHash<String,String> L = new LPHash<String,String>(10007,scomp);
		DoubleHash<String,String> D = new DoubleHash<String,String>(10007,scomp);
		ArrayList<Item<String,String>> A = randomItemsArray(10000);
		
		
		
		System.out.println(fillTable_LP(A,L));
		System.out.println(fillTable_DH(A,D));
		
		Random r = new Random();
		int Low = 0;
		int High = A.size()-1;
		int Result = r.nextInt(High-Low) + Low;
		Item<String,String> I = A.get(Result);
		
		System.out.println(D.size());
		System.out.println(D.findElement(I.getKey()));
		System.out.println(I.getElem());
		
	}

}