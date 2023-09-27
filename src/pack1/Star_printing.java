package pack1;

public class Star_printing {

	public static void main(String[] args) {
		
		//for(int i=5;i>=0;i--)
		int i=5;
		while(i>=0){
			
			//for(int j=0;j<=i;j++) 
			int j=0;
			while(j<=i)
			{
				
				System.out.print(" ");
				
			j++;
			}
			//for(int k=5;k>=i;k--)
			int k=5;
			while(k>=i)
			{
		System.out.print("*");
		k--;
		}
			System.out.println();
			i--;
      }
	}
  }

	
