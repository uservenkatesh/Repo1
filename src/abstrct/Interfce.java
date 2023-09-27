package abstrct;

interface Interfce {

	int a=5;
	
	static String a1="str";
	
	//Basic ba=new Basic();cannot create an object for Abstract class
	
	//Basic_Absrtact b=new Interfce(); cannot create an object for interface
	
	//Interfce in= new Interfce(); cannot create an object for interface
	

	/*void test_int() {                          we cannot create non static methods in interfaces.
   System.out.println("this is from interface"); It only accepts static methods.
	}*/
	
	static void test_int1() {
    
		System.out.println("this is from interface static");
	
	}
	
}
