package jvm;

import java.lang.reflect.Method;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		int count=0;
		
	            Class<?> c = Class.forName("jvm.Student");
//		Class<?> c = Class.forName("java.lang.String");
//		Class<?> c = Class.forName("java.lang.Object");

	            Method[] methods = c.getDeclaredMethods();

	            for (Method method : methods) {
	                count++;
	                System.out.println(method.getName());
	            }
	       

		System.out.println(count);
	}
}
