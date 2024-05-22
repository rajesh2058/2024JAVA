//permutation 
public class recursion13 {
   


        public static void printPermutation(String str, int idx, String perm) {
            if(str.length() == 0) { //base case
                System.out.println(perm);
                return;
            }
           
            for(int i=0; i<str.length(); i++) {
                char currChar = str.charAt(i);//select a char
                String newStr = str.substring(0, i) + str.substring(i+1);
                //doesnot print end value so i will remain in fix position and new string 
                //will be form
                printPermutation(newStr, idx+1, perm+currChar);
                //passing new string and doing same combinations 
            }
        }
        public static void main(String args[]) {
            String str = "abc";
            printPermutation(str, 0, "");
        }
     }
     
