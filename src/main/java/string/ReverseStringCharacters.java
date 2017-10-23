package string;

public class ReverseStringCharacters {

	public static void main(String[] args) {

		// way 1 -> toCharArray, length-1 -> 0
		String companyName = "wow ! it is fun to do this";
		char[] charComp = companyName.toCharArray();
		for(int i=companyName.length()-1; i>=0; i-- ){
			System.out.print(charComp[i]);
		}

		System.out.println();
		for(int i=companyName.length()-1; i>=0; i-- ){
			System.out.print(companyName.charAt(i));
		}
		System.out.println();
		
		String[] comp = companyName.split("");
		for (int i = comp.length-1; i >= 0; i--) {
			System.out.print(comp[i]);
		}

		// Solution 2: Built in

		// StringBuilder class do not have toCharArray() method , 
		// while String class does have toCharArray() method.
		System.out.println();
		StringBuilder strBuil = new StringBuilder("wow ! it is fun to do this");
		System.out.println(strBuil.reverse());
	}
}








