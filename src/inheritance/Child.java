package inheritance;

public class Child extends Parent{

	static Child ch=new Child();
	
	static Parent pt=new Parent();
	
	void child_method(){
		
		System.out.println("This method is from child class");
		
	}

	void parent_method(){
		
		System.out.println("This is from child class override method");
	
	}
	
	public static void main(String[] args) {
	
		ch.parent_method();
		
		pt.parent_method();
		
		ch.parent_method1();
		
		System.out.println(ch.a=5);
		
	}
}
