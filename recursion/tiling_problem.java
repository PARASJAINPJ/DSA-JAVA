//given a "2 X n"board and tiles of size(2 X 1),cout the number of ways to tile the givem board using 2 X 1 tiles.
//(a tile can either be placed horizintally or vertically )
package recursion;

public class tiling_problem {
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //horizontal choice
        int horizontaltiles=tilingproblem(n-1);
        //vertical choice
        int verticallines=tilingproblem(n-2);
        int totways=verticallines + horizontaltiles;
        return totways;
    }
    
}
