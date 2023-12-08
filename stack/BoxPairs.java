package stack;

    import java.util.Scanner;

public class BoxPairs {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = x.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = (ar[i]/2);
            if((i+1) < n && ar[i]%2 == 1 && ar[i+1]%2==1){
                count++;
            }
            count += sum;
        }
        System.out.println(count);
    }
}
    

