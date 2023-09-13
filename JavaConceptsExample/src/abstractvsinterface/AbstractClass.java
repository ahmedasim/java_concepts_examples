package abstractvsinterface;

public abstract class AbstractClass {
	
	/*
	 * Abstract class can have both static and instant variable
	 */
	public static int STATIC_VARIBALE = 1;
	public int INSTANT_VARIABLE;
	
	/*
	 * Abstract class can have constractor
	 * But you cannot create object only jvm can create.
	 */
	public AbstractClass() {
		System.out.println("AbstractClass constructor invoked");
	}

	protected abstract void methodWithoutImplimentation();
	
	public void methodWithImplimentation() {
		System.out.println("AbstractClass methodWithImplimentation method invoked");
	}

}


