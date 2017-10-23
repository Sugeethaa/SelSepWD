package string;

import org.testng.annotations.Test;

public class Occurance {

	String check = "I am the smart learner";
	int count = 0;

	//Way1	-> toCharArray() , foreach
	@Test(enabled =false)
	public void sample(){
		char[] ch = check.toCharArray();
		for (char c : ch) {
			if(c=='e')
				count++;
		}
		System.out.println(count);
		count = 0; // reset it to zero
	}
	
	
	
	//Way2 -> for iteration 0 -> length, charAt
	@Test
	public void sample2(){
	
	}
	
	
	//Way3 -> length - length (after replace)
	@Test
	public void sample3(){
	
	}
	
	
	//way4 -> split and length -1
	@Test
	public void sample4(){
	
	}
	
	

}










