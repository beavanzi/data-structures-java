public class LinkedList {
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
        Cell newCell = createCell(element, first);
        first = newCell;

        if (isListEmpty()) last = first;

        totalOfElements++;
    };

    public void addAtFinal(Object element){
        if (isListEmpty()) {
            addAtBeginning(element);
        } else {
            Cell newCell = createCell(element, null);
            last.setNext(newCell);
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
            Cell newCell = createCell(element, previous.getNext());
            previous.setNext(newCell);
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

    public void remove(int position) {
        if (hasLessThanTwo()) {
            removeAtBeginning();
        } else {
            Cell previous = getCellByPosition(position - 1);
            Cell current = previous.getNext();

            previous.setNext(current.getNext());
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
