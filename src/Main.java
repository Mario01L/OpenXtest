public class Main {
    public static void main(String[] args) {

        Node node2 = new Node(2);
        Node node7 = new Node(7);
        Node node5 = new Node(5);
        Node node2b = new Node(2);
        Node node6 = new Node(6);
        Node node5b = new Node(5);
        Node node11 = new Node(11);
        Node node5c = new Node(5);
        Node node9 = new Node(9);
        node2.children.add(node7);
        node2.children.add(node5);
        node7.children.add(node2b);
        node7.children.add(node6);
        node5.children.add(node5b);
        node5.children.add(node11);
        node6.children.add(node5c);
        node6.children.add(node9);
        Tree tree = new Tree(node2);

        // Test countLeafNodes()
        int leafCount = tree.countLeafNodes();
        System.out.println("Number of leaf nodes: " + leafCount);

        // Test maxPathLength()
        int maxPath = tree.maxPathLength();
        System.out.println("Largest number of edges in a path from root to leaf: " + maxPath);

        // Test isEqual()
        Node node2Copy = new Node(2);
        Node node7Copy = new Node(7);
        Node node5Copy = new Node(5);
        Node node2bCopy = new Node(2);
        Node node6Copy = new Node(6);
        Node node5bCopy = new Node(5);
        Node node11Copy = new Node(11);
        Node node5cCopy = new Node(5);
        Node node9Copy = new Node(9);
        node2Copy.children.add(node7Copy);
        node2Copy.children.add(node5Copy);
        node7Copy.children.add(node2bCopy);
        node7Copy.children.add(node6Copy);
        node5Copy.children.add(node5bCopy);
        node5Copy.children.add(node11Copy);
        node6Copy.children.add(node5cCopy);
        node6Copy.children.add(node9Copy);
        Tree treeCopy = new Tree(node2Copy);
        boolean equal = tree.isEqual(treeCopy);
        System.out.println("Tree is equal to copy: " + equal);
    }
}
