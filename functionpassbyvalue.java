public class functionpassbyvalue {

    public static void main(String[]args){
        int one=10;
        int two=20;
        System.out.println(one+","+two);
    }
    public static void swap(int one,int two){
        int temp=one;
        one=two;
        two=temp;
        System.out.println(one+","+two);

    }
}
