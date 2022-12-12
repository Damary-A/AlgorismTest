import java.util.*;

class Solution {
    public List solution(String[] quiz) {
       List answer = new ArrayList<>();

        for (String q :quiz) {
            String[] qSplitArr = q.split(" ");
            switch (qSplitArr[1]) {
                case "+":
                    if (Integer.parseInt(qSplitArr[0]) + Integer.parseInt(qSplitArr[2]) == Integer.parseInt(qSplitArr[4])) {
                    answer.add("O");
                    }
                    else {
                        answer.add("X");
                    }
                    break;
                case "-":
                    if (Integer.parseInt(qSplitArr[0]) - Integer.parseInt(qSplitArr[2]) == Integer.parseInt(qSplitArr[4])) {
                        answer.add("O");
                    }
                    else {
                        answer.add("X");
                    }
                    break;
            }
        }
        return answer;
    }
}