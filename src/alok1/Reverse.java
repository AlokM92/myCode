package alok1;

public class Reverse {

	public void reverse(String str){
		if(str==null){
			System.out.println("Reverse.reverse()"+str);
		}
		else{
			System.out.println(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}
		
	}
	public static void main(String[] args) 
    {
        String str = "Geeks for Geeks";
        Reverse obj = new Reverse();
        obj.reverse(str);
    }    

}
