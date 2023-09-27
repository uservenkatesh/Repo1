package inteface;

public abstract class Abstract1 {

	static int in=7;
	
	String s="venkatesh";
	
	abstract void Abstract_meth1();
	
	Abstract1() {
		int ab=15;
		System.out.println("constructor of abstract class Abstract1");
	}
	
	void meth1() {
	System.out.println("Abstract class non static method");	
	}
	
	static void meth2() {
		System.out.println("Abtract class static method");
	}
}
