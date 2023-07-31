public class functionglobalvariable {

    public static int val=200;
    public static void main(String[]args){
        System.out.println(val);
        int val=100;
        System.out.println(val);
        System.out.println(functionglobalvariable.val);

    }
    
}
