class TrieNode{
        HashMap<Character,TrieNode> map = new HashMap<>();
        boolean wordComplete = false;
    
    public TrieNode(){
        map = new HashMap<>();
        wordComplete = false;
    }
}
class Trie {
     TrieNode root;

    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            current.map.putIfAbsent(ch,new TrieNode());
            current = current.map.get(ch);
        }
        current.wordComplete = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(current.map.get(ch)==null){
                return false;
            }
            current = current.map.get(ch);
        }
        return current.wordComplete;
    }
    
    public boolean startsWith(String word) {
        TrieNode current = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(current.map.get(ch)==null){
                return false;
            }
            current = current.map.get(ch);
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
