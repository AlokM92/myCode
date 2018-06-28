package alok;

public class Comp {
	public static void main(String arg[]){
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		StringBuffer s4=new StringBuffer("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
		
	}

}
