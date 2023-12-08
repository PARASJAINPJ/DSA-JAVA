package ETEPRACTICE;

import java.util.*;
import java.math.*;
public class goodsubarray {


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                Set<Integer> st = new HashSet<>();
                for(int l=i; l<=j; l++){
                    st.add(arr[l]);
                }
                if(st.size()==k){
                    count++;
                }
            }
        }
        System.out.print(count);
 

    }
}
