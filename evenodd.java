import java.util.Scanner;

public class evenodd {
    public static void main(String[]args){

      Scanner scn = new Scanner(System.in); {
        int n=scn.nextInt();

        System.out.println(n);

        if(n%2==0){
          System.out.println("even");
        }else{
          System.out.print("odd");
        }
      }
      
    } 
    
}
