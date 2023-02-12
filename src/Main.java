import uaslp.objetos.list.arrayList.ArrayList;
import uaslp.objetos.list.linkedList.LinkedList;
import uaslp.objetos.list.linkedList.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.addAtTail("4");
        lista.addAtFront("2");
        lista.addAtFront("1");
        lista.addAtTail("5");
        System.out.println(lista.getSize());
        lista.setAt(2, "12");
        lista.remove(1);
        System.out.println(lista.getAt(2));
        lista.removeAllWithValue("2");
    }
}