package Dictionary;


public class DoubleHash<K,E> extends Hashing<K,E> {
	
	public DoubleHash(int s, HashComparator<K> hc) {
		super(s, hc);
	}
	
	public void insert(K k, E e){// Assumes this HT is not full
		int i = h.hashIndex(k) % N;
		int h2 = h.hashIndex2(k);
		int j = 1;
		int index = i;
		boolean done = false;
		while (!done){
			if (empty(index) || available(index)){
				A.set(index, new Item<K, E>(k, e));
				n = n + 1;
				done = true;}
			else {collisionCounter++;}
			j += 1;
			index = (i + j*h2) % N;} }

	protected int find(K k) // returns the index of the given key or -1 if there is no such key
	{   int i = (h.hashIndex(k) % N); // division method compression map
		int h2 = h.hashIndex2(k);
		int j = 1;
		int index = i;
		int res = -1;
		boolean looped = false;
		boolean done = false; // indicates that the search is done
		while (!done){
//			looped = index >= i && index < (i+h2);
			if (empty(index)) {
				done = true;}
			else if (available(index)){
				if (index == i+1) { done = true; } }
				else if (h.keyEqual(key(index), k))	{
				res = index;
				done = true; }
			else{
				if (index == i+1){
					done = true; } } 
			j += 1;
			index = (i+j*h2) % N;}
		return(res); }
}
