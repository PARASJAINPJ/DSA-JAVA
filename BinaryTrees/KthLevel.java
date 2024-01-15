package BinaryTrees;

public class KthLevel {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        int k=3;
        Kthlevel(root,1,k);
    }
    public static void Kthlevel(node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        Kthlevel(root.left,level+1,k);
        Kthlevel(root.right, level+1, k);
    }
    
}
