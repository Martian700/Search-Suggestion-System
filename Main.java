// import java.util.*;

public class Main {

    public static void main(String[] args) {
        Node root = new Node('0');
        Node l11 = new Node('a');
        root.children.add(l11);
        Node l12 = new Node('d');
        l11.children.add(l12);
        Node l13 = new Node('w');
        l12.children.add(l13);
        Node l14 = new Node('a');
        l13.children.add(l14);
        Node l15 = new Node('i');
        l14.children.add(l15);
        Node l16 = new Node('t');
        l15.children.add(l16);
        Node l17 = new Node('h');
        l16.children.add(l17);
        Node l21 = new Node('m');
        root.children.add(l21);
        Node l22 = new Node('o');
        l21.children.add(l22);
        Node l23 = new Node('u');
        l22.children.add(l23);
        Node l23_11 = new Node('s');
        l23.children.add(l23_11);
        Node l23_12 = new Node('e');
        l23_11.children.add(l23_12);
        Node l23_21 = new Node('n');
        l23.children.add(l23_21);
        Node l23_22 = new Node('t');
        l23_21.children.add(l23_22);
        Node l23_23 = new Node('a');
        l23_22.children.add(l23_23);
        Node l23_24 = new Node('i');
        l23_23.children.add(l23_24);
        Node l23_25 = new Node('n');
        l23_24.children.add(l23_25);
        Trie t = new Trie(root);
        System.out.println(t.Suggestions(""));
    }
}
