package com.ris.practise.Rough;

import java.util.ArrayList;
import java.util.List;

public class BPlusTree {
    private static final int ORDER = 1;

    abstract static class Node {
        List<Integer> keys = new ArrayList<>();
        Node Parent;

        abstract boolean isLeaf();

    }

    static class internalNode extends Node {
        List<Node> children = new ArrayList<>();

        @Override
        boolean isLeaf() {
            return false;
        }

    }

    static class LeafNode extends Node {
        List<Integer> values = new ArrayList<>();
        LeafNode next;

        @Override
        boolean isLeaf() {
            return true;
        }
    }

    private Node root;

    public BPlusTree() {
        root = new LeafNode();
    }

    public void insert(int key){
        LeafNode leafNode = new LeafNode();
    }
}
