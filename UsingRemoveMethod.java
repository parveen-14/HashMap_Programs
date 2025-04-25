package HashMap_Concept;

import java.util.HashMap;

public class UsingRemoveMethod {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hmap=new HashMap<>();
        boolean element=hmap.isEmpty();
        System.out.println("Is HashMap Empty : "+element);

        hmap.put(1,100);
        hmap.put(2,200);
        hmap.put(3,300);
        hmap.put(4,400);
        hmap.put(5,500);
        hmap.put(6,600);
        hmap.put(7,700);
        System.out.println("element of  hashmap is : " +hmap);
        Object element1=hmap.remove(2);
        System.out.println("Updated hashmap after removing element which is key 2 : "+element1);
         Object element2=hmap.remove(1,100);
        System.out.println("Updated element of  hashmap is : " +element2);
        System.out.println("size of updated hashmap is : " +hmap.size());
        Object element4=hmap.replace(1,100);
        System.out.println(element4);//we are already removed it so it gives null.
        Object element5=hmap.replace(3,500);
        System.out.println("Replace value of the 3rd key: "+element5);
        System.out.println("Updated entries after Replace value of the key which is 3 : "+hmap);
    }
}
