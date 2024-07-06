//subarray sum equal to K
//arr = 1,2,3  ,k=3
//ans 2 (1,2),(3)
//this can be done by prefix sum 
//prefex means creating same array size and store
//sum of n number in each box 
// prefix will store 1,3,6 of given array
//prefix(j)-prefix(i-1) = 5
//prefix time complexity is 0(n^2)
//nested loop will use O(n^3)
// k = sub(j)-sub(i-1)
//sub(j)-k=sub(i-1)
// key will be sub(i-1)
//value will be frequency
//by default k=0 and value 1 for empty subarray

import java.util.HashMap;

public class problem5 {
    public static void main(String[] args) {
        int arr[]= {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>(); // sum and frequency
        map.put(0,1);
        //default value 0 and frequency 1 for empty subarray
        int ans = 0;
        int sum = 0;
        for(int j =0; j<arr.length;j++){
            sum += arr[j]; //sum = sum + arr[j]
            if(map.containsKey(sum-k)){
                ans +=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+ 1);
            } else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
