package abstractvsinterface;

public class ClassImplimentsInterface implements InterfaceClass {

	@Override
	public void methodWithoutImplimentation() {
		System.out.println("Class implements interface trigger override function");
		
	}
}


// You cannot override interface default method.