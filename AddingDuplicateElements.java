package HashMap_Concept;

import java.util.HashMap;

public class AddingDuplicateElements {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(5,"Mango");
        hashMap.put(7,"Orange");
        hashMap.put(8,"Apple");
        hashMap.put(10,"Banana");
        System.out.println("size of hashmap: "+hashMap.size());
        System.out.println("elements of hashmap: "+hashMap);

        System.out.println("Value of the 7 key is: "+hashMap.get(7));
        hashMap.put(8,"Mango");//will replace the value of duplicate key
        hashMap.put(15,"Watermelon");// will add to hashmap
        System.out.println("Updated elements of hashmap: "+hashMap);
        System.out.println("Updated size of hashmap: "+hashMap.size());

    }
}
