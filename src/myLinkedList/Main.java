package myLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> in = new LinkedList<>();
        in.addLast(1);
        in.addFirst(3);
        in.addLast(5);
        in.addFirst(7);


        System.out.println(in.getElementByIndex(0));
        System.out.println(in.getElementByIndex(1));
        System.out.println(in.getElementByIndex(2));
        System.out.println(in.getElementByIndex(3));
        System.out.println("Размер списка равен: " +in.size());

        System.out.println("________________________________");

        LinkedList<String> st = new LinkedList<>();
        st.addFirst("a");
        st.addLast("b");
        st.addLast("c");
        st.addFirst("d");
        st.addLast("e");

        System.out.println(st.getElementByIndex(0));
        System.out.println(st.getElementByIndex(1));
        System.out.println(st.getElementByIndex(2));
        System.out.println(st.getElementByIndex(3));
        System.out.println(st.getElementByIndex(4));
        System.out.println("Размер списка равен: " +st.size());
    }
}
