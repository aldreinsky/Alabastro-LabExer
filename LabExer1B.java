import java.util.Scanner;

public class LabExer1B{
	
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
			System.out.print("Enter Integer: ");
		int num = input.nextInt();
		int a = num + 10;
		int b = num + 100;
		int c = num + 1000;
		
	
		
		
		System.out.println(num + " plus 10 is " + a);
		System.out.println(num + " plus 100 is " + b);
		System.out.println(num + " plus 1000 is " + c);
		
		}
	}