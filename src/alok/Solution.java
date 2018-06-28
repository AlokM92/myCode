package alok;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={2,10,4,3,3,3,5,5,7,8,9,9};
		int rank=1;
		markforRank(arr,rank);
		
 }


static int markforRank(int marks[], int rank)
{
	int n= marks.length;
	Arrays.sort(marks);
	for(int i=0;i<n;i++)
	System.out.print(marks[i]+",");
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(marks[i]==marks[j]){
				marks[j]=-1;
			}
			else
				break;
		}
	}
	int index=0, temp;
	Arrays.sort(marks);
	for(int i=0;i<n;i++)
	System.out.print(marks[i]+",");
	for(int i=n;i<1;i--){
		 temp= marks[i];
	if(temp!=-1){
		index++;
		
	}
	System.out.println(index+",");
	}
	System.out.print("marks at given rank"+marks[index]);
	return 0;


}
}