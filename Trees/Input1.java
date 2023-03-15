import java.util.Queue;
import java.util.LinkedList;

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

public class Input1 {
    public static void main(String[] args) {
        int input[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Input.buildTree(input);
        System.out.println("Getting the Op " + root.data);
        // showTree(root);
        printLevelOrder(root);
    }

    public static void showTree(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            showTree(root.left);
        }
        System.out.println(root.data);

        if (root.right != null) {
            showTree(root.right);
        }

    }

    private static void levelOrder(Node root) {
        Queue<Node> qu = new LinkedList<>();
        if (root == null) {
            System.out.println("Empty");
        }
        qu.add(root);
        while (!qu.isEmpty()) {
            System.out.print(qu.remove().data);
            if (qu.isEmpty()) {
                qu = new LinkedList<>();
                qu.add(root.left);
                qu.add(root.right);
            }
        }
    }

    static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.remove();
            System.out.print(tempNode.data + " ");

            /* Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /* Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}