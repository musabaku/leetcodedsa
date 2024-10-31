class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] arr = {-1,-1,-1};
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a'] = i;
            count += 1+ Math.min(arr[0],Math.min(arr[1],arr[2]));
        }
        return count;
    }
}

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
