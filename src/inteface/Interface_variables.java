package inteface;

interface Interface_variables {

	  static void Interface_variables(){
		
		 System.out.println("constructor interface");
	
	 }

	public static void main(String[] args) {
		
		Interface_variables();
	}
	
	int a=6;
	
	String st="abc";
	
	double d=1.2;
	
	default void meth1() {
		
		System.out.println("This is interface_variables");
		
	}

}
