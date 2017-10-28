package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {


	public static void main (String args[]){

		// Define the pattern
		String pattern = "[A-Za-z]+";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = 
		p.matcher("Amazon has 12014 employees in India and 24500 in USA ");		

		// if multiple matches
		while (match.find()) {
			System.out.println(match.group());            
		}

	}
}
