package Dictionary;

public class LPHash<K,E> extends Hashing<K,E> {
	public LPHash(int s, HashComparator<K> hc){
		super(s,hc);
	}
	
	public void insert(K k, E e){// Assumes this HT is not full
		int i = h.hashIndex(k) % N;
		int j = i;
		boolean done = false;
		while (!done){
			if (empty(j) || available(j)){
				A.set(j, new Item<K, E>(k, e));
				n = n + 1;
				done = true;}
			else {collisionCounter++;}
			j = (j + 1) % N;} }
	
	protected int find(K k) // returns the index of the given key or -1 if there is no such key
	{   int i = (h.hashIndex(k) % N); // division method compression map
		int j = i;
		int res = -1;
		boolean done = false; // indicates that the search is done
		while (!done){
			if (empty(j)) {
				done = true;}
			else if (available(j)){
				j = (j + 1) % N;
				if (j == i) { done = true; } }
			else if (h.keyEqual(key(j), k))	{
				res = j;
				done = true; }
			else{
				j = (j + 1) % N;
				if (j == i){
					done = true; } } }
		return(res); }
	
}