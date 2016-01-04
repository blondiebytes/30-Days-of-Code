
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;




public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        // Putting things inside our dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");
        // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all values
        System.out.println(englSpanDictionary.values());
        // Print out size
        System.out.println("The Size of our Dictionary is "+ englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        // Is Empty?
        System.out.println(shoppingList.isEmpty());
        // Remove things
        shoppingList.remove("Eggs");
        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        
        
        
        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        // Is Empty?
        System.out.println(shoppingList.isEmpty());
        
    }
    
}
