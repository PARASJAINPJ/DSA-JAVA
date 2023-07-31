import java.util.Scanner;

public class challengecanureadthis {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        for(int i=0;i<str.length();i++){
            if(i!=0 && Character.isUpperCase(str.charAt(i))){
                System.out.println();
            }
            System.out.print(str.charAt(i));
    }
    
}
}
