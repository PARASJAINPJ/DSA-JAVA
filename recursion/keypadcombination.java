package recursion;
import java.util.*;

public class keypadcombination {
    public static String[] keypad = {".","abc","def","ghi","mno","pqrs","tu","vwx","yz"}; 
        public static void printcomb(String str,int idx,String combination) {
           if(idx==str.length()){
            System.out.println(combination);
            return;
           }
           char currchar=str.charAt(idx);
           String mapping=keypad[currchar-'0'];
           for(int i=0;i<mapping.length();i++){
            printcomb(str, idx+1, combination+mapping.charAt(i));
            }
        }
    
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    printcomb(str, 0, "");    
 }
}

