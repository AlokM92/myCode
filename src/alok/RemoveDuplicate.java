package alok;

/*import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,1,3,5,4,3,6,6,4,4,3,7,8,6,6,7,1};
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+",");
	}
	int j=0;
for(int i=0;i<arr.length-1;i++){
	if(arr[i]!=arr[i+1]){
		arr[j++]=arr[i];
	}	
			arr[j++]=arr[arr.length-1];
	
}
for(int i=0;i<=arr.length;i++)
{
	System.out.print(arr[i]+",");
	}
}

}
*/
import java.util.Arrays;  
public class RemoveDuplicate{  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,70,30,90,20,20,30,40,2,2,2,4,5,6,2,8,6,70,50};//unsorted array  
        Arrays.sort(arr);//sorting array  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  