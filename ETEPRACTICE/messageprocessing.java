package ETEPRACTICE;
import java.util.Scanner;

public class messageprocessing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String result=str.replaceAll(" ", "");
        System.out.println(result);
    }
}
