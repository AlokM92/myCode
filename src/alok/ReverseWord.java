package alok;

public class ReverseWord {
	static String reverseword="";
	static StringBuffer sb;
	public static void main(String arg[]){
String str="He is a good boy";

	String words[]=str.split(" ");
	for(int i=0;i<words.length;i++){
	sb=new StringBuffer(words[i]);
	reverseword+=sb+" ";
	
}
	sb.reverse();
	 
System.out.println(reverseword.toLowerCase());	
}
}
	