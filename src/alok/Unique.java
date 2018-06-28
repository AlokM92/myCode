package alok;

public class Unique {

	static int uniqueArray(int[] arr,int n){
		int i;
		int[] temp=new int[n];
		int j=0;
		for(i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1])
			temp[j++]=arr[i];
		}
			temp[j++]=arr[n-1];
			System.out.println(j);
			for(i=0;i<j;i++){
			arr[i]=temp[i];
			
}
		return j;
}
	public static void main(String args[]){
		int arr[]={2,2,7,7,8,8,9,9,9};
		int l=arr.length;
		l=uniqueArray(arr, l);
		for(int i=0;i<l;i++)
		System.out.print(arr[i]+" ");
	}
}