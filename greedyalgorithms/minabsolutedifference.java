package greedyalgorithms;

import java.util.Arrays;

public class minabsolutedifference {
    public static void main(String[] args) {
        int A[]={1,3,2};
        int B[]={3,2,1};

        Arrays.sort(A);
        Arrays.sort(B);
        int mindiff=0;

        for(int i=0;i<A.length;i++){
            mindiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Min absolute duffernce is = "+ mindiff);
    }
    
}
