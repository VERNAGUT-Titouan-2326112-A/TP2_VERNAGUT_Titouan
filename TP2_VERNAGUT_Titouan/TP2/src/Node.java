
public class Node {
    private int element;
    private Node next = null;
   


    public Node(int s) {
        element = s;  
    }

    
    public int getElement() { 
    	return element;
    	}


    public Node getNext() { 
    	return next; 
    	}


    public void setElement(int newElem) { 
    	element = newElem; 
    	}

    public void setNext(Node newNext) {
    	next = newNext; 
    	}
    @Override
    public String toString() {
    	return String.valueOf(this.element);
    }
}
