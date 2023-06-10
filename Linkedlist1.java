import java.util.*;
public class Linked_list15 {
    public static void main(String[] args) {
        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        String x = c1.peekFirst();
        String y = c1.peekLast();
        System.out.println("First element in the list: " + x);
        System.out.println("Last element in the list: " + y);
        System.out.println("Original linked list: " + c1);
    }
}