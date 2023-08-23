package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        String value = "";
        List<String> outputTree = new ArrayList<>();

        return getTreePath(root, value, outputTree);

    }

    public static List<String> getTreePath(TreeNode root, String value, List<String> outputTree){
        if (root == null)
            return outputTree;

        if (root.left == null && root.right == null) {
            outputTree.add(value + root.val);
            return outputTree;
        }

        value += root.val + "->";
        getTreePath(root.left, value, outputTree);
        getTreePath(root.right, value, outputTree);

        return outputTree;
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);

        System.out.println(binaryTreePaths(treeNode));
    }
}
