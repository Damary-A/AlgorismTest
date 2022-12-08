import static java.util.Arrays.stream;

class Solution {
    public double solution(int[] numbers) {
        double answer = stream(numbers).average().getAsDouble();
        return answer;
    }
}