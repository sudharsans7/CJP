import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        
        
        names.add("Ram");
        names.add("Gopi");
        names.add("Charlie");
        
        
        System.out.println("Names: " + names);
        
       
        names.addFirst("David");
        names.addLast("Eve");
        System.out.println("Updated names: " + names);
        
        
        names.removeFirst();
        names.removeLast();
        System.out.println("Updated names: " + names);
        
        
        boolean isEmpty = names.isEmpty();
        System.out.println("Is empty: " + isEmpty);
        
	int size = names.size();
        System.out.println("Size: " + size);
    }
}
