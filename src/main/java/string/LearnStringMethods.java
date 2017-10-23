package string;

import org.testng.annotations.Test;

public class LearnStringMethods {
	
	@Test
	public void stringBasics(){
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 1) toCharArray // Convert String to characters 
		 * 2) length // find the number of characters
		 * 2) charAt(index) // The character at the index
		 * 3) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 4) toString() // Convert an existing data type to String
		 * 5) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 6) trim // Removes the white space on beginning and End
		 * 7) toLowerCase, toUpperCase // to convert case
		 * 8) split('char') -- split(regex, limit) //
		 * 9) concat //Concatenate two strings only  2+"Std"
		 * 10)startsWith(s), endsWith(s), contains(s) // match
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
		 */

		// Simplest way to create String
		String text = " Hexa ware "; //As literals
		
		// Print all characters
		/*System.out.println("Start of printing each character");
		char[] eachChracters = text.toCharArray();
		for (char c : eachChracters) {
			System.out.println(c);
		}
		System.out.println("End of printing each character");*/

		
		// Length
		//System.out.println("The length of the string is :"+text.length());
		 
		// get the last character
		//System.out.println("The last character is :"+text.charAt(text.length()-1));

		// find the index of 'a'
		//System.out.println("The first occurance of index 'e' in ' Hexaware ' is : "+text.indexOf("e"));

		// find the last index of 'a'
		//System.out.println("The last occurance of index 'e' in ' Hexaware ' is : "+text.lastIndexOf("e"));
		
		
		// SubString
		//System.out.println("The first 4 character of Hexaware is : "+text.substring(0,7));
		
		// trim - removes white space
	//	System.out.println("Without white spaces on both end :"+text.trim());
		
		//to lowercase
		// System.out.println("The text in lowercase is : "+text.toLowerCase());
		
		// split the string my delimiter
		/*String[] data = text.trim().split("");
		System.out.println("The array size is : "+data.length);
		System.out.println("The second character is : "+data[1]);*/
		
		// concat
		//int i =2;
		//System.out.println("The concatenation can be :"+text.concat(Integer.toString(i)));
		
		// Confirm if the text has character 'w'
	//	System.out.println("Does the string has character 'w' : "+text.contains("w"));
	//	System.out.println("Does the string has character 'H' : "+text.startsWith("H"));
	//	System.out.println("Does the string has character 'e' : "+text.endsWith("e"));
	//	System.out.println("Does the string has character 'W' : "+text.contains("W"));
		
		/*// Replace all (white spaces with nothing)
		System.out.println("The white spaces removed all text is :"+text.replaceAll(" ", ""));
		System.out.println("The white spaces removed text is :"+text.replace("are", "yes"));
		*/
		// Another way to create String
		/*char[] another = {'h','e','x','a','w','a','r','e'};
		String newText = new String(another);//Creating object
		System.out.println("The string using object "+ newText);*/

	}	

}
