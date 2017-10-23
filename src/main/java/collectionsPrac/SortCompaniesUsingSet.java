
package collectionsPrac;

import java.util.Set;
import java.util.TreeSet;

public class SortCompaniesUsingSet {

	public static void main(String[] args) {
		
		Set<String> cmp = new TreeSet<String>();
		
		cmp.add("TCS");
		cmp.add("HCL");
		cmp.add("INFOSYS");
		
		for (String eachCMP : cmp) {
			System.out.println(eachCMP);
		}
		
		
		
	}
}