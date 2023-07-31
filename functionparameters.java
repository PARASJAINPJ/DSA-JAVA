public class functionparameters {
    public static void main(String[]args){
        System.out.println("hello");
        //function call
        addition(9,10);
        addition(10,5);
        System.out.println("bye");
    }
    //function definition
    public static void addition(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    
}
