import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    /*
     * parameterized constructer: once parameterized constructor is formed the
     * default Constructor is not present now.
     */
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Input {
    static int idx = -1;

    public static Node buildTree(int[] input) {
        idx++;
        if (input[idx] == -1) {
            return null;
        }
        Node newNode = new Node(input[idx]);
        newNode.left = buildTree(input);
        newNode.right = buildTree(input);

        return newNode;
    }
}

public class LevelOrderTraverse {
    public static void main(String[] args) {
        // int input[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int input[] = { 2 };
        int input[] = { 1, 2, 3, 4, };
        Node root = Input.buildTree(input);
        // printing tree by level order
        levelOrder(root);
    }

    private static void levelOrder(Node root) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);

        while (!qu.isEmpty()) {
            Node node = qu.remove();
            if (node == null) {
                if (qu.isEmpty())
                    break;
                System.out.println();
                qu.add(null);
            } else {
                System.out.print(node.data + " ");
                if (node.left != null)
                    qu.add(node.left);
                if (node.right != null)
                    qu.add(node.right);

            }
        }
    }
}