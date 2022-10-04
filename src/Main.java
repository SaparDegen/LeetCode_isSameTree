public class Main {
    public static void main(String[] args) {
        TreeNode node1Left = new TreeNode(2);
        TreeNode node1Right = new TreeNode(3);
        TreeNode node1 = new TreeNode(1, node1Left, node1Right);

        TreeNode node2Left = new TreeNode(2);
        TreeNode node2Right = new TreeNode(3);
        TreeNode node2 = new TreeNode(1, node2Left, node2Right);

        System.out.println(isSameTree(node1, node2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        if (p.val == q.val) {
            boolean a1 = isSameTree(p.left, q.left);
            boolean a2 = isSameTree(p.right, q.right);
            return a1 && a2;
        }
        return false;
    }
}