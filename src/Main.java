import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void vectorCalls() {
        Student first = new Student("John");
        Student second = new Student("Neil");
        Student fakeFirst = new Student("The Skiper");

        Vector vector = new Vector();
        vector.add(first);
        vector.add(second);
        vector.add(0, fakeFirst);
        System.out.println("After adds: " + vector);
        System.out.println("Contains John: " + vector.contain(first));

        for (int i =0; i < 300; i++){
            Student foo = new Student("Foo");

            vector.add(foo);
        }

        System.out.println("After adds 'Foo' 300 times: " + vector);
        System.out.println("Length: " + vector.length());
    }

    public static void linkedListCalls() {
        LinkedList list = new LinkedList();

        list.addAtBeginning("Mathews");
        System.out.println("After add at beginning: "  + list);

        list.addAtBeginning("Paul");
        System.out.println("After add at beginning: "  + list);

        list.addAtBeginning("William");
        System.out.println("After add at beginning: "  + list);

        list.addAtFinal("Bia");
        System.out.println("After add at final: "  + list);

        list.add(2, "Gabriel");
        System.out.println("After add at middle: "  + list);

        Object obj = list.getByPosition(2);
        System.out.println("Get on position 2: " + obj);

        System.out.println("Contains 'Bia':" + list.contain("Bia"));

        list.remove(2);
        System.out.println("After remove element 2: " + list);

    }

    public static void doublyLinkedListCalls() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addAtBeginning("Mathews");
        System.out.println("After add at beginning: "  + list);

        list.addAtBeginning("Paul");
        System.out.println("After add at beginning: "  + list);

        list.addAtBeginning("William");
        System.out.println("After add at beginning: "  + list);

        list.addAtFinal("Bia");
        System.out.println("After add at final: "  + list);

        list.add(2, "Gabriel");
        System.out.println("After add at middle: "  + list);

        Object obj = list.getByPosition(2);
        System.out.println("Get on position 2: " + obj);

        System.out.println("Contains 'Bia':" + list.contain("Bia"));

        list.removeAtFinal();
        System.out.println("After remove at final: " + list);

        list.remove(2);
        System.out.println("After remove element 2: " + list);

    }

    public static void stackCalls() {
        Stack stack = new Stack();

        stack.push("Mathews");
        System.out.println("After push: " + stack.toString());

        stack.push("William");
        System.out.println("After push: " + stack.toString());

        String first = stack.pop();
        System.out.println("Popped element: " + first);

        String second = stack.pop();
        System.out.println("Popped element: " + second);

        System.out.println("After pop: " + stack.toString());
        System.out.println("isEmpty: " + stack.isEmpty());
    }


    public static void queueCalls() {
        Queue queue = new Queue();

        queue.enqueue("Mathews");
        System.out.println("After enqueue: " + queue.toString());

        queue.enqueue("William");
        System.out.println("After enqueue: " + queue.toString());

        String first = queue.dequeue();
        System.out.println("Dequeued element: " +first);

        String second = queue.dequeue();
        System.out.println("Dequeued element: " +second);

        System.out.println("After dequeue: " + queue.toString());
        System.out.println("isEmpty: " + queue.isEmpty());
    }

    public static void setCalls() {
        Set set = new Set();

        set.add("Mathews");
        System.out.println("After add: " + set);

        set.add("Mathews");
        System.out.println("After add: " + set);

        set.add("Marcelo");
        System.out.println("After add: " + set);

        set.add("William");
        System.out.println("After add: " + set);

        set.remove("Mathews");
        System.out.println("After remove 'Mathews': " + set);

    }

    public static void listOptions() {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("Which do you want to test?");
            System.out.println("[1] Vector");
            System.out.println("[2] Linked List");
            System.out.println("[3] Doubly Linked List");
            System.out.println("[4] Stack");
            System.out.println("[5] Queue");
            System.out.println("[6] Set");
            System.out.println("[another integer] Quit");

            option = scan.nextInt();

            switch (option){
                case 1:
                    vectorCalls();
                    break;
                case 2:
                    linkedListCalls();
                    break;
                case 3:
                    doublyLinkedListCalls();
                    break;
                case 4:
                    stackCalls();
                    break;
                case 5:
                    queueCalls();
                    break;
                case 6:
                    setCalls();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        } while (option > 0 && option < 7);
    }


    public static void main(String[] args) {
        listOptions();
    }
}
