import java.util.*;

public class Node {
    char data;
    Vector<Node> children = new Vector<>();

    Node(char a) {
        this.data = a;
    }

    Node(char a, Vector<Node> node) {
        this.data = a;
        this.children = node;
    }
}
