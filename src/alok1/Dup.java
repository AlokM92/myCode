package alok1;

public class Dup {
public void duplicate(int arr[], int n){
	for(int i=0;i<n;i++){
		if(arr[Math.abs(arr[i])]>0)
			arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			else
				 System.out.print(Math.abs(arr[i]) + " ");
		}
	}
public static void main(String args[]){
	int arr[]={1, 6, 2, 3, 1, 3, 6, 5, 6};
int l=arr.length;
Dup d=new Dup();
d.duplicate(arr, l);
}

}
