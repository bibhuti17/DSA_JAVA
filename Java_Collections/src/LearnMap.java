import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
//      key: value pair - if key repeated then it's overrides
        Map<String, Integer> map = new HashMap<>(); //creation - keys are always unique
//        Map<String, Integer> map = new TreeMap<>(); //creation - keys are always unique
//        treemap - put keys in binary search tree and maintains sorted order of keys
//        alphabetical order for alphabets - O(log(n)) for all opitons
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
//      map.remove(key: "A")
//        if(!map.containsKey("A")){
//        map.put("E", 909);
//        } value overrided
        map.putIfAbsent("E", 909); // not override

        System.out.println(map);
//        {A=1, B=2, C=3, D=4, E=5}


//        Iterator
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//       for (String s: numbers.keySet()) to get only key set
//        for(Integer n: numbers.values()) to get only key set

//        getKey - for keys
//        getValue - for values

        System.out.println(map.containsValue(1));

    }
}
