public class functionreturnvalue {
    public static void main(String[]args){
        System.out.println("hello");

        int sum=additionreturn(30,40);
        if(sum>100){
            System.out.println(sum);
        }
        System.out.println("bye");
    }
    public static int  additionreturn(int a,int b){
        int sum=a+b;
        return sum;
    }
    
}
//there are 2 types of memory stack and heap 
//when the variable is declared globally it is stored in heap
