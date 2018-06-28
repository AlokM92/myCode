package alok;

public class Reverse {

	public static String reverseStr(String str) throws ArrayIndexOutOfBoundsException{
		int length= str.length();
		
		for(int i=length;i>0;i--){
			str.charAt(i);
		}
		System.out.println("the reverse string is" +str);
		return str;
	}
public static void main(String arg[]){
	String s="I am superman";
	reverseStr(s);
}
}
