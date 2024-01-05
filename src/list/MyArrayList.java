package list;

import java.util.Iterator;

public class MyArrayList <T extends Comparable<T>> implements  MyList <T>{
    private T[] values;
    private int index;
    private int size;
    private int capacity;


    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.index = 0;
        this.size = 0;
        this.capacity = 10;
        try{
            this.values = (T[]) new Comparable [capacity];
        } catch (ClassCastException t){
            t.printStackTrace();
        }

    }

    private void addCapacity(){
        T[] temp = (T[]) new Comparable [capacity+ capacity/2];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    @Override
    public void add(T element) {
        if(size == capacity){
            addCapacity();
        }
        values[size] = element;
        size++;
    }

    @Override
    public void delete(int index) {
        T[] temp = (T[]) new Comparable [capacity-1];
        System.arraycopy(values, 0, temp, 0, index);

        int amountElementsAfterIndex = temp.length - index - 1;
        System.arraycopy(values, index+1, temp, index, amountElementsAfterIndex);
        values = temp;
        size--;

    }

    @Override
    public void delete(T element) {
        for (int i = 0; i < values.length; i++) {
            T elem = values[i];
            if(elem.equals(element)){
                delete(i);
            }

        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return  new Iterator<T>() {
            @Override
            public boolean hasNext() {

                return index < values.length;
            }

            @Override
            public T next() {
                return values[index++];
            }
        };

    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]).append(", ");
        }
        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
