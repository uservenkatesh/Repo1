package pack1;
import java.util.Scanner;
public class Even_odd_sum {

	public static void main(String[] args) {
		
	    System.out.println("Enter n value: ");
		
	    Scanner sc = new Scanner(System.in);
	    
	    int even_count=0,odd_count=0,even_sum = 0,odd_sum=0,even_avg=0,odd_avg=0;
	    
	    int n=sc.nextInt();
	    
		System.out.println("Enter the values: ");
	
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			
			a[i]=sc.nextInt();
			
		}
		
		//System.out.println("even numbers are:");
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]%2==0) {
			
			even_count++;
			
		   System.out.println(a[i]+" is even number");
		   
		   even_sum=even_sum+a[i];
		   
		   even_avg=even_sum/even_count;
		    
		   }
		else if(a[i]%2!=0) {
			
			odd_count++;
			
			System.out.println(a[i]+" is odd number");
			
			 odd_sum=odd_sum+a[i];
			 
			 odd_avg=odd_sum/odd_count;
			
		}
		 
		}	
        System.out.println("count of even numbers: "+even_count+"\neven  sum is: "+even_sum+"\neven average: "+even_avg);
		
		System.out.println("count of odd numbers: "+odd_count+"\nodd sum is: "+odd_sum+"\nodd average: "+odd_avg);
		}
	
}
