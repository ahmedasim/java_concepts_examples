package abstractvsinterface;

public class ClassImplimentsAndExtendsBoth extends AbstractClass implements InterfaceClass{

	@Override
	public void methodWithoutImplimentation() {
		System.out.println("ClassExtendsAbstract methodWithoutImplimentation method invoked");
		
	}
	
	/*
	 * @Override public void methodWithImplimentation() { System.out.
	 * println("ClassExtendsAbstract methodWithImplimentation method invoked"); }
	 */

}
