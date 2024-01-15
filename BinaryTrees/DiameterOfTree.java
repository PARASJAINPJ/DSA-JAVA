package BinaryTrees;

public class DiameterOfTree {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(node root){//O(N^2)
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int rightDiam=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfDiameter=lh+rh+1;
        return Math.max(selfDiameter,Math.max(leftDiam,rightDiam));
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        System.out.println("height = " +height(root));
        System.out.println("diameter = "+diameter(root));
    }
}
