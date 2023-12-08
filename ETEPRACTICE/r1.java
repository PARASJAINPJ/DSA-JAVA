package ETEPRACTICE;
import java.util.Scanner;

public class r1{
    

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the first list
        int m = scanner.nextInt(); // Size of the second list
        int k = scanner.nextInt(); // Size of the third list

        ListNode list1 = new ListNode(scanner.nextInt());
        ListNode list2 = new ListNode(scanner.nextInt());
        ListNode list3 = new ListNode(scanner.nextInt());

        ListNode current = list1;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        current = list2;
        for (int i = 1; i < m; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        current = list3;
        for (int i = 1; i < k; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        int target = scanner.nextInt();
        findTripletsWithSum(list1, list2, list3, target);
    }

    public static void findTripletsWithSum(ListNode list1, ListNode list2, ListNode list3, int target) {
        ListNode current1 = list1;
        while (current1 != null) {
            ListNode current2 = list2;
            while (current2 != null) {
                ListNode current3 = list3;
                while (current3 != null) {
                    if (current1.val + current2.val + current3.val == target) {
                        System.out.println(current1.val + " " + current2.val + " " + current3.val);
                        return; // Exit the program after the first triplet is found
                    }
                    current3 = current3.next;
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }
    }
}

    

