//this is just an optimzed approach of power it solves the problem in o(logn)
package recursion;

public class optimizedpower {
    public static void main(String[] args) {
        int n=2;
        System.out.println(optimizepower(n,10));
    }
    public static int optimizepower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizepower(x,n/2);
        int halfpowersq=halfpower*halfpower;
        //n is odd
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    
}
