package myLinkedList;

public interface LinkList <T>{
    void addLast(T t);
    void addFirst(T t);
    int size();
    T getElementByIndex(int counter);
}
