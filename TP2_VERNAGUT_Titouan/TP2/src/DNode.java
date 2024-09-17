public class DNode {
    private int element;
    private DNode prev; // Pointeur vers le nœud précédent
    private DNode next; // Pointeur vers le nœud suivant

    public DNode(int element, DNode prev, DNode next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public int getElement() {
        return element;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
    @Override
    public String toString() {
    	return String.valueOf(this.element);
    }
}
