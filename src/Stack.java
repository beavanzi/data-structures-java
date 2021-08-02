import java.util.LinkedList;

public class Stack {
    private LinkedList<String> strings = new LinkedList<String>();

    // to become more generalist we can replace String to Object
    public void push(String str) {
        strings.add(str);
    }

    public String pop() {
        return strings.remove(strings.size() - 1);
    }

    public boolean isEmpty() {
        return strings.isEmpty();
    }

    @Override
    public String toString() {
        return strings.toString();
    }
}
