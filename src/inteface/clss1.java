package inteface;

public class clss1 implements Variable1   {

	//Intefac in=new Intefac();

	 static Variable1 v = new clss1();
	
	//clss1 v1 = new Variable1();
	
	//Variable1 v2=new Variable1();
	
	public static void main(String[] args){
	
		System.out.println("integer:" +Variable1.a+ " String:" +Variable1.a1+ " double:"+Variable1.d5);
		
		System.out.println("integer:" +v.a+ " String:" +v.a1+ " double:"+v.d5);
			
		Variable1.meth2();
		
		v.meth3();
		
	}
	
	void meth2(){
		
		System.out.println("This is from class clss1");
		
	}
	
	
}
