package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> _collection1 = new ArrayList<String>(collection1);
        List<String> result = new ArrayList<String>();
        for(int i=0; i<collection2.size(); i++) {
            _collection1.retainAll(collection2.get(i));
            result.addAll(_collection1);
        }
        return result;
    }
}
