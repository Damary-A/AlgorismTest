class Solution {
    public int[] solution(int n, int[] numlist) {
        int answerSize = 0;

        for (int i : numlist) {
            if (i % n == 0) {
                answerSize++;
            }
        }

        int[] answer = new int[answerSize];
        int answerIdx = 0;
        for (int i : numlist) {
            if (i % n == 0) {
                answer[answerIdx] = i;
                answerIdx++;
            }
        }
        return answer;
    }
}