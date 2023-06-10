import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        
        studentScores.put("Sudharsan", 85);
        studentScores.put("Thaarun", 92);
        studentScores.put("Ram", 78);
        
        
        int ThaarunScore = studentScores.get("Thaarun");
        System.out.println("Thaarun's score: " + ThaarunScore);
        
        
        studentScores.put("Ram", 82);
        
        
        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            System.out.println(name + ": " + score);
        }
        
        studentScores.remove("Sudharsan");
        System.out.println("Updated scores: " + studentScores);
        
        boolean containsRam = studentScores.containsKey("Ram");
        System.out.println("Contains Ram: " + containsRam);
        
        int size = studentScores.size();
        System.out.println("Size: " + size);
    }
}
