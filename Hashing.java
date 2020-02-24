package Dictionary;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Hashing<K,E> implements IDictionary<K,E> {
	protected Item<K, E> AVAILABLE = new Item<K, E>(null, null); // deleted cell item
	protected int n; // number of elements in the hash table
	protected int N; //size of the array
	protected ArrayList<Item<K, E>> A;
	protected HashComparator<K> h; // provides hashIndex and Equals
	protected int collisionCounter = 0;//provides the number of collisions
	
	protected Hashing(int s, HashComparator<K> hc){
		n = 0; h = hc; N = s; int i = -1; 
		A = new ArrayList<Item<K, E>>(s);
		while (i < s){
			i = i + 1;
			A.add(i, null);
		}
	}
	
	//auxiliary methods
	protected boolean available(int i)
	{ return(A.get(i) == AVAILABLE); }
	protected boolean empty(int i)
	{ return(A.get(i) == null);}
	protected K key(int i)
	{return(A.get(i).getKey());}
	protected E elem(int i)
	{return(A.get(i).getElem());}
	
	public abstract void insert(K key, E elem);
	protected abstract int find(K k); // returns the index of the given key or -1 if there is no such key
	
	// Dictionary methods
	public Integer size() {return(n);}
	public Boolean isEmpty() {return(n == 0);}
	
	public Iterator<E> elements(){
		Iterator<Item<K, E>> htlooper = A.iterator();
		ArrayList<E> elems = new ArrayList<E>();
		Item<K, E> k;
		while (htlooper.hasNext()){
			k = htlooper.next();
			if ((k != null) && (k != AVAILABLE)){
				elems.add(k.getElem()); }}
		return(elems.iterator());}
	
	public Iterator<K> keys(){	
		Iterator<Item<K, E>> htlooper = A.iterator();
		ArrayList<K> keys = new ArrayList<K>();
		Item<K, E> k;
		while (htlooper.hasNext()){
			k = htlooper.next();
			if ((k != null) && (k != AVAILABLE)){
				keys.add(k.getKey()); }
		}
		return(keys.iterator());
	}
	public E findElement(K k){
		int i = find(k);
		if (i < 0) { return(null); }
		else { return(elem(i)); }
	}
	
	
	public void delete(K k){
		int i = find(k);
		if (i > -1){
			A.set(i, AVAILABLE);
			n = n - 1;}
	}
	
	public int collisionCount()
	{return collisionCounter;}
}
