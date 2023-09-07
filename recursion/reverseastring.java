package recursion;

public class reverseastring {
    public static void printrev(String s,int i) {
        if(i==0){
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print (s.charAt(i));
        printrev(s,i-1);
        
    }
    public static void main(String[] args) {
        String s="abcd";
        printrev(s,s.length()-1);
    }
}

