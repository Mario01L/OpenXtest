public class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public int countLeafNodes() {
        return countLeafNodesHelper(root);
    }

    private int countLeafNodesHelper(Node node) {
        if (node.children.size() == 0) {
            return 1;
        }
        int count = 0;
        for (Node child : node.children) {
            count += countLeafNodesHelper(child);
        }
        return count;
    }

    public int maxPathLength() {
        return maxPathLengthHelper(root);
    }

    private int maxPathLengthHelper(Node node) {
        if (node.children.size() == 0) {
            return 0;
        }
        int maxPath = 0;
        for (Node child : node.children) {
            int childPath = maxPathLengthHelper(child);
            if (childPath > maxPath) {
                maxPath = childPath;
            }
        }
        return maxPath + 1;
    }

    public boolean isEqual(Tree other) {
        return isEqualHelper(root, other.root);
    }

    private boolean isEqualHelper(Node node1, Node node2) {
        if (node1.value != node2.value || node1.children.size() != node2.children.size()) {
            return false;
        }
        for (int i = 0; i < node1.children.size(); i++) {
            if (!isEqualHelper(node1.children.get(i), node2.children.get(i))) {
                return false;
            }
        }
        return true;
    }
}