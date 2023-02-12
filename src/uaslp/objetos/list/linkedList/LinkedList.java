package uaslp.objetos.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public void addAtTail(String data){
        Node node = new Node();

        node.data = data;

        if(head == null){
            head = node;
        }else{
            node.previous = tail;
            tail.next = node;
        }
        tail = node;
        size++;
    }
    public void adAtFront(String data){
        Node node = new Node();

        node.data = data;
        node.next = head;

        if(tail == null){
            tail = node;
        }else {
            tail.previous = node;
        }
        size++;
    }
    public void remove(int index){
        if (index < 0 || index >= size) {
            return;
        }
        Node currentNode = head;
        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            currentNode = currentNode.next;
        }
        if (currentNode.previous != null) {
            currentNode.previous.next = currentNode.next;
        }
        if (currentNode.next != null) {
            currentNode.next.previous = currentNode.previous;
        }
        if (index == 0) {
            head = currentNode.next;
        }
        if (index == size - 1) {
            tail = currentNode.previous;
        }
        size--;
    }
    public void removeAll(){
        head = null;
        tail = null;
        size = 0;
    }
    public void setAt(int index, String data){
        if (index < 0 || index >= size) {
            return;
        }
        Node currentNode = head;
        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }
    public String getAt(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node currentNode = head;
        for(int currentIndex = 0; currentIndex < index; currentIndex++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public void removeAllWithValue(String data){
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            if (currentNode.data.equals(data)) {
                if (currentNode.previous != null) {
                    currentNode.previous.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }

                if (currentNode.next != null) {
                    currentNode.next.previous = currentNode.previous;
                } else {
                    tail = currentNode.previous;
                }

                size--;
            }
            currentNode = nextNode;
        }
    }
    public int getSize() {
        return size;
    }
    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }
}
