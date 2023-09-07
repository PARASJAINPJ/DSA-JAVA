package recursion;

public class friendspairing {
    public static void main(String[] args) {
        int n=4;
        System.out.println(friendpairing(n));
    }
    public static int friendpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendpairing(n-1);
        //pair
        int fnm2=friendpairing(n-2);
        int pairedways=(n-1)*fnm2;
        //total ways
        int totways=fnm1 + pairedways;
        return totways;
        //or eliminating lines 12-20 u can directly write return friendpairing(n-1) + (n-1)*friendpairing(n-2)
    }

    
}
