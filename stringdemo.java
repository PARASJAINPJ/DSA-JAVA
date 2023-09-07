public class stringdemo {
    public static void main(String[] args) {
        String str="hello";
        str="bye";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length()-1));

        //substring
        str="hello";
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(3,3));
        System.out.println(str.substring(1));
        
        //concatenation
        String s1="hi";
        String s2="bye";
        String s3=s1 +s2;
        System.out.println(s3);
        String s4=s1.concat(s2);
        System.out.println(s4);
       
        //indexof predefined function
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("ma"));

        //startswith predefined function
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("ma"));

        //comparison of string
        s1="hello";
        s2=s1;
        s3="hello";
        s4=new String("hello");

        System.out.println((s1==s2)+","+ s1.equals(s2)); //true true
        System.out.println((s1==s3)+","+ s1.equals(s3));//true true
        System.out.println((s1==s4)+","+ s1.equals(s4));//false true
    }
    
}
//we use comparetoignorecase for ignoring uppercase and lowercase of letters
//we use compareTo for not ignoring
