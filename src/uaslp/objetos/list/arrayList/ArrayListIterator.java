package uaslp.objetos.list.arrayList;

public class ArrayListIterator {
    private ArrayList arrayList;
    private int currentIndex = 0;
    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public boolean hasNext() {
        return currentIndex < arrayList.getSize();
    }
    public String next() {
        String current = arrayList.getAt(currentIndex);
        while (currentIndex < arrayList.getSize() && current.equals(null)) {
            current = arrayList.getAt(currentIndex);
            currentIndex++;
        }
        return current;
    }
}
