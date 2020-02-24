package dummy1;

	import java.util.TreeMap;
	import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
	import java.util.Map;
import java.util.Scanner;

	public class WordExample {

	   public static void main(String args[]) throws FileNotFoundException{

	      /* This is how to declare TreeMap */
	      TreeMap<String, Integer> tmap = 
	             new TreeMap<String, Integer>();
	      Scanner input= new Scanner(new File("C:\\Users\\gunjivam\\Documents\\Polls.txt"));
	      /*Adding elements to TreeMap*/
	      
	      /* Display content using Iterator*/
	     //
	      while(input.hasNext()){
	    	  String word= clean(input.next());
	    	  Integer count= tmap.get(word);
	    	  if(count==null) {count =1;} else {count=count+1;}
	    	  tmap.put(word, count);
	    	  
	      }
	      for(String key: tmap.keySet()) {
	    	  System.out.printf("%-20s%10d%n", key,tmap.keySet());
	    	  
	      }
	   }
	
	public static String clean(String s) {
		
	}


