package uaslp.objetos.list.arrayList;

import uaslp.objetos.list.linkedList.LinkedListIterator;

public class ArrayList {
    private static final int INITIAL_SIZE = 2;
    private String []array;
    private int size;

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }
    public void addAtTail(String data){
        if(size == array.length){
            increaseSize();
        }
        array[size] = data;
        size++;
    }
    public void addAtFront(String data){
        if(size == array.length){
            increaseSize();
        }
        for(int index = size-1; index >= 1; index--){
            array[index] = array[index-1];
        }
        array[0] = data;
        size++;
    }
    public void remove(int index){
        if (index < 0 || index >= size) {
            return;
        }
        array[index] = null;
        size--;
    }
    public void removeAll(){
        for(int index = 0; index < array.length; index++){
            array[index] = null;
        }
        size = 0;
    }
    public void setAt(int index, String data){
        if (index < 0 || index >= size) {
            return;
        }
        array[index] = data;
    }
    public String getAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }else{
            return array[index];
        }
    }
    public void removeAllWithValue(String data){
        for(int index = 0; index < array.length; index++) {
            if (array[index].equals(data)) {
                array[index] = null;
            }
        }
    }
    public int getSize() {
        return size;
    }
    private void increaseSize(){
        String []newArray = new String[array.length + 2];

        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public ArrayListIterator getIterator(){
        return new ArrayListIterator(this);
    }
}
