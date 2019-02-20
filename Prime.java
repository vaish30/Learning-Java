
public class Prime {
	public static void main(String args[]){
		
		int i, num = 13;
		
		boolean flag = false;
		
		for(i=2;i<=num/2;i++){
			
		
		if(	num % i ==0)
			flag=true;
		}
		
	 if(!flag)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number ");
		
	}

}
