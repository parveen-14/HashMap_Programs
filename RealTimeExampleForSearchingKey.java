package HashMap_Concept;

import java.util.HashMap;

public class RealTimeExampleForSearchingKey {
    public static void main(String[] args) {
        HashMap<String,Long> hmap=new HashMap<>();
        hmap.put("Sakshi",9976565459L);
        hmap.put("Pooja",9876874534L);
        hmap.put("ankita",9776476347L);
        hmap.put("arjun",9576547634L);

        Object obj=hmap.get("Sakshi");
        System.out.println("Sakshi phone number is : "+obj);
        Object obj1=hmap.getOrDefault("abcd",-1L);
        System.out.println(obj1);

    }
}
