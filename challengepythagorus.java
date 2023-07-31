
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.Long;



public class challengepythagorus {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        Long N=scn.nextLong();

        // Long  X;
        // Long  Y;

      if(N<3){
        System.out.println("-1");
      }
      if(N%2==0){
        Long X=(N*N/4)-1;
        Long Y=(N*N/4)+1;
        System.out.println(X+" "+ Y);
      }
      else{
        Long X=(N*N-1)/2;
        Long Y=(N*N+1)/2;
        System.out.println(X+" "+Y);
      }
      
      
      

    }
    
}
