public class Cell {

    private Object element;
    private Cell next;
    private Cell previous;


    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Cell(Object element, Cell next, Cell previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    public Object getElement() {
        return element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
        return previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }
}
