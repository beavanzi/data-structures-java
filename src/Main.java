public class Main {

    public static void vectorCalls() {
        Student first = new Student("John");
        Student second = new Student("Neil");
        Student fakeFirst = new Student("The Skiper");

        Vector vector = new Vector();
        vector.add(first);
        vector.add(second);
        vector.add(0, fakeFirst);
        System.out.println(vector);
        System.out.println(vector.contain(first));

        for (int i =0; i < 300; i++){
            Student foo = new Student("Foo");

            vector.add(foo);
        }

        System.out.println(vector);
        System.out.println(vector.length());
    }

    public static void linkedListCalls() {
        LinkedList list = new LinkedList();

        list.addAtBeginning("Mauricio");
        System.out.println(list);

        list.addAtBeginning("Paulo");
        System.out.println(list);

        list.addAtBeginning("Guilherme");
        System.out.println(list);

        list.addAtFinal("Bia");
        System.out.println(list);

        list.add(2, "Gabriel");
        System.out.println(list);

        Object obj = list.getByPosition(2);
        System.out.println(obj);

        System.out.println(list.contain("Bia"));

        list.remove(2);
        System.out.println(list);

    }

    public static void doublyLinkedListCalls() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addAtBeginning("Mauricio");
        System.out.println(list);

        list.addAtBeginning("Paulo");
        System.out.println(list);

        list.addAtBeginning("Guilherme");
        System.out.println(list);

        list.addAtFinal("Bia");
        System.out.println(list);

        list.add(2, "Gabriel");
        System.out.println(list);

        Object obj = list.getByPosition(2);
        System.out.println(obj);

        System.out.println(list.contain("Bia"));

        list.removeAtFinal();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }

    public static void stackCalls() {
        Stack stack = new Stack();

        stack.push("Mauricio");
        System.out.println(stack.toString());

        stack.push("Guilherme");
        System.out.println(stack.toString());

        String first = stack.pop();
        System.out.println(first);

        String second = stack.pop();
        System.out.println(second);

        System.out.println(stack.toString());
        System.out.println(stack.isEmpty());
    }


    public static void queueCalls() {
        Queue queue = new Queue();

        queue.enqueue("Mauricio");
        System.out.println(queue.toString());

        queue.enqueue("Guilherme");
        System.out.println(queue.toString());

        String first = queue.dequeue();
        System.out.println(first);

        String second = queue.dequeue();
        System.out.println(second);

        System.out.println(queue.toString());
        System.out.println(queue.isEmpty());
    }


    public static void main(String[] args) {

        // vectorCalls();
        // linkedListCalls();
        // doublyLinkedListCalls();
        // stackCalls();
        queueCalls();

    }
}
