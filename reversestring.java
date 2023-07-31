import java.util.Scanner;



public class reversestring {
    public static void main(String[] args) {
        String str="hello";
        //APPROACH 1
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();

        //APPROACH 2
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //APPROACH 3
        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());
        System.out.println();

        //APPROACH 4
        StringBuilder s=new StringBuilder(str);
        System.out.print(s.reverse());
    }
    
}
