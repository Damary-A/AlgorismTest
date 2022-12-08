import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] num_list) {
        List answer = new ArrayList<>();
        for (int num : num_list) {
        answer.add(0, num);
        }
        return answer;
    }
}