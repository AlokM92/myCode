package alok;

//import com.yodlee.dap.gatherer.validationutils.YDataLogger;

public class Pair {
	public static void main(String arg[]) throws Exception{
	/*int[] a={-1,2,5,3,2,1};
	int k=4,l=a.length;
	
	
	for(int i=0;i<l;i++){
		for(int j=1;j<l-1;j++){
			if((a[i]+a[j])==k){
				System.out.println("pairs are"+a[i]+""+a[j]);
			}
		}
	}
	*/
	String accNumber="XXXX XXXX XXXX 4251 | Min. payment: $50.00 due on 09 Jan";
	String accountNumber=accNumber.substring(accNumber.indexOf("X"), accNumber.length()-1);
	System.out.println("2^^^^^^^^^^acc number1 in if"+accountNumber);
	accountNumber=accountNumber.substring(0,accountNumber.indexOf("|")).trim();
	System.out.println("2^^^^^^^^^^acc number2 in if"+accountNumber);
	//accountNumber.substring(accountNumber.i(, accNumber.length()-1);
	System.out.println("2^^^^^^^^^^acc number2 in if"+accountNumber);
}
}