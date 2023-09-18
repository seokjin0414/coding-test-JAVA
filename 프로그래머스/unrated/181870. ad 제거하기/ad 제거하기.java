import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                list.add(s);
            }
        }
        return list;
    }
}