import javax.print.DocFlavor.STRING;

public class removespace {
    public static void main(String[] args) {
        String str=" P A  RAS    JA  I N";
        String result=str.replaceAll(" ", "");
        System.out.println(result);
    }
    
}
