package alok;

class GFG
{
// Returns length of the largest subarray
// with 0 sum
static int maxLen(int arr[], int n)
{
    int max_len = 0; 
 
    // Pick a starting point
    for (int i = 0; i < n; i++)
    {
        // Initialize curr_sum for every
        // starting point
        int curr_sum = 0;
 
        // try all subarrays starting with 'i'
        for (int j = i; j < n; j++)
        {
            curr_sum += arr[j];
 
            // If curr_sum becomes 0, then update
            // max_len
            if (curr_sum == 0)
                max_len = Math.max(max_len, j-i+1);
        }
    }
    return max_len;
}
     
public static void main(String args[])
{ 
    int arr[] = {15, -2, -2, -8, 1,9, 10, 23};
    int n = arr.length;
    System.out.println("Length of the longest 0 sum "+
                       "subarray is "+ maxLen(arr, n));     
}
}