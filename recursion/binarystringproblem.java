//print all binary strings of size without consecutive ones
package recursion;

public class binarystringproblem {
    public static void main(String[] args) {
        printbinstrings(3,0,"");
    }
    public static void printbinstrings(int n,int lastplace,String str) {
        //basecase
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printbinstrings(n-1, 0, str +"0");
        if(lastplace==0){
            printbinstrings(n-1, 1, str+"1");
        }
        
    }
}
