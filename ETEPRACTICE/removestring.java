package ETEPRACTICE;
import java.util.*;
public class removestring{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the linked list
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Input the strings and create the linked list
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.next());
        }

        // Input the string for comparison
        String compareString = scanner.next();

        // Remove elements less than or equal to the given string
        ArrayList<String> result = new ArrayList<>();
        for (String str : linkedList) {
            if (str.compareTo(compareString) > 0) {
                result.add(str);
            }
        }

        // Output the result
        System.out.println(result);
    }
}