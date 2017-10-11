package tests;

import org.testng.annotations.Test;

public class SampleTests {
	
	
	@Test(dependsOnMethods= {"walk"})
	public void sleep() {
		
	}
	
	@Test(dependsOnMethods= {"run"})
	public void walk() {
		
	}
	
	@Test
	public void run() {
		throw new RuntimeException();
	}

}
