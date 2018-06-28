package alok1;

public class FindKey {
	
int findKey(int[] arr,int l,int r, int k){
	
	int mid=r/2;
	if(arr[mid]==k)
	return mid;
	if(arr[l]<=arr[mid])
		if(k>=arr[l] && k<=mid)
			return findKey(arr, l,mid-1,k);
			else
				return findKey(arr, mid+1, r, k);
	
		}
public static void main(String args[]){
int[] arr={8,9,10,1,2,3,4,5,6,7};
int k=6;
int l=0,r=arr.length;
}
}
