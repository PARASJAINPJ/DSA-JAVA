import java.util.Scanner;
public class twodarray{
    public static void main(String[]args){
        int [][]arr=takeinput();
        display(arr);
        
    }
    public static int[][] takeinput(){
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        int [][] arr=new int [rows][];
        for(int row=0;row<rows;row++){
            System.out.println("Enter the no. of cols for row"+row);
            int cols=scn.nextInt();
            arr[row]=new int [cols];
            for(int col=0;col<cols;col++){
                System.out.println("enter the value for row"+ row +"and col" + col);
                arr[row][col]=scn.nextInt();
            }
          
        }
        return arr;
    }
    public static void display(int [][]arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    
}