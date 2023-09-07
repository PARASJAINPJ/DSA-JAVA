//reverse a number and palidrome
package revision;

public class r6 {
    public static void main(String[] args) {
       rev(1234);
       System.out.println(sum);
       System.out.println(palin(1234));
         
    }
    static int sum=0;
    public static void rev(int n) {
        if(n==0){
            return;
        }
        int rem=n%10;
        sum =sum*10 +rem;
        rev(n/10);
    }
    public static boolean palin(int n){
       return n == sum;
    }
    
}
