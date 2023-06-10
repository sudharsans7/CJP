import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        
        String head = queue.poll();
        System.out.println("Head: " + head);
        
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);
        
        boolean containsCharlie = queue.contains("Charlie");
        System.out.println("Contains Charlie: " + containsCharlie);
        
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Empty: " + isEmpty);
        
        int size = queue.size();
        System.out.println("Size: " + size);
    }
}
