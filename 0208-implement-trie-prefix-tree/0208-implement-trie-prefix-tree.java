class Trie {
    Trie node[];
    boolean flag;
    private Trie root;
    public Trie() {
         node= new Trie[26];
         flag=false;
         root = new Trie(true);
        
    }
    public Trie(boolean val){
        node= new Trie[26];
         flag=false;
    }
    boolean getwordStatus(char ch){
            return (node[ch-'a']!=null);
        }
         void putchar(Trie cur,char ch){
            node[ch-'a']=cur;
        }
        Trie getnextnode(char ch){
            return node[ch-'a'];
        }
    
    public void insert(String word) {
        Trie cur = root;
            for (int i = 0; i < word.length(); i++) {
                if(!cur.getwordStatus(word.charAt(i))){
                    cur.putchar(new Trie(),word.charAt(i));
                }
                cur = cur.getnextnode(word.charAt(i));
            }
            cur.flag = true;
    }
    
    public boolean search(String word) {
        Trie cur = root;
            for (int i= 0;i<word.length();i++){
                if(!cur.getwordStatus(word.charAt(i))){
                    return false;
                }
                cur = cur.getnextnode(word.charAt(i));
            }
            if(cur.flag){
                return true;
            }
            return false;
    }
    
    public boolean startsWith(String prefix) {
        Trie cur = root;
            for (int i= 0;i<prefix.length();i++){
                if(!cur.getwordStatus(prefix.charAt(i))){
                    return false;
                }
                cur = cur.getnextnode(prefix.charAt(i));
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