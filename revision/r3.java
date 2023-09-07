package revision;

public class r3 {
    public static void main(String[] args) {
       fun(5); 
    }
    static void fun(int n){
        if(n==0){
            return;
        } 
        //fun(n-1);if u call function here it will print count in 1 2 3 4 5 
        System.out.println(n);  
        fun(n-1);
        
    }
}
