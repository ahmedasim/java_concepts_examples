package abstractvsinterface;

public interface InterfaceClass {
	
	/*
	 * Interface only have instant variables
	 */
	public static int STATIC_VARIBALE = 1;
	
	public void methodWithoutImplimentation();
	
	public default void methodWithImplimentation() {
		System.out.println("Interface class default method invoked");
	}
	
	public default void methodWithImplimentation2() {
		System.out.println("Interface class default method2 invoked");
	}
}
