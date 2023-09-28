package SubarraySlidingWindow;
import java.util.*;
public class CountOccurancesOfAnagram {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< p.length(); i++) {
            char curr = p.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }


        int i = 0;
        int k = p.length();
        int j = 0;
        int distinct = map.size();
        while(j < s.length()) {
            char curr = s.charAt(j);
            if(map.containsKey(curr)) {
                map.put(curr,map.get(curr)-1);
                if(map.get(curr) == 0){
                    distinct--;
                }
            }
            System.out.println(map + " " + distinct);
            if(j-i+1 < k) {
                j++;
            }
            else if (j-i+1 == k) {
                //answer
                if(distinct == 0){
                    result.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    distinct++;
//                    System.out.println(map);
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("aabaabaa","aaba"));
    }
}
