package ETEPRACTICE;

import java.util.Scanner;

public class housevisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of houses (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number not divisible by (M): ");
        int M = scanner.nextInt();

        int count = 0;
        int houseNumber = 2; // Starting with the first house number

        while (count < N) {
            // Check if the house number satisfies the equation (3k+2) and is not divisible by M
            if ((houseNumber % 3 == 2) && (houseNumber % M != 0)) {
                System.out.println(houseNumber);
                count++;
            }

            houseNumber++; // Move to the next house number
        }

        scanner.close();
    }

    
}
