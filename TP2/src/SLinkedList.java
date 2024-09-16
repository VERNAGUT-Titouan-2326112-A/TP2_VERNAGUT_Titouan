public class SLinkedList {
    private Node head; 
    private long size;  

    public SLinkedList() {
        head = null;
        size = 0;
    }

    public void add(int element) {
    	
            Node newNode = new Node(element);
            if (head == null) {
                head = newNode;
            } else {
                Node valeurActuelle = head;
                while(valeurActuelle.getNext() != null) {
                    valeurActuelle = valeurActuelle.getNext();
                }
                valeurActuelle.setNext(newNode);
            }
        }
    

    
    public void printList(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.println(currentNode.getElement());
        printList(currentNode.getNext());
    }

    public void printList() {
        printList(head);
    }

    public boolean updateElement(int oldValue, int newValue) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement() == oldValue) {
                currentNode.setElement(newValue);
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("La liste est vide.");
        }
        int removedElement = head.getElement();
        head = head.getNext();
        size--;
        return removedElement;
    }

    public void toString(SLinkedList liste) {
        Node nodeProvisoire = head;       
        String affichage = head.toString();
        while (nodeProvisoire.getNext() != null) {
            nodeProvisoire = nodeProvisoire.getNext();
            affichage = affichage + ", "+ nodeProvisoire;
        }
        System.out.println(affichage + '\n');
    }

    public void addBegin(int element) {
    	Node newHead = new Node(element); 
    	newHead.setNext(head);
        this.head = newHead; 
        this.size++;
    }
    
    public long getSize() {
        return size;
    }
  
    	public Node findSecondLastNode() {
            if (head == null ) {
                return null;
            }        
            else if (head.getNext() == null) {
            	return null;
            }
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            return current; 
        }
    
    	 public void reverse() {
    	        Node previous = null; 
    	        Node current = head; 
    	        Node next = null; 

    	        while (current != null) {
    	            next = current.getNext(); 
    	            current.setNext(previous);
    	            current = next; 
    	        }

    	        head = previous;
    	 }
    	 public void printList2() {
    	        Node current = head;
    	        while (current != null) {
    	            System.out.print(current.getElement() + " , ");
    	            current = current.getNext();
    	        }
    	      
    	    }
    public static void main(String[] args) {
    	SLinkedList list=new SLinkedList();
    	//Q1
    	list.add(10);
    	list.add(7);
    	//Q2
    	list.addBegin(5);
    	//Q3
    	list.toString(list); 
    	System.out.println(list.findSecondLastNode());
    	//Q4 ne marche pas 
    	list.reverse();
    	list.printList2();    	
    }
}