public class BinaryTreeTraversal {
  public static void main(String[] args) {
    // set up binary tree
    TreeNode root = new TreeNode(4);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    root.left = node2;
    node2.left = node1;
    node2.right = node3;
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);
    root.right = node6;
    node6.left = node5;
    node6.right = node7;

    System.out.println("In Order traversal");
    inOrderTraversal(root);
    System.out.println("Pre order traversal");
    preOrderTraversal(root);
    System.out.println("Post order traversal");
    postOrderTraversal(root);
  }

  static class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  static void inOrderTraversal(TreeNode node) {
    if (node != null) {
      inOrderTraversal(node.left);
      System.out.println(node.data);
      inOrderTraversal(node.right);
    }
  }

  static void preOrderTraversal(TreeNode node) {
    if (node != null) {
      System.out.println(node.data);
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
    }
  }

  static void postOrderTraversal(TreeNode node) {
    if (node != null) {
      postOrderTraversal(node.left);
      postOrderTraversal(node.right);
      System.out.println(node.data);
    }
  }
}
