import java.util.*;

class Solution {
    public List solution(String[] quiz) {
        List answer = new ArrayList<>();

        for (String q : quiz) {
            String[] qSplitArr = q.split(" ");
            int x = Integer.parseInt(qSplitArr[0]);
            int y = Integer.parseInt(qSplitArr[2]);
            int z = Integer.parseInt(qSplitArr[4]);
            int compareZ = 0;

            switch (qSplitArr[1]) {
                case "+":
                    compareZ = x + y;
                    break;
                case "-":
                    compareZ = x - y;
                    break;
            }
            
            if (compareZ == z) {
                answer.add("O");
            }
            else {
                answer.add("X");
            }
        }
        return answer;
    }
}