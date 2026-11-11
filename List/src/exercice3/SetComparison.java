package exercice3;
import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(Arrays.asList("Zahid", "ana", "balik"));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Zahid", "ana", "balik"));
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Zahid", "ana", "balik"));
        
        System.out.println("HashSet (non ordonné) : " + hashSet);
        System.out.println("LinkedHashSet (ordre d'insertion) : " + linkedHashSet);
        System.out.println("TreeSet (trié alphabétiquement) : " + treeSet);
    }
}