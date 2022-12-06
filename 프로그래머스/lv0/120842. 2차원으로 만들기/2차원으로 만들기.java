class Solution {
    public int[][] solution(int[] num_list, int n) {
        int answerLength=num_list.length/n;

        int[][] answer = new int[answerLength][n];

        int newArrIdx = 0;
        int answerIdx = 0;

        for (int i : num_list) {
            if (newArrIdx == n) {
                newArrIdx = 0;
                answerIdx++;
                answer[answerIdx][newArrIdx] = i;
                newArrIdx++;
            } else {
                answer[answerIdx][newArrIdx] = i;
                newArrIdx++;
            }
        }
        return answer;
    }
}