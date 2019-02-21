import java.util.Hashset;

public class RemoveDuplicates {
	
	public static void main(String args[]){
		
	String str = "Vaishnavi";
	
System.out.println(removeDuplicates(str));
	}
	
	public static removeDuplicates(String str){
		Set<Character> set = new Hashset<>();
		StringBuffer sf = new StringBuffer();

for (int i = 0; i < str.length; i++){
Character c = str.charAt(i);
if(!set.contains(c)){
set.add(c);
sf.append(c);
}
}

return sf.tostring();
		
	}

}
