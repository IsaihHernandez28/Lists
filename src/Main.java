import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.arrayList.*;
import uaslp.objetos.list.linkedList.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new LinkedList();
        Iterator iterator = list.getIterator();
        Iterator iterator2 = list2.getIterator();

        list.addAtFront("2");
        list.addAtTail("5");

        list2.addAtFront("3");
        list2.addAtFront("21");
        list2.addAtTail("2");

        while(iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
        }
        while(iterator2.hasNext()){
            String data = iterator2.next();
            System.out.println(data);
        }
    }
}