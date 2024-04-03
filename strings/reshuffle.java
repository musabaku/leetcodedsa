class Solution {
    public String restoreString(String s, int[] indices) {
StringBuilder res = new StringBuilder();
        for(int j =0;j<indices.length;j++){
            for(int i=0;i<indices.length;i++){
                // int count =0;
                if(indices[i]==j){
                    res.append(s.charAt(i));
                    break;
                }
                // count++;
            }
        }
        return res.toString();
    }
//   public String restoreString(String s, int[] indices) {
// StringBuilder res = new StringBuilder();
//         for(int j =0;j<indices.length;j++){
//               res.append(s.charAt(indices[j]));
            
//         }
//         return res.toString();
//     }
}
https://leetcode.com/problems/shuffle-string/solutions//