package lec27;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Bekar");
        map.put("orange", "bhaut bekaar");
        map.put("mango", "badhiya");

        System.out.println(map); // not sorted

        for(String string:map.keySet()){  // for each iterator
            System.out.println(string);
        }
        for(String string: map.values()){
            System.out.println(string);
        }

        map.remove("Apple");
        for(String string:map.keySet()){  // for each iterator
            System.out.println(string);
        }

        System.out.println(frequencyy("aabbcsaa"));
    }

    // frequency array

    public static HashMap<Character,Integer> frequencyy(String str ){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
//            int count =1;
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else{
               map.put(ch,1);
           }

        }

        return map;
    }

}
