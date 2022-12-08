import static java.util.Arrays.stream;

class Solution {
    public double solution(int[] numbers) {
        double answerSum = stream(numbers).sum();
        double answerLen = numbers.length;
        double answer = answerSum/answerLen;
        return answer;
    }
}