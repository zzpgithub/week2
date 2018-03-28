package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String obj : collection1) {
            if (obj.length() > 1) {
                String[] strArr = obj.split("[-:\\[\\]]");
                if (result.containsKey(strArr[0])) {
                    result.put(strArr[0], Integer.valueOf(strArr[1]) + result.get(strArr[0]).intValue());
                } else {
                    result.put(strArr[0], Integer.valueOf(strArr[1]));
                }
            } else {
                if (result.containsKey(obj)) {
                    result.put(obj, result.get(obj).intValue() + 1);
                } else {
                    result.put(obj, 1);
                }
            }
        }
        return result;
    }
}
