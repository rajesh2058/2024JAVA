//word break problem 
//given an input string and a dictionary of words , find out if
//the input string can be broken into a space-separated sequence
//of dictionary words
//break the key and check if its like in words or not
//create all
//cut lugunu parxa and cut laguna ko lagi end of word chayo
public class problem1 {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        public Node() {
            for (int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word) { //O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;
        for(; level<len; level++) {
            idx = word.charAt(level)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key) { //O(n)
        int level = 0;
        int len = key.length();
        int idx = 0;
        Node curr = root;
        for(; level<len; level++) {
            idx = key.charAt(level)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
 
    public static boolean wordBreak(String key){
        //using recursion here
        if(key.length()==0){ //base class
            return true;
        }
        for(int i = 1; i<=key.length();i++){
            String firstPart = key.substring(0, i);
            //eg rajesh and if i =2 then output ra
            String secPart = key.substring(i);
            //eg if i =2 jesh
            if(search(key.substring(0, i))&& 
            wordBreak(key.substring(i))){
               return true; 
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        String[] words = {"i","like","sam","samsung","mobile","ice"};
        String key = "ilikesung" ;
       for(int i =0;i<words.length;i++){
        insert(words[i]);
       }
       System.out.println(wordBreak(key));
    }
}
