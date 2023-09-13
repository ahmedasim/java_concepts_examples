package functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	int sum(int a, int b);
	
	/*
	 * You can have overridden methods in functional interface. 
	 * toString method belongs to Object.class and each class or interface by extends Object class 
	 */
	String toString();
		
	
}
