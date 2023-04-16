import java.util.ArrayList;

public class Node {
    int value;
    ArrayList<Node> children;

    public Node(int value) {
        this.value = value;
        children = new ArrayList<Node>();
    }
}
