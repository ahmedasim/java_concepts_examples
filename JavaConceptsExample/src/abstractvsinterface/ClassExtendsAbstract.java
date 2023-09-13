package abstractvsinterface;

public class ClassExtendsAbstract extends AbstractClass {

	@Override
	public void methodWithoutImplimentation() {
		System.out.println("ClassExtendsAbstract methodWithoutImplimentation method invoked");
		
	}
	
	@Override
	public void methodWithImplimentation() {
		System.out.println("ClassExtendsAbstract methodWithImplimentation method invoked");
	}

}
