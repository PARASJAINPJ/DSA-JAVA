
package BinaryTrees;

import java.util.*;

public class TopViewOfTree {
    static class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

        static class info {
            node nod;
            int hd;

            info(node nod, int hd) {
                this.nod = nod;
                this.hd = hd;
            }
        }

        public static void topview(node root) {
            // level order
            Queue<info> q = new LinkedList<>();
            HashMap<Integer, node> map = new HashMap<>();
            int min = 0, max = 0;
            q.add(new info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.nod);
                    }
                    if (curr.nod.left != null) {
                        q.add(new info(curr.nod.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.nod.right != null) {
                        q.add(new info(curr.nod.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.right = new node(4);
        root.left.right.right = new node(5);
        root.left.right.right.right = new node(6);

        node.topview(root);
    }
}
 
