package reflection;

import java.lang.reflect.Method;

public  class Sample {

	public static void main(String[] args) throws ClassNotFoundException {
			
		Class<?> gw = Class.forName("wrappers.GenericWrappers");

		Method[] methods = gw.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}


}
