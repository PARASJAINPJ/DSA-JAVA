
package classwork;
import java.util.Scanner;
public class c1 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=5;
        int nst=5;
        int row=0;
        while(row<n){
            for(int cst=0;cst<nst;cst++){
           
                System.out.print("*");
            }
            System.out.println();
            row++;
        }
    }
}
sys