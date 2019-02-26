
public class Swap {
	public static void main(String args[]){
		
		int a = 30, b = 40;
		
		System.out.println("Before Swapping:");
		System.out.println("first number is:" + a);
		System.out.println("Second numberis:" + b);
		
		int temporary = a;
		
		a = b;
		
		b = temporary;
		
		System.out.println("After Swapping:");
		System.out.println("First number is:" +a);
		System.out.println("Second number is:"+b);
	}

}
