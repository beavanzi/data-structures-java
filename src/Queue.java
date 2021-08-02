import java.util.LinkedList;

public class Queue {
    LinkedList<String> queue = new LinkedList<String>();

    public void enqueue(String str) {
        queue.addLast(str);
    }

    public String dequeue() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

}
