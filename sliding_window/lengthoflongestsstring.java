// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {

  int maxCount = 0;
       int l = 0;
       int r ;
       if(s==null){
        return 0;
       }
       HashMap<Character,Integer> map = new HashMap<>();
       for(r=0;r<s.length();r++){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),r);
                maxCount = Math.max(maxCount,r-l+1);

            }else{
            l = Math.max(l,map.get(s.charAt(r))+1);
            map.put(s.charAt(r),r);
                maxCount = Math.max(maxCount,r-l+1);

            }

            }
    return maxCount;
    }
}








// Approach 2

//   int maxCount = 0;
//        int l = 0;
//        int r ;
//        if(s==null){
//         return 0;
//        }
//        ArrayList<Character> list = new ArrayList<>();
//         for( r = 0;r<s.length();r++){
//             if(!list.contains(s.charAt(r))){
//                 list.add(s.charAt(r));
//             maxCount = Math.max(maxCount,r-l+1);
//             }
//             else{
//                 // while(list.contains(s.charAt(r))){
//                 //     list.remove(0);
//                 // }
//                 l = list.indexOf(s.charAt(r))+1;
// // in tmmzurxt , it will just remove 1st m and not t if t not removed then it wont be valid substirn gbut just a seq which que doesnt ask for and while solves it
//             // l=index+1;
//             // l=r-list.size();

//             list.add(s.charAt(r));
//             }
//         }
//         return maxCount;


// -------------------
// Approach 3

 // if(s.isEmpty()){
        //     return 0;
        // }
        // if(s==null){
        //     return 0;
        // }
        // if(s != null && s.trim().isEmpty()){
        //     return 1;
        // }

        // ArrayList<Character> list = new ArrayList<>();
        // int count = 0;
        // int res=0;
        //     for(int i =0;i<s.length();i++){
        //          char ch = s.charAt(i);
        //             if(list.contains(ch)){
        //                 res = Math.max(res,count);
        //                 while(list.contains(ch)){
        //                     list.remove(0);
        //                 }
        //                 count = list.size();
        //                 list.add(ch);
        //                 count++;
        //                 }
        //         else {
        //                 list.add(ch);
        //                 count++;
        //                 }
        //  }
        // res = Math.max(res,list.size());

        // return res;