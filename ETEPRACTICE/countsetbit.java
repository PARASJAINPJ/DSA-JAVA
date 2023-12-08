package ETEPRACTICE;
import java.util.Scanner;
import java.io.*;

public class countsetbit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        
        int count =0;
        for(int i=1;i<=Num;i++){
            int setBit = Integer.bitCount(i);
            count+=setBit;
        }
        System.out.println(count);
    }
}
// "Bit count" typically refers to the number of set (or 1) bits in a binary representation of a number or data. It is a count of how many bits in a binary sequence are turned on (set to 1). In other words, it's a count of the 1s in a binary number.

// For example:

// The bit count of 8 in binary is 1, as it's represented as 1000 (1 set bit).
// The bit count of 15 in binary is 4, as it's represented as 1111 (4 set bits).
// The bit count of 5 in binary is 2, as it's represented as 0101 (2 set bits).
    

