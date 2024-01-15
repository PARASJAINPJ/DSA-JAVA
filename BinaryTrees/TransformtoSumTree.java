package BinaryTrees;

public class TransformtoSumTree {
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

        transform(root);
        preorder(root);

    }
    public static int transform(node root){
        if(root==null){
            return 0;
        }
        int leftchild=transform(root.left);
        int rightchild=transform(root.right);

        int data=root.data;

        int newleft=root.left == null ? 0 :root.left.data;
        int newright=root.right == null ? 0 :root.right.data;
        root.data=newleft+leftchild+newright    +rightchild;
        return data;

    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    
}
