package ETEPRACTICE;

public class BinaryPalindrome {
            public static void main(String[] args) {
            int A = 6; // Change A to the desired value
            int count = 0;
            int num = 1;
    
            while (count < A) {
                String binary = Integer.toBinaryString(num);
                if (isPalindrome(binary)) {
                    count++;
                    if (count == A) {
                        System.out.println("The " + A + "th binary palindrome number is: " + num);
                        break;
                    }
                }
                num++;
            }
        }
        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
