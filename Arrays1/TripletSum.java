Triplet Sum
Send Feedback
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
package Lec7operators_loops;


public class arrayPairSumTriplet {
	public static int pairSum(int arr[], int x) {
        //Your code goes here

        int n=arr.length;
        int pair = 0;
        
        for(int i = 0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            	for(int k=j+1; k<n; k++) {
            		 if(arr[i]+arr[j] + arr[k]==x)
                     {
                         pair =pair +1;
                     }
            		
            	}
               
            }
        }
        return pair;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	int arr[] = {1,2,3,4,5,6,7};
        int target = 12;
        int ans = pairSum(arr,target);
        System.out.println(ans);
    }


}

