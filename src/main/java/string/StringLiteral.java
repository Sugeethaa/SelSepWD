package string;

public class StringLiteral {

	public static void main(String[] args) {
		
		//  object will be created in Heap memory 
		//  and its reference will be pointed to String pool.
		String s1 = new String("TestLeaf");
		String s2 = new String("TestLeaf");

		// In String literal the reference 
		// will be directly pointed to String Pool
		String s3 = "TestLeaf";
		String s4 = "TestLeaf";

	}

}







