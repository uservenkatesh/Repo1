package inteface;

interface  Intefac extends  Variable1 {
		
	//Intefac vt=new Variable1();//We cannot create object for interfaces
	
    //Variable1 vi=new Intefac();//We cannot create object for interfaces
	
	int i1=5;
	
	static String i2="string_interface";

	abstract void print();
	
	static void Intefac() {
		
		int con=5;
		
		System.out.println("Interface Constructor"+con);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("integer: "+Variable1.a+ "string: "+Variable1.a1+"double: "+Variable1.d5);
		
		Variable1.meth2();//static methods can be accessed using interface(class) name
		
		Variable1.print();
		
		//Intefac.print();
		
		//vi.meth3(); default methods cannot be accessed from one interface to another interface
		
	}
	
}  
	
