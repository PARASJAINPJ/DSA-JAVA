package revision;

public class r5 {
    public static void main(String[] args) {
       System.out.println(sumofdigits(1432));
       System.out.println(productofdigits(1432));
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) +sumofdigits(n/10);
    }
      static int productofdigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*productofdigits(n/10);
    }
    
}
