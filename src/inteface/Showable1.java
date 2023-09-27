package inteface;
	
	class Showable1 extends Basic_Abstract{  
			
		//Showable sh= new Basic_Abstract(); object cannot be created for abstract class
		
		static Basic_Abstract ba=new Showable1();
		
		static Showable1 sh=new Showable1();
		
		 void using_super() {
			super.Abstract_meth1();
		}
		
		//Basic_Abstract bs=new Basic_Abstract(); object cannot be created for abstract class
			   
	        void Abstract_meth1() {
			System.out.println("class extending abstract");
			}
		
			public static void main(String[] args) {
				((Showable1) ba).using_super();
				sh.using_super();
				ba.Abstract_meth1();
				ba.Abstract_meth2();
				Basic_Abstract.Abstract_meth3();
				
				sh.Abstract_meth1();
				sh.Abstract_meth2();
				Showable1.Abstract_meth3();
				
			}
		}

