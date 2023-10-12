//count paths in a maze to move from (0,0) to (n,m)
package recursion;

public class countpaths {
    public static int count(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwaerds
        int downpaths=count(i+1,j,n,m);
        //move right
        int rightpaths=count(i,j+1,n,m);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(count(0,0,n,m));
    }
    
}
