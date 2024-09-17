public class DLinkedList {
    private DNode head;  
    private DNode tail;
	private Object size;  

  
    public DLinkedList() {
        head = null;
        tail = null;
    }

  
    public void insertFirst(int element) {
        DNode newNode = new DNode(element, head, tail);
        if (head != null) {
            head.setPrev(newNode);
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

   
    public void swapNodes(DNode x, DNode y) {
       
        if (x == y) return;

        
        DNode prevX = x.getPrev();
        DNode nextX = x.getNext();
        DNode prevY = y.getPrev();
        DNode nextY = y.getNext();

        
        if (x == head) {
            head = y;
        } else if (y == head) {
            head = x;
        }

       
        if (x == tail) {
            tail = y;
        } else if (y == tail) {
            tail = x;
        }

       
        if (prevX != null) {
            prevX.setNext(y);
        }
        if (prevY != null) {
            prevY.setNext(x);
        }

        
        if (nextX != null) {
            nextX.setPrev(y);
        }
        if (nextY != null) {
            nextY.setPrev(x);
        }

        
        x.setPrev(prevY);
        x.setNext(nextY);
        y.setPrev(prevX);
        y.setNext(nextX);
    }

    public int nbNoeuds() {
        // Si la liste est vide (head est null), retourner 0
        if (head == null) {
            return 0;
        }

        int count = 1;  // Initialiser le compteur à 1 pour le premier nœud
        DNode current = head;

        // Parcourir la liste jusqu'à revenir à 'head'
        while (current.getNext() != null && current.getNext() != head) {
            count++;
            current = current.getNext();
        }

        return count;
    }
    public void printList() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.getElement() + " , ");
            current = current.getNext();
        }
       
    }
    public void toString(DLinkedList liste) {
        DNode nodeProvisoire = head;  
        
     
        if (nodeProvisoire == null) {
            System.out.println("La liste est vide");
            return;
        }

       
        String affichage = head.toString();
        
  
        while (nodeProvisoire.getNext() != null) {
            nodeProvisoire = nodeProvisoire.getNext();
            affichage = affichage + ", " + nodeProvisoire.getElement();  
        }
        
       
        System.out.println(affichage + '\n');
    }
    @Override
    public boolean equals(Object obj) {
       
        if (this == obj) {
            return true;
        }

        
        if (!(obj instanceof DLinkedList)) {
            return false;
        }

       
        DLinkedList otherList = (DLinkedList) obj;

    
        if (this.size != otherList.size) {
            return false;
        }

        
        DNode currentThis = this.head;
        DNode currentOther = otherList.head;

        
        while (currentThis != null) {
            
            if (!(currentThis.getElement()==(currentOther.getElement()))) {
                return false;
            }
            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();
        }

    
        return true;
    }

        public static void main(String[] args) {
            DLinkedList list = new DLinkedList();

            
            
            list.insertFirst(2);
            list.insertFirst(1);

            list.toString(list); 
            System.out.print(list.nbNoeuds());
            DLinkedList list2 = new DLinkedList();
            list2.insertFirst(2);
            list2.insertFirst(1);

            list2.equals(list2);
          
        }
    

}
