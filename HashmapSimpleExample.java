package HashMap_Concept;

import java.util.HashMap;

public class HashmapSimpleExample {
    public static void main(String[] args) {

        HashMap<String,Integer> hmap=new HashMap<>();
        boolean element=hmap.isEmpty();
        System.out.println("Is HashMap Empty : "+element);

        hmap.put("Java1",100);
        hmap.put("Java2",200);
        hmap.put("Java3",300);
        hmap.put("Java4",400);
        hmap.put("Java5",500);
        hmap.put("Java6",600);
        hmap.put("Java7",700);

        System.out.println("element of the hashmap is: "+hmap);
        int size=hmap.size();
        System.out.println("Size of hashmap: "+size);

        hmap.put(null,null);
        System.out.println("Updated hashmap is : "+hmap);
        System.out.println("size of updated hashmap is : " +hmap.size());


    }
}
