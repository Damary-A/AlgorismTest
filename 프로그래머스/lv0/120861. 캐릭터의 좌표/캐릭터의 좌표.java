class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        int MaxX = (board[0]-1)/2;
        int MaxY = (board[1]-1)/2;

        for (String move : keyinput) {

            switch (move) {
                case "right":
                    if (x < MaxX) {x++;}
                        break;
                case "left":
                    if (x > -MaxX) {x--;}
                        break;
                case "up":
                    if (y < MaxY) {y++;}
                        break;
                case "down":
                    if (y > -MaxY) {y--;}
                    break;
            }
        }
        int[] answer = {x, y};

        return answer;
    }
}