package Dictionary;

public class StringComparator implements HashComparator<String>{
	int a = 97;
	public StringComparator() { }
	
	public int hashIndex(String k){
		int slen = k.length();
		int i = -1;
		int code = 0;
		while (i < slen - 1){
			i = i + 1;
			code = (int) k.charAt(i) + a*code;
		}
		return(Math.abs(code));
	}
	
	public int hashIndex2(String k){
		int h = hashIndex(k);
		int code = 193-(h%193);
		return(Math.abs(code));
	}
	
	public Boolean keyEqual(String k1, String k2){
		return(k1.equals(k2)); }
}

