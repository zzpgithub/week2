package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {

    Map<String, Integer> createCollection(List<String> collectionA) {
        Map<String, Integer> collection = new HashMap<String, Integer>();
        for (String obj : collectionA) {
            if (collection.containsKey(obj)) {
                collection.put(obj, collection.get(obj).intValue() + 1);
            } else { if(obj.length()>=2){
                    String[] strArr = obj.split("-");
                    collection.put(strArr[0], Integer.valueOf(strArr[1]));
                }
                else {
                    collection.put(obj, 1);
                }
            }
        }
        return collection;
    }

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        collection3 = createCollection(collectionA);

        for (String obj : object.get("value")) {
            if (collection3.containsKey(obj)) {
                int temp = collection3.get(obj).intValue() / 3;
                collection3.put(obj, collection3.get(obj).intValue() - temp);
            }
        }

        return collection3;
    }
}
