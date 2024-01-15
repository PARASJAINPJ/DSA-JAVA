package BinaryTrees;
public class SubtreeofAnothertree {
    static class node{
         int data;
         node left;
         node right;
         
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
       
       node subroot=new node(2  );
       subroot.left=new node(4);
       subroot.right=new node(5);
       System.out.println(isSubtree(root,subroot));
    }
    public static boolean isSubtree(node root,node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean leftans=isSubtree(root.left,subroot);
        boolean rightans=isSubtree(root.right,subroot);

        return leftans||rightans;
    }
    public static boolean isIdentical(node root,node subroot){
        if(root==null && subroot==null){
            return true;
        }
        else if(root==null||subroot==null||root.data!=subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    
}
