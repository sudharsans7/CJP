import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);
        
       
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.remove("Banana");
        System.out.println("Updated fruits: " + fruits);
        
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);
        
        int size = fruits.size();
        System.out.println("Size: " + size);
    }
}
