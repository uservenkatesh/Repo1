package pack1;

public class do_while {

	public static void main(String[] args) {
				int i=5;
				do{
					
					int j=0;
					do{
						j++;
						System.out.print(" ");
						
					}while(j<=i);
					int k=5;
					while(k>=i)
					{
				System.out.print("*");
				k--;
				}
					System.out.println();
					i--;
		      }while(i>=0);
	}
}
	
