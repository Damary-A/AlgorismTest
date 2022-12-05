import static java.util.Arrays.stream;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = stream(numlist).filter(i -> i % n ==0).toArray();

        return answer;
    }
}