package myLinkedList;


import java.util.Iterator;

public class LinkedList<T> implements LinkList<T>, Iterable<T>{

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedList(){
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);
    }

    //text
    @Override
    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(t);
        lastNode = new Node<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(T t) {
        Node<T> next = firstNode;
        next.setCurrentElement(t);
        firstNode = new Node<T>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        Node<T> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<T> getNextElement(Node<T> current){
        return  current.getNextElement();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                return getElementByIndex(counter++);
            }
        };
    }

    private class Node<T>{
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

        private Node(T currentElement, Node<T> prevElement, Node<T> nextElement){
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
        public T getCurrentElement(){
            return currentElement;
        }
        public void setCurrentElement(T currentElement){
        this.currentElement = currentElement;
        }
        public Node<T> getNextElement(){
            return nextElement;
        }
        public void setNextElement (Node<T> nextElement){
            this.nextElement = nextElement;
        }
        public Node<T> getPrevElement(){
            return prevElement;
        }
        public void setPrevElement(Node<T> prevElement){
            this.prevElement = prevElement;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "firstNode=" + firstNode +
                ", lastNode=" + lastNode +
                ", size=" + size +
                '}';
    }
}
