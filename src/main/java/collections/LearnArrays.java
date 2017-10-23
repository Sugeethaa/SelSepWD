package collections;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LearnArrays {

	/**
	 * Date: 22 October 2017
	 * An array is a container object that holds a fixed number  
	 * of values of a single type. 
	 * The length of an array is established when the array is 
	 * created.After creation, its length is fixed. 
	 * 
	 * Each item in an array is called an element, and 
	 * each element is accessed by its numerical index.
	 * Starting index : 0
	 * 
	 */

	@Test
	public void learnArrays() {

		// It is 6 sized array supports only String
		String[] mentors = new String[6];
		mentors[5] = "Bala";
		mentors[1] = "Gopi";
		mentors[2] = "Nesa";
		mentors[4] = "Rasheed";
		mentors[3] = "Sethu";
		mentors[0] = "SSP"; // if not assigned ; so default value is null
		System.out.println("The number of mentors are :"+mentors.length);

		System.out.println(mentors[1]);
		System.out.println(mentors[5]);
	//	System.out.println(mentors[6]); // accessing beyond size, throws exception

System.out.println("**********************");
		// Array sort for string throw error
		Arrays.sort(mentors);
		for (String mentor : mentors) {
		System.out.println(mentor);	
		}
		
		
		// Another way of creating
		int[] weeks = {1,2,3,4,5,6,11,7,9};
		System.out.println("int array "+weeks[0]);
		
		int[] anotherWeek = weeks.clone();
		System.out.println(anotherWeek[2]);
		
		anotherWeek[2]=23;
		// Compare 2 arrays
		System.out.println("The comparison of the 2 int arrays are:"
				+ " clone : "+Arrays.equals(weeks, anotherWeek));


	}

}
