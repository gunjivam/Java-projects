package dummy1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//VAMSI AVINASH GUNJI
//Dr. Puya
// Intro to Object Oriented 2
public class PigLatin2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("data.txt"));
		
		while (input.hasNextLine()) {
		    String t = input.nextLine();
		    String [] A = t.split(" ");
		   String line= "";
		for(int i=0;i<A.length;i++)
		{
			if(i<A.length-1) {
				line+= pigLatinWord(A[i])+ " ";}
			else {
				line+= pigLatinWord(A[i]);
			}
		}
		System.out.println(String.format("\"%s\" in pig latin is \"%s\"",t,line ));
		System.out.println("");
		}
	}
	//--------------------------------------------------------
	// Convert one word to pig Latin.
	// Precondition: s is not an empty string
	// Postcondition: returns a new string that is the pig Latin
	// form of s
	public static String pigLatinWord(String s) {
		String pigWord;
	    if (isVowel(s.charAt(0))) {
			pigWord = s + "-way";
	    } else if (s.startsWith("th") || s.startsWith("Th")) {		// or (s.toUpperCase().startsWith("TH"))
	    	pigWord = s.substring(2) + "-" + s.substring(0,2) + "ay";
	    } else {
	    	pigWord = s.substring(1,s.length()) + "-" + s.charAt(0) + "ay";
	    }
	    return pigWord;
	}

	//---------------------------------------------
	// Determines whether c is a vowel character
	// Precondition: c contains a letter
	// Postcondition: returns true when c is a vowel
	public static boolean isVowel(char c) {
		String vowels = "aeiouAEIOU";
		return (vowels.indexOf(c) >= 0); 	// when index of c in vowels is not -1, c is a vowel
	}
}
