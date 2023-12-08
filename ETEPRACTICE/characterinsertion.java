package ETEPRACTICE;

import java.io.*;

public class characterinsertion {

    // Function to add stars
    public static String addStars(String s, int stars[]) {
        // Create a string ans for storing resultant string
        String ans = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            // If the count of characters become equal to the stars[j], append star
            if (j < stars.length && i == stars[j]) {
                ans += '*';
                j++;
            }
            ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "teststring";
        int chars[] = { 2, 5 };
        String ans = addStars(str, chars);
        // Printing the resultant string
        System.out.println(ans);
    }

}
