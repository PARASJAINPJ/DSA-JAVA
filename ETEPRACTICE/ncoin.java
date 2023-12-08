// *N Coins*
// *Approach*
// 1) Sort the array (sorting in string Arrays is done lexicographically automatically)
// 2) Reverse the output

// import java.util.*;
// class HelloWorld {
//     public static void main(String[] args) {
        
//         String[] arr = { "54", "546", "548", "60" };
        
//         Arrays.sort(arr);
//         Collections.reverse(Arrays.asList(arr)); 
        
//         for (String s : arr) {
//             System.out.print(s + "");
//         }
        
//     }
// }
package ETEPRACTICE;
import java.util.*;

import recursion.factorial;

public class ncoin {
    public static void main(String[] args) {
        
    
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    String []arr=new String[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.next();
    }
    Arrays.sort(arr);
    Collections.reverse(Arrays.asList(arr));
    for(int j=0;j<arr.length;j++){
       System.out.print(arr[j]+"");
    }
    
}
}
