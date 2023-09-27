package encapsulation;

public class Test_Encap {
	
		public static void main(String[] args) {  
		   
			//creating instance of Account class  
			Encap acc=new Encap();  
		    
			//setting values through setter methods  
		    
			acc.setAcc_no(7560504000L);  
		    acc.setName("venkatesh v");  
		    acc.setEmail("venkatesh@gmail.com");  
		    acc.setAmount(500000f);  
		    
		    //getting values through getter methods  
		    System.out.println(acc.getAcc_no()+"\n"+acc.getName()+"\n"+acc.getEmail()+"\n"+acc.getAmount());  
		}  
		}  

