//given an integer array of size n , find all the
//element that appear more than n/3 times
//without hashset or hashmap we can use
//nested loop to solve it 
//make number as key cause unique
//make frequency as value 
// when value is repeated then increase frequency
//triverse in every number
//map.keySet() will return every key
//time complexity O(n)
import java.util.*;
public class Problem1 {
    public static void majorityElement(int nums[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n;i++){ //true
            if(map.containsKey(nums[i])){
                //map vitra 2 ota integer xa 1st lai key 
                //manam and 2nd lai frequency so
                // key is number with will remain same
                //frequency is increase by 1,
                map.put(nums[i],map.get(nums[i])+1);
                //if number is repeated then 
                //we increase frequency by 1
            } else { //false
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            //KEYSET GETS ALL KEY AND IT IS STORED IN KEY
            if(map.get(key)> n/3){
                System.out.println(key);
            }
        }

    }
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,3,1,5,1,3};
        majorityElement(nums);
    }
}
