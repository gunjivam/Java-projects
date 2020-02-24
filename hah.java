package dummy1;
import java.io.*;
import java.util.*;
public class hah {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("input.txt"));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    Scanner lineScan = new Scanner(line);

		    // process the contents of this line
		    int count = 0;
		    while (lineScan.hasNext()) {
		        String word = lineScan.next();
		        count++;
		    }
		    System.out.println("Line has " + count + " words");
		}

	}

}
