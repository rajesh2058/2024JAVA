//startsWith problem
//create a function boolean startsWith(String prefix) for a trie
//returns true if there is a previously inserted string
//word that has the prefix prefix and false otherwise.
//prefic check garna means tayo dekhi start huna kunai code
//xa ki xaina vanara check garako ho

import java.util.*;
public class problem2 {
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
 
    public static boolean startsWith(String prefix) {
       Node curr = root;
       for(int i=0; i<prefix.length(); i++) {
           int idx = prefix.charAt(i)-'a';
           if(curr.children[idx] == null) {
               return false;
           }
           curr = curr.children[idx];
       }
       return true;
   }
    public static void main(String[] args) {
        String[] words = {"apple","app","mango","man","woman"};
        String prefix = "fam";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }
}
