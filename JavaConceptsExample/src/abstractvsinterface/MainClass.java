package abstractvsinterface;

/*
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		ClassImplimentsInterface classImplimentsInterface = new ClassImplimentsInterface();
		classImplimentsInterface.methodWithImplimentation();
		classImplimentsInterface.methodWithoutImplimentation();
		
		/* OUTPUT
			  Interface class default method invoked
			  Class implements interface trigger override function
		 */
		
		
		InterfaceClass interface1 = new ClassImplimentsInterface();
		interface1.methodWithImplimentation();
		interface1.methodWithoutImplimentation();
		
		/* OUTPUT
			  Interface class default method invoked
			  Class implements interface trigger override function
		*/
		
		
		ClassExtendsAbstract classExtendsAbstract = new ClassExtendsAbstract(); 
		classExtendsAbstract.methodWithImplimentation();
		classExtendsAbstract.methodWithoutImplimentation();
		
		/* OUTPUT
			 AbstractClass constructor invoked
			 ClassExtendsAbstract methodWithImplimentation method invoked
			 ClassExtendsAbstract methodWithoutImplimentation method invoked 
		 */
		
		AbstractClass abstractClass = new ClassExtendsAbstract();
		abstractClass.methodWithImplimentation();
		abstractClass.methodWithoutImplimentation();
		
		/* OUTPUT
			 AbstractClass constructor invoked
			 ClassExtendsAbstract methodWithImplimentation method invoked
			 ClassExtendsAbstract methodWithoutImplimentation method invoked
		*/
		
		ClassImplimentsAndExtendsBoth obj = new ClassImplimentsAndExtendsBoth();
		obj.methodWithImplimentation();
		obj.methodWithImplimentation2();
		obj.methodWithoutImplimentation();
		
		/* OUTPUT
			 AbstractClass constructor invoked
			 AbstractClass methodWithImplimentation method invoked
			 Interface class default method2 invoked
			 ClassExtendsAbstract methodWithoutImplimentation method invoked
		*/
		
		ClassImplimentsAndExtendsBoth objWithInterfaceRef = new ClassImplimentsAndExtendsBoth();
		objWithInterfaceRef.methodWithImplimentation();
		obj.methodWithImplimentation2();
		objWithInterfaceRef.methodWithoutImplimentation();
		
		/* OUTPUT
			 AbstractClass constructor invoked
			 AbstractClass methodWithImplimentation method invoked
			 Interface class default method2 invoked
			 ClassExtendsAbstract methodWithoutImplimentation method invoked
		 */
		
		ClassImplimentsAndExtendsBoth objWithAbstractRef = new ClassImplimentsAndExtendsBoth();
		objWithAbstractRef.methodWithImplimentation();
		obj.methodWithImplimentation2();
		objWithAbstractRef.methodWithoutImplimentation();
		
		/* OUTPUT
			AbstractClass constructor invoked
			AbstractClass methodWithImplimentation method invoked
			Interface class default method2 invoked
			ClassExtendsAbstract methodWithoutImplimentation method invoked

		*/
		
	}

}
