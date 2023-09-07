package recursion;

public class powerofanumber {
    public static void main(String[] args) {
        int n=2;
        System.out.println(power(n,10));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
}
//this solves the problem in o(n);
