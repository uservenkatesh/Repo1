package inteface;

interface Variable1 {

	static int a=5;
	
	String a1="var";
	
	double d5=1.3;
	
	static void meth2() {
	
		System.out.println("This is from Variable1_interface static");
	
	}
	
	static void print() {
		System.out.println("this is override method");
	}
	
	default void meth3() {
		
		System.out.println("interface default method");
	
	}
	
}
