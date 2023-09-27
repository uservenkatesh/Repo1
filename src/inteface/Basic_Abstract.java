package inteface;

public abstract class Basic_Abstract extends  Abstract1{

	int a=5;
	
	static String st="str";
	
	 // @Override
	  void Abstract_meth1() {
		  System.out.println("Method from Basic_Abstract class");
	  }
	
	void Abstract_meth2() {
		
		System.out.println("Abstract method2");
		
	}

	static void Abstract_meth3(){
		System.out.println("static Abstract method3");
	}
	
}
