
public class NewSwap {

	public static void main(String args[]){
		
		int a=20,b=30;
		
		System.out.println("Before Swapping:");
		System.out.println("First:" +a);
		System.out.println("Second:"+b);
		
		a = a-b;
		b = b+a;
		a = b-a;
		System.out.println("After Swapping:");
		System.out.println("First After Swapping:"+a);
		System.out.println("Second After Swapping:"+b);
		
		
	}
}
