import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        
        
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Empty: " + isEmpty);
        
       
        int size = stack.size();
        System.out.println("Size: " + size);
    }
}
