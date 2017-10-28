package stat;

public class CallStatic {
	
	public static void main(String[] args) throws InterruptedException {
		
		LearnStatic ls = new LearnStatic();
		ls.walk();
		
		//Syntax ->> ClassName.MethodName();
		LearnStatic.run();
		LearnStatic.color = "blue";
		
		System.out.println(LearnStatic.color);
		
		
		System.setProperty("", "");
		Thread.sleep(2000);
		
	}

}






