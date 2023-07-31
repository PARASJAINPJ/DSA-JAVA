//correct answer
import java.util.Scanner;
public class challengebasiccalculator{
   static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        char ch;
        do {
            ch = scn.next().charAt(0);  // Use cin in case of c++
            if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%') {
                operation(ch);
            } else {
                if (ch != 'x' && ch != 'X')
                    System.out.println("Invalid operation. Try again.");
            }
        } while (ch != 'x' && ch != 'X');// x or X will be used by the user for ending the program/terminate the program
    }
    public static void operation(char ch) {
        int a = scn.nextInt(); // Use cin in case of c++
        int b = scn.nextInt(); // Use cin in case of c++
        int res = 0;
        switch (ch) {
        case '+': {
            res = a + b;
            break;
        }
        case '-': {
            res = a - b;
            break;
        }
        case '*': {
            res = a * b;
            break;
        }
        case '/': {
            res = a / b;
            break;
        }
        case '%': {
            res = a % b;
            break;
        }
        }
        System.out.println(res);
    }
}
//my answer
// import java.util.Scanner;
// import java.io.*;
// import java.lang.*;
// import java.lang.Math;

// public class basiccalculator {
//     public static void main(String[]args){
//         Scanner scn=new Scanner(System.in);
//         int i=1;
//         while(i<=3){
//         char c=scn.next().charAt(0);
//         if(c == '+'|| c=='-'||c == '*'|| c=='/'||c == '%' ){
//             if(c=='+'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1+N2);
//             break;
//         }
//         else if(c=='-'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1-N2);
//             break;
//         }
//         else if(c=='*'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1*N2);
//             break;
//         }else if(c=='-'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1-N2);
//             break;
//         }else if(c=='/'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1/N2);
//             break;
//         }else if(c=='%'){
//             int N1=scn.nextInt();
//             int N2=scn.nextInt();
            
//             System.out.println(N1%N2);
//             break;
//         }
        
//     }
//     else if(c=='x' || c=='X'){
//         break;
//     }
    
//     else{
//         System.out.println("Invalid operation. Try again");
//     }
    
// }


// }
// }
//QUESTION IS AS FOLLOWS
// Write a program that works as a simple calculator.

// 1.It reads a character (ch)
// 2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number.
// 3.If ch is 'X' or 'x', the program terminates.
// 4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).


// Write code to achieve above functionality.

// Input Format
// Constraints
// 0 <= Input integers <= 100000000
// ( It is assured that the second integer provided for division and modulo operations will not be 0. )

// Output Format
// Output a single integer output for the operations in a new line each.

// Sample Input
// * 
// 1 
// 2 
// / 
// 4 
// 2 
// + 
// 3 
// 2 
// ; 
// X
// Sample Output
// 2 
// 2 
// 5 
// Invalid operation. Try again
