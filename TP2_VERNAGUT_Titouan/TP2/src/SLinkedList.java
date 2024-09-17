public class SLinkedList {
    Node head; 
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
        Node current = head;
        while (current != null) {
            System.out.print(current.getElement() + " , ");
            current = current.getNext();
        }
        System.out.println("_");
        
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
                previous = current;        
                current = next;            
            }

            
            head = previous;
        }

    	 public void swapNodes(Node x, Node y) {
    	       
    	        Node prevX = null, prevY = null, curr = head;

    	        
    	        while (curr != null && curr.getNext() != x) {
    	            prevX = curr;
    	            curr = curr.getNext();
    	        }

    	       
    	        curr = head;

    	        
    	        while (curr != null && curr.getNext() != y) {
    	            prevY = curr;
    	            curr = curr.getNext();
    	        }

    	        
    	        if (curr == null) return;

    	       
    	        if (x == head) {
    	            head = y;
    	        } else if (y == head) {
    	            head = x;
    	        }

    	       
    	        if (prevX != null) {
    	            prevX.setNext(y);
    	        }

    	        
    	        if (prevY != null) {
    	            prevY.setNext(x);
    	        }

    	        
    	        Node temp = x.getNext();
    	        x.setNext(y.getNext());
    	        y.setNext(temp);
    	    }
       
    public static void main(String[] args) {
    	SLinkedList list=new SLinkedList();
    	//Q1
    	list.add(4);
    	list.add(3);
    	list.add(2);
    	list.add(1);
    	//Q2
    	list.addBegin(5);
    	//Q3
    	list.toString(list); 
    	System.out.println(list.findSecondLastNode());
    	//Q4  
    	//list.reverse();
        list.printList();
        //Q5
        Node x = list.head.getNext(); // Node 2
        Node y = list.head.getNext().getNext().getNext(); // Node 4

      
        list.swapNodes(x, y);
        list.printList();
    }

	
}