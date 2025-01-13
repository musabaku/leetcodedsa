class TrieNode{
    public HashMap<Character,TrieNode> map = new HashMap<>();
    boolean isComplete =false;
}
class WordDictionary {
     TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for(int i = 0;i<word.length();i++){
            Character ch = word.charAt(i);
            current.map.putIfAbsent(ch,new TrieNode());
            current = current.map.get(ch);
        }
        current.isComplete=true;
    }
    public boolean search(String word) {
            return search(word,0,root);
        }
    public boolean search(String word,int index,TrieNode node) {
        if(index==word.length()){
            return node.isComplete;
        }
        Character ch = word.charAt(index);
        if(ch=='.'){
            for(TrieNode x : node.map.values()){
                if(search(word,index+1,x)){
                    return true;
                }
            }
            return false;
        }
        else {     
            TrieNode next = node.map.get(ch);
          if(next==null){
            return false;
             }
        return search(word,index+1,next);
        }
    }
        }


/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
