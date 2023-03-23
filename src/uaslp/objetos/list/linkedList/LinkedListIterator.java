package uaslp.objetos.list.linkedList;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
    private Node currentNode;
    LinkedListIterator(Node head){
        currentNode = head;
    }
    public boolean hasNext(){
        return currentNode != null;
    }
    public String next(){
        String data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
