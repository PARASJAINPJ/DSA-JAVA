package ETEPRACTICE;
import java.util.Scanner;

public class claudiagavearif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = canMakeEqual(arr);
        System.out.println(result);
    }
    
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    
    public static String canMakeEqual(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = findGCD(gcd, arr[i]);
        }
        
        if (gcd == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
