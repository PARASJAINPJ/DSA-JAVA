import java.io.ByteArrayInputStream;

public class dt1 {
    public static void main(String[]args){
        //by default short has size of 2 bites;size of byte is 8 bits
        // int has size of 4 bytes=32bits;
        // long has size of 8 bytes;
        // value of smaller size can be assigned to larger size but not vice versa 
        
        byte b=10;
        short sh=40;
        int in=30;
        long ln=40;

        ln=sh;  //is possible
       // sh=ln is not possible
        System.out.println(sh);
        b=127;
        System.out.println(b);//it will work from-128 to 127 so it will run by implicitly coversion of int to byte
       // b=128;
        //System.out.println(b);//it will not work as it does not lie in the range of byte
        //but we can do it by explicityly converting it to byte
        b=(byte) 128;
        System.out.println(b);

        //ln=10000000000;
        // it will not work of as it is not in the range of long 
         ln=1000000000L;
         //it will work now as we have converted it to long explicitly
        sh=32000;
        System.out.println(sh);//it will work as32000 lie in then range of short and will be implicitly converted
        //note that implicit conversion by default works for only short and byte data type
        //float f=5.5 ;//it will not work as by default decimal numbers are of type double so it will not accept by defalut value
        //PART 5
        float f=5.5f;
        System.out.println(f);  
        double db=6.5;
        System.out.println(db); //it will work as this is already is in double;
        //PART6
        in=(int)f;
        System.out.println(in);
        f=in;
        System.out.println(f);
        //PART 7
        boolean bit=true;

        if(bit){
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }
        if(in>0){
            System.out.println("greater");
        } 
        else{
            System.out.println("lesser or equal")  ;
        }//here in java 0and 1 not work unlike in c and c++. 
        //part 8
        char ch='a';
        ch=99;
        System.out.println(ch);

        // ch=64000;
        // System.out.println(ch);//it will work as 64000 is in the range of teh char.

       // ch=ch+2//it will not work as we can not insert int value(2) in char
       //  so we will  explicitly convert this value in char.
        ch=(char)(ch+2);
        System.out.println(ch);

        in=ch;
        System.out.println(in);

        ch=(char)68000;
        System.out.println(ch);
        //part 9

        System.out.println(10+20+"hello"+10+20);
        System.out.println(2+' '+5);//here ascii value of space character will be taken i.e.32
        System.out.println(2+" "+5);
        System.out.println("hello"+'\t'+"world");
        System.out.println("hello"+"\t"+"world");

         


        
    }

    
    
}
