//given a route containing 4 directions(e,w,n,s)find the shortest path to reach the destination "WNEENESENNN"
//THIS IS A QUESTION FROM ALPHA BATCH OF APNA COLLEGE VIDEOS
public class shortestpath {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestpath(path));
    }
    public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S') y--;
            else if(dir=='N') y++;
            else if(dir=='W')x--;
            else if(dir=='E') x++;
            
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2 + y2);
    }
}
