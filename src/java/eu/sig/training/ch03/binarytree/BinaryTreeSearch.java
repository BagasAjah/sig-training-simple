package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        }
        if (nodeValue < node.getValue() && node.getLeft() != null) {
            BinaryTreeNode<Integer> left = node.getLeft();
            return 1 + calculateDepth(left, nodeValue);
        }
        if (nodeValue >= node.getValue() && node.getRight() != null) {
            BinaryTreeNode<Integer> right = node.getRight();
            return 1 + calculateDepth(right, nodeValue);
        }
        throw new TreeException("Value not found in tree!");
    }

}