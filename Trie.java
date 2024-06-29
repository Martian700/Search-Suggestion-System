import java.util.Vector;

public class Trie {
    Node root;

    Trie(Node root) {
        this.root = root;
    }

    public Node Search(String str) {
        if (str.length() == 0) {
            return root;
        }
        char curr = str.charAt(0);
        Node trav = getChild(root, curr);
        if (trav == null) {
            return null;
        }
        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            trav = getChild(trav, curr);
            if (trav == null) {
                return null;
            }
        }
        return trav;
    }

    private Vector<String> allStrings(Node node) {
        Vector<String> res = new Vector<>();
        char c = node.data;
        Vector<String> temp = new Vector<>();
        if (node.children.size() == 0) {
            res.add(c + "");
            return res;
        }
        for (Node i : node.children) {
            temp = allStrings(i);
            for (String j : temp) {
                res.add(c + j);
            }
        }
        return res;
    }

    public Vector<String> Suggestions(String str) {
        Vector<String> res = new Vector<>();
        if (str.length() == 0) {
            for (Node i : root.children) {
                res.addAll(allStrings(i));
            }
            return res;
        }
        Node end = Search(str);
        if (end == null) {
            return res;
        } else {
            for (Node i : end.children) {
                Vector<String> temp = allStrings(i);
                for (String j : temp) {
                    res.add(str + j);
                }
            }
            return res;
        }
    }

    public Node getChild(Node node, char c) {
        for (Node i : node.children) {
            if (i.data == c) {
                return i;
            }
        }
        return null;
    }
}
