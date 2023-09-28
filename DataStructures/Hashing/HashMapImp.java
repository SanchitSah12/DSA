package DataStructures.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("exists"+map.get("China"));
        }
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
            System.out.println(e);
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove
        map.remove("China");
        System.out.println(map);
    }
}
