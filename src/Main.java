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



    public static void main(String[] args) {

        // vectorCalls();
        // linkedListCalls();
         doublyLinkedListCalls();

    }
}
