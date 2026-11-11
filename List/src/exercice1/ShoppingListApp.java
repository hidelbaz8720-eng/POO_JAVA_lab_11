package exercice1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("hamza");
        shoppingList.add("Lina");
        shoppingList.add("ahmad");
        
        System.out.println("Articles de la liste :");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
        shoppingList.remove("Lait");
        boolean hasApples = shoppingList.contains("hamza");
        System.out.println("Contient des pommes ? " + hasApples);
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }
}