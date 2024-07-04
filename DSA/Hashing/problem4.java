//find itinerary from ticket
//itenerary mean path
//qn no loop for only 1 journey
//1 from chennai to bengaluru
//2 from mumbai to delhi
//3  from goa to chennei
//4 from delhi to goa
//from chennai-mumbai-goa-delhi
//to bengaluru-chennei-delhi-goa
//make to map as reverse map
//hint mumbai is only which lie in from not in to so 
//starting point is mumbai
//visualized path for perfect
//mumbai-delhi-goa-chennai-bengaluru
//this can also be done by topological sort

import java.util.*;
public class problem4 {
    public static String getStart(HashMap<String, String> tick )
    {
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : tick.keySet()){
        revMap.put(tick.get(key),key);
        }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start = getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
