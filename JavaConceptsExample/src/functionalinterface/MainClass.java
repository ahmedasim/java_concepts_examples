package functionalinterface;

public class MainClass {

	public static void main(String[] args) {
	      MyInterface a = new MyInterfaceImpl();
	      a.method();
	      /*
	      * We don't need to create class A and impliment MyInterface
	      * We can create MyInterface object by using Anonymous class
	      */
	      MyInterface b = new MyInterface() {
	         @Override
	         public void method() {
	          System.out.println("Business Logic");
	        }
	      }; 
	      b.method(); 
	      
	      /*
	        * But Wait as this interface with single method then we short the code.
	        * So let's apply lamda expression.
	      */

	      MyInterface c= () -> {
	          System.out.println("Business Logic");
	      };
	      c.method();

	      /*
	       * We can also short this code into one single line by removing currly brackets 
	      */
	      MyInterface d = () -> System.out.println("Business Logic");
	      d.method();
	      
	      /*
	       * Following code show how to use functional interface.
	       * We have created FunctionalInterfaceExample class which have one method sum and return sum of two inputs.
	       */
	      FunctionalInterfaceExample fi = (v1, v2) -> v1 + v2;
	      System.out.println(fi.sum(5, 10));
	      
	   }

}
