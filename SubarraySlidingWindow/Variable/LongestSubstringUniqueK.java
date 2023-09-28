package SubarraySlidingWindow.Variable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubsteingK {
    public static int longestSubstringK(String s, int k){
        int i = 0, j=0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        while (j < s.length()){
            char curr = s.charAt(j);
            map.put(curr,map.getOrDefault(curr,0)+1);

            if(map.size() < k){
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j-i+1);
                j++;
            }
            else{
                while(map.size() > k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        System.out.println(longestSubstringK(s,3));
    }
}
