package string;

import java.util.StringTokenizer;

import org.testng.annotations.Test;

public class CountWords {
	
	String sentence = "I am the winner today";
	
	@Test
	public void countWords() {
		String[] words = sentence.split(" ");
		System.out.println(words.length);
	}
	
	@Test
	public void countUsingTokens() {
		StringTokenizer tokens = new StringTokenizer(sentence);
	    System.out.println(tokens.countTokens()); 
	}

}
