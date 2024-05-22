//Find the occurrence of the first and last occurrence of an element using recursion.
public class recursion9 {
    
        public static int first = -2; // global and can be access by all objects
        public static int last = -2; // -2 rakhnu ko rakan kunai poni index -2 hunna so
        public static void getIndices(String str, char el, int idx) {
        if(idx == str.length()) {
        return;
        } 
        if(str.charAt(idx) == el)//charAt is start from 2
         {
        if(first == -2) {
        first = idx; //yeha a pahilo choti vetiyo so we override first with idx to track position
        } else {
        last = idx;
        }
        }
        getIndices(str, el, idx+1); //we are moving from forward to last
        }
        public static void main(String args[]) {
        String str = "abcafghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
        System.out.println("Last occurence : " + str.length()); //lenth is start from 2 
        }
        }
