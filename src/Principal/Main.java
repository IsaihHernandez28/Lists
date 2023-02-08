package Principal;

import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtTail("Hello");
        list.addAtTail("World");
        list.adAtFront("Hi");

        System.out.println("Size: " + list.getSize());
        System.out.println("Get at index 0: " + list.getAt(0));
        System.out.println("Get at index 1: " + list.getAt(1));
        System.out.println("Get at index 2: " + list.getAt(2));

        LinkedListIterator iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Data: " + iterator.next());
        }

        list.removeAllWithValue("Hi");
        System.out.println("Size after removing all nodes with value 'Hi': " + list.getSize());
    }
}