Pair Sum
Send Feedback
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.

package Lec7operators_loops;


public class arrayPairSum {
	public static int pairSum(int arr[], int x) {
        //Your code goes here

        int n=arr.length;
        int pair = 0;
        
        for(int i = 0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    pair =pair +1;
                }
            }
        }
        return pair;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	int arr[] = {1,3,5};
        int target = 7;
        int ans = pairSum(arr,target);
        System.out.println(ans);
    }


}

