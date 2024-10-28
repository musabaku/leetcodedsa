https://leetcode.com/problems/longest-repeating-character-replacement/
class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
                        map.put(ch, map.getOrDefault(ch, 0) + 1);

        // if(!map.contains(ch)){
        // map.put(ch,1);
        // }
        // map.put(ch,map.get(ch)+1);
        int maxFrequency = 0;
        for(int count : map.values()){
            maxFrequency = Math.max(maxFrequency,count);
        }
        int replacment = r-l+1 - maxFrequency;
          
             if(replacment >k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
                max = Math.max(max,r-l+1);
                r++;
        }
    return max;
    }
}
