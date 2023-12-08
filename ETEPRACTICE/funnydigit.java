package ETEPRACTICE;
import java.util.*;
import java.math.*;
public class funnydigit {
static boolean check(int n){
        int prev = n%10;
        n=n/10;
        while(n>0){
            int dig=n%10;
            if(prev<dig){
                return false;
            }
            n=n/10;
            prev = dig;
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans = -1;
        
        for(int i=n-1; i>=0; i--){
            if(check(i)){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
