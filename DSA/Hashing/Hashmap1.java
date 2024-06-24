import java.util.*;
public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //insertion 
        map.put("Nepal",01);
        System.out.println(map);
        map.put("Nepal", 02);
        System.out.println(map);
        //search
        if(map.containsKey("Nepal")){
            System.out.println("value present in data table");
        }
        else{
            System.out.println("value doesnot present in data table");
        }
        //iteration ways
        //i from entry set
        // for(int val : arr) int become map.entry 
        //and val become e and arr beome map.entryset
        //inside e we have all set of data
        //we access data from e
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //iteration ii from keyset
        Set<String> Keys = map.keySet();
        for(String key : Keys){
            System.out.println(key+ " " + map.get(key));
            //remove
            map.remove("Nepal");
            System.out.println(map );
        }
    }
}
