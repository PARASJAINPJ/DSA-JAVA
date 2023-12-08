package ETEPRACTICE;

// import java.util.Scanner;

// public class ProductTagGenerator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String productType = scanner.nextLine();
//         String tag = generateProductTag(productType);
//         System.out.println(tag);
//         scanner.close();
//     }

//     public static String generateProductTag(String productType) {
//         StringBuilder tag = new StringBuilder();
//         int length = productType.length();

//         // Iterate through the product type string
//         for (int i = 0; i < length; i++) {
//             char currentChar = productType.charAt(i);

//             // Check if the next character is available for pairing
//             if (i < length - 1) {
//                 char nextChar = productType.charAt(i + 1);

//                 // Determine the lexicographically smaller character and append it to the tag
//                 if (currentChar < nextChar) {
//                     tag.append(currentChar);
//                 } else {
//                     tag.append(nextChar);
//                     i++; // Skip the next character since it's paired
//                 }
//             } else {
//                 // If the current character is the last character, keep it as is in the tag
//                 tag.append(currentChar);
//             }
//         }

//         return tag.toString();
//     }
// }

import java.util.Scanner;

public class ProductTagGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productType = scanner.nextLine();
        String tag = generateTag(productType);
        System.out.println(tag);
        scanner.close();
    }

    public static String generateTag(String productType) {
        StringBuilder tag = new StringBuilder();

        // Initialize the first character
        char currentChar = productType.charAt(0);
        tag.append(currentChar);

        // Loop through the product type to form pairs and generate the tag
        for (int i = 1; i < productType.length(); i++) {
            char nextChar = productType.charAt(i);

            // Compare and add the lexicographically smaller character to the tag
            if (currentChar < nextChar) {
                tag.deleteCharAt(tag.length() - 1); // Remove the last character
                tag.append(currentChar); // Add the smaller character
            } else if (currentChar > nextChar) {
                tag.append(nextChar); // Add the smaller character
            }

            currentChar = nextChar;
        }

        return tag.toString();
    }
}
