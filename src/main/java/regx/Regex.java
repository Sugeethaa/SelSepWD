package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main (String args[]){

		// Define the pattern
		String pattern = "[-a-zA-Z0-9._]+@[a-zA-Z0-9-]{3,24}.[a-zA-Z]{3,5}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("$babu@testleaf.com");

		// Confirm the matches
		System.out.println(match.matches());
	}
}


