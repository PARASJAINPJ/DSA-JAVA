//in recursion if there is no base case then function call will be happening again and again
//and memory of computer will exceed the limit and will give STACKOVERFLOE ERROR

//WHY DO WE NEED RECURION
//it helps us solevs bigger complex problems ina simple way
//u can convert recurison solution into iteration & vice versa

//when to use space comaplexity
//when sapce complexity is not constant because of recusion cal ls  
package revision;

public class r1 {
    public static void main(String[] args) {
        int ans=fib(7);
        System.out.println(ans);
    }
    public static int fib(int n) {
        //base ecase
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2); 
    //this extra step of adding and returning is called tail reursion 
    }    
}
