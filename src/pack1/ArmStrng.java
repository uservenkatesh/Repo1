package pack1;

import java.util.Scanner;

public class ArmStrng {

	public static void main(String[] args) {
	
			int number;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number : ");
			number = sc.nextInt();
			System.out.println("Is amstrong num ; " + isAmstrong(number));
		}
		
		static boolean isAmstrong(int n) {
			int digits = 0, temp;
			double sum = 0;
			temp = n;
			while(temp > 0) {
				temp = temp/10;
				digits++;
			}
			System.out.println("No of digits: " + digits);
		
			temp = n;
			while(temp> 0) {
				int lastDigit = temp %10;
				sum = (sum +Math.pow(lastDigit, digits));
				temp =temp/10;
			
			}
			System.out.println("sum is ; " + sum);
			 
			if(sum == n)
				return true;
			
			return false;
			}


	}
   
