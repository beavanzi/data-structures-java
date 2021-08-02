public class DoublyLinkedList {
    private Cell first = null;
    private int totalOfElements = 0;
    private Cell last = null;

    private boolean isListEmpty() {
        return totalOfElements == 0;
    }

    private Cell createCell(Object element, Cell next){
        Cell newCell = new Cell(element, next);
        return newCell;
    }

    private boolean occupied(int position) {
        return position >= 0 && position < totalOfElements;
    }

    private Cell getCellByPosition(int position) {
        if(!occupied(position)){
            throw new IllegalArgumentException("Invalid position!");
        }

        Cell current = first;

        for(int i = 0; i < position; i++){
            current = current.getNext();
        }

        return current;
    };

    public void addAtBeginning(Object element){
        if (isListEmpty()) {
            Cell newCell = createCell(element, null);
            first = newCell;
            last = newCell;
        } else {
            Cell newCell = createCell(element, first);
            first.setPrevious(newCell);
            first = newCell;
        }

        totalOfElements++;
    };

    public void addAtFinal(Object element){
        if (isListEmpty()) {
            addAtBeginning(element);
        } else {
            Cell newCell = createCell(element, null);
            last.setNext(newCell);
            newCell.setPrevious(last);
            last = newCell;

            totalOfElements++;
        }
    };

    public void add(int position, Object element){
        if (isListEmpty()){
            addAtBeginning(element);
        } else if (position == totalOfElements){
            addAtFinal(element);
        } else {
            Cell previous = getCellByPosition(position - 1);
            Cell next = previous.getNext();

            Cell newCell = createCell(element, next);
            newCell.setPrevious(previous);
            previous.setNext(newCell);
            next.setPrevious(newCell);

            totalOfElements++;
        }
    };

    public Object getByPosition(int position) {
        return getCellByPosition(position).getElement();
    };

    public void removeAtBeginning() {
        if (isListEmpty()) {
            throw new IllegalArgumentException("List is already empty!");
        }

        first = first.getNext();
        totalOfElements--;

        if (isListEmpty()) last = null;

    };

    private boolean hasLessThanTwo(){
        return totalOfElements <= 1;
    }


    public void removeAtFinal() {
        if (hasLessThanTwo()) {
            removeAtBeginning();
        } else {
            Cell secondLast = last.getPrevious();
            secondLast.setNext(null);
            last = secondLast;
            totalOfElements--;
        }
    };

    private boolean isBegin(int position) {
        return position == 0;
    }

    private boolean isFinal(int position) {
        return position == totalOfElements - 1;
    }

    public void remove(int position) {
        if (isBegin(position)) {
            removeAtBeginning();
        } else if (isFinal(position)){
            removeAtFinal();
        } else {
            Cell previous = getCellByPosition(position - 1);
            Cell current = previous.getNext();
            Cell next = current.getNext();

            previous.setNext(next);
            next.setPrevious(previous);
            totalOfElements--;
        }
    };

    public int length() { return this.totalOfElements; };

    public boolean contain(Object o) {
        Cell current = first;

        for(int i = 0; i < totalOfElements; i++){
            if (current.getElement() == o) return true;
            current = current.getNext();
        }

        return false;
    };

    @Override
    public String toString() {
        if(isListEmpty()){
            return "[]";
        }

        Cell current = first;

        StringBuilder builder = new StringBuilder("[");

        for (int i=0; i< totalOfElements; i++) {
            builder.append(current.getElement());
            builder.append(", ");

            current = current.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}
