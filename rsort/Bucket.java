package rsort;

import java.util.ArrayList;
import java.util.List;

public class Bucket<X> implements IBucket<X>{
	List<X> B;
	int size;
	public Bucket()
	{
		B = new ArrayList<X>();
		size=0;
	}
	//
	public void add(X elem) {
		// 
		B.add(elem);
		size= size +1;
		
		
	}

	//
	public int toArray(X[] A, int i) {
		
		return (toArrayHelper(A,i,i+this.size-1));
	}
	
	
	
	private int toArrayHelper(X[] A, int lower, int upper) {
		int k=0;
		int next= lower;
		
		while(next<= upper) {
			A[next]= B.get(k);
			next= next+1;
			k=k+1;
		}
			B.clear();
			size=0;
			return(upper-lower+1);
		
		
		}
	//
	
	
}

