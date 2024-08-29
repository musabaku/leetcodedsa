class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if(s==null){
            return 0;
        }
        if(s != null && s.trim().isEmpty()){
            return 1;
        }

        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        int res=0;
            for(int i =0;i<s.length();i++){
                 char ch = s.charAt(i);
                    if(list.contains(ch)){
                        res = Math.max(res,count);
                        while(list.contains(ch)){
                            list.remove(0);
                        }
                        count = list.size();
                        list.add(ch);
                        count++;
                        }
                else {
                        list.add(ch);
                        count++;
                        }
         }
        res = Math.max(res,list.size());

        return res;
    }
}
// https://leetcode.com/problems/longest-substring-without-repeating-characters/