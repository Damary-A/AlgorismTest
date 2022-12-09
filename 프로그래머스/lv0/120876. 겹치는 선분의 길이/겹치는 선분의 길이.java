import static java.util.Arrays.stream;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] startList = stream(new int[]{lines[0][0], lines[1][0], lines[2][0]}).sorted().toArray();
        int[] endList = stream(new int[]{lines[0][1], lines[1][1], lines[2][1]}).sorted().toArray();
        int[] lengthList = new int[3];

        for (int i = 0; i < 3; i++) {
            lengthList[i] = lines[i][1] - lines[i][0];
        }

        int start1 = startList[0];
        int start2 = startList[1];
        int start3 = startList[2];
        int end1 = endList[0];
        int end2 = endList[1];
        int end3 = endList[2];

        int wholeLength = end3 - start1;
        int sumLength = stream(lengthList).sum();

        int[] emptySpace = new int[2];
        int tripleSpace = 0;

        if (start3 < end2 || start2 < end1) {
            if (start3 > end2) {
                emptySpace[0] = start3 - end2;
            }

            if (start2 > end1) {
                emptySpace[0] = start2 - end1;
            }
            if (start3 < end1) {
                tripleSpace = end1 - start3;
            }
            answer = sumLength - wholeLength + stream(emptySpace).sum() - tripleSpace;
        } else {
            answer = 0;
        }

        return answer;
    }
}