package exercice4;
import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        
        dictionary.put("dog", "dog");
        dictionary.put("cat", "chien");
        dictionary.put("bird", "oiseau");
        
        System.out.println("Traduction de 'dog' : " + dictionary.get("dog"));
        
        System.out.println("--- Dictionnaire complet ---");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
