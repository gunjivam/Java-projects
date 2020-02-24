package Dictionary;

public interface HashComparator<K> {
	public int hashIndex(K k);
	public int hashIndex2(K k);
	public Boolean keyEqual(K k1, K k2);
}
