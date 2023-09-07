// Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

// His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

// Input Format
// First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

// Constraints
// 2 <= N <= 100,000
// 0 <= xi <= 1,000,000,000
// 2 <= C <= N

// Output Format
// Print one integer: the largest minimum distance.

// Sample Input
// 5 3
// 1 2 8 4 9
// Sample Output
// 3
import java.util.*;
public class aggressivecows {
	    public static void main(String args[]) {
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    //noc no of cows
	    int noc=scn.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=scn.nextInt();
	    } 
	    Arrays.sort(arr);
	    int lo=arr[0];
	    int hi=arr[arr.length-1];
	    int ans=0;
	    while(lo<=hi)
	    {
	int mid=(lo+hi)/2;
	boolean res=isItPossible(arr,noc,mid);
	if(res==true)
	{ans=mid;
	    lo=mid+1;
	}
	else{
	    hi=mid-1;
	}

	    }
	    System.out.println(ans);

	    }
	    public static boolean isItPossible(int arr[],int noc,int mid)
	    {
	int lp=arr[0];//lat placed stall position
	int cpsf=1;//cows place sofar
	for(int i=1;i<arr.length;i++)
	{
	    int dist=arr[i]-lp;
	    if(dist>=mid)
	    {
	     cpsf+=1;
	     lp=arr[i];   
	    }
	}
	if(cpsf>=noc)
	{
	    return true;
	}
	else{
	    return false;
	}
	    }
	}

// explaination of isitpoosible code
// public static boolean isItPossible(int arr[], int noc, int mid) {
//     int lp = arr[0];  // Initialize the last placed stall position to the first stall
//     int cpsf = 1;  // Initialize the count of placed cows to 1 (for the first stall)
    
//     for (int i = 1; i < arr.length; i++) {
//         int dist = arr[i] - lp;  // Calculate the distance between the current and last placed stalls
        
//         if (dist >= mid) {  // Check if the distance is greater than or equal to the required minimum distance (mid)
//             cpsf += 1;  // Place a cow in the current stall
//             lp = arr[i];  // Update the last placed stall position
//         }
//     }
    
//     if (cpsf >= noc) {  // Check if the count of placed cows is greater than or equal to the required number of cows (noc)
//         return true;  // It is possible to place the cows with the given constraints
//     } else {
//         return false;  // It is not possible to place the cows with the given constraints
//     }
// }
// Here's how the code works:

// The function isItPossible takes three parameters: an array arr representing the positions of stalls, an integer noc representing the number of cows to be placed, and an integer mid representing the required minimum distance between the cows.

// The variables lp (last placed stall position) and cpsf (count of placed cows so far) are initialized. They start from the first stall.

// The loop iterates through the array of stall positions starting from the second stall (index 1). It calculates the distance dist between the current stall and the last placed stall.

// If the calculated distance dist is greater than or equal to the required minimum distance mid, it means a cow can be placed in the current stall while maintaining the minimum distance constraint. In this case, the count of placed cows cpsf is incremented by 1, and the last placed stall position lp is updated to the current stall position.

// After iterating through all the stalls, the function checks if the count of placed cows cpsf is greater than or equal to the required number of cows noc.

// If the count of placed cows is sufficient, the function returns true, indicating that it's possible to place the cows in such a way that the minimum distance constraint is satisfied.

// If the count of placed cows is not sufficient, the function returns false, indicating that it's not possible to place the cows while maintaining the minimum distance constraint.

// Overall, this function is used to check whether it's possible to place a specified number of cows in stalls while ensuring a minimum distance between them. It uses the concept of greedy placement, iterating through the stalls and making decisions based on the required constraints.