package Hashmaps;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String,Integer> map=new HashMap<>();
        

        //Insertion
        map.put("India",120);
        map.put("US", 30);
        map.put("China",150);

        System.out.println(map);
        map.put("China", 180);//now value will update to 180
        //so if key already exists it will update its value else it will create new 
         
        //Search
        if(map.containsKey("China")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China"));//180
        System.out.println(map.get("Canada"));//null as canada is not a key
        
         //iteration in hashmap 
         for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
         }

         //creating set of all the keys
         Set<String> keys=map.keySet();
         for(String key:keys){
            System.out.println(key+" "+map.get(key));
         }

         //removing
         map.remove("China");
         System.out.println(map);
    }
    
}
