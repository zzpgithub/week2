package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>(collectionA);
        for (String obj : object.get("value")) {
            if (result.containsKey(obj)) {
                int temp = result.get(obj).intValue()/3;
                result.put(obj, result.get(obj).intValue() - temp);
            }
        }
        return result;
    }
}
