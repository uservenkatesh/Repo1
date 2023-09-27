package polymorfism;

public class Overloading {
	
	static void meth1(){
		              System.out.println("no aurgments: ");
	             }
			
		static void meth1(int a){
	             System.out.println("int aurgment: "+a);
	        }
			
		static  void meth1(int a,int b){
	             System.out.println("int 2 aurgments: " +(a+b));
	        }
		static  void meth1(int a,int b,int c){
	             System.out.println("int 3 aurgments: " +(a+b+c));
	        }
		static  void meth1(int a,String st){
	             System.out.println("int string aurgments: " +(a+st));
	        }
		static  void meth1(String a,String b){
	             System.out.println("no aurgments: " +(a+b));
	        }
		static   void meth1(double a,double b){
	             System.out.println("no aurgments: " +(a+b));
	        }
		static   void meth1(boolean a,boolean b){
	             System.out.println("no aurgments: " +a+b);
	        }

	public static void main(String[] args) {
		meth1();	
		meth1(2);
		meth1(1,2);
		meth1(1,2,3);
		meth1(1,"venkatesh");
		meth1("a","b");
		meth1(1.2,2.4);
		meth1(true,false);
	}

	}
