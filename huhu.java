package dummy1;
import java.io.*;
import java.util.*;

public class huhu {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(new File("C:\\Users\\gunjivam\\Documents\\Polls.txt"));
		int obamaVotes = 0, mccainVotes = 0;

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int obama = input.nextInt();
                int mccain = input.nextInt();
                int eVotes = input.nextInt();
                int totalvotes=0;
                while(input.hasNextInt()) {
                	totalvotes +=input.nextInt();
                	eVotes++;
                }
                if (obama > mccain) {
                    obamaVotes = obamaVotes + eVotes;
                } else if (mccain > obama) {
                    mccainVotes = mccainVotes + eVotes;
                }
            } else {
                input.next();   // skip non-integer token
            }
        }
        
        System.out.println("Obama : " + obamaVotes + " votes");
        System.out.println("McCain: " + mccainVotes + " votes");
    }
}

	


