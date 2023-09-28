import java.util.*;

public class FindItinery {
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key:tick.keySet()){
            revMap.put(tick.get(key), key);
        }
        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");


        String start = getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }
}
