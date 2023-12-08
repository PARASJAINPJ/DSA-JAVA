package ETEPRACTICE;
import java.util.ArrayList;
import java.util.Scanner;

public class recursivetextsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String largerText = scanner.nextLine();
        String targetSubstring = scanner.nextLine();

        ArrayList<Integer> positions = new ArrayList<>();
        int index = largerText.indexOf(targetSubstring);

        while (index!=-1) {
            positions.add(index);
            index = largerText.indexOf(targetSubstring, index + 1);
        }

        if (positions.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(positions);
        }
    }
}

    

