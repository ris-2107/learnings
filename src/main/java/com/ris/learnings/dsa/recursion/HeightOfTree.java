package com.ris.learnings.dsa.recursion;

import java.util.Objects;

public class HeightOfTree {
    public static void main(String[] args) {
        Node root = new Node(null, null, 5);
        root.left = new Node(null, null, 3);
        root.right = new Node(null, null, 8);

        root.left.left = new Node(null, null, 1);
        root.left.right = new Node(null, null, 4);
        root.right.left = new Node(null, null, 6);
        root.right.right = new Node(null, null, 10);

        System.out.println(ht(root));
    }

    private static int ht(Node root) {
        // base case:
        if (Objects.isNull(root)) {
            return 0;
        }
        int rHeight = ht(root.right);
        int lHeight = ht(root.left);
        return 1 + (Math.max(rHeight, lHeight));
    }

    private static class Node {
        int val;
        Node left;
        Node right;

        Node(Node left, Node right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }
}
