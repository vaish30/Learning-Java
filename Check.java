import java.util.Scanner;
public class Check {
	public static void main (String args[]){
		int a;
		
		Scanner aScanner = new Scanner(System.in);
		System.out.print(" Enter a number");
		a = aScanner.nextInt();
		
		if(a % 2==0)
		{
			System.out.println("Given no. is even");
		}
		else
		{
			System.out.print("Given no. is odd");
			
		}
	}

}
