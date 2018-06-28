package alok;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
public class Pattern1 {

	public static void main(String[] args)throws Exception {
	
	  
		 String  repeatedWord=null;
           String s="abc	hjuhuy	abc";
		   String[]  arraySrtr = s.split("(\\s|\\.|\\:|\\;|\\,|\\-\\t)");
		   int len = arraySrtr.length;
		   for(int i=0;i<len;i++){
			   for(int j=i+1;j<len;j++){
				   if(arraySrtr[i].equals(arraySrtr[j])){
					  repeatedWord=arraySrtr[i];
					  break;
				   }
			   }
		   }
			System.out.println("the value is:"+repeatedWord);
		   
		  /* //Pattern ptn = Pattern.compile("(\\s || \\, || \\: || \\; || \\- || \\.)");
		   //Pattern ptn = Pattern.compile("\\s");
	        arraySrtr = s.split("\\.");
	        
		   int len = arraySrtr.length;
		   for(int i=0;i<len;i++){
			   for(int j=i+1;j<len;j++){
				   if(arraySrtr[i].equals(arraySrtr[j])){
					  a=arraySrtr[i];
					  break;
				   }
			   }
		   }
		   System.out.println("printing the value"+a);*/
	}
}
