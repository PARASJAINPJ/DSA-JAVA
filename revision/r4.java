package revision;

public class r4 {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    public static int fact(int n){
        if(n<2){
            return 1;
        }
        return n*(fact(n-1));
    }
    public static int sum(int n){
        if(n<2){
            return 1;
        }
        return n+ (sum(n-1));
    }
    
    
}
