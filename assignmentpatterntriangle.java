import java.util.Scanner;
public class assignmentpatterntriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		 // number of rows in the pyramid
        for (int i = 1; i <= n; i++) {
            // print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print the numbers on the left side of the pyramid
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            // print the numbers on the right side of the pyramid
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // move to the next line
        }
    }
}
