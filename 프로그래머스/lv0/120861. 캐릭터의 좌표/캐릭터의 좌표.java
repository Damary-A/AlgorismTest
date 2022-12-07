class Solution {
    public int[] solution(String[] keyinput, int[] board) {
int x = 0;
        int y = 0;

        int MaxX = (board[0]-1)/2;
        int MaxY = (board[1]-1)/2;

        for (String move : keyinput) {

            switch (move) {
                case "right":
                    if (x == MaxX) {
                        break;
                    } else {
                        x++;
                        break;
                    }
                case "left":
                    if (x == -MaxX) {
                        break;
                    } else {
                        x--;
                        break;
                    }
                case "up":
                    if (y == MaxY) {
                        break;
                    } else {
                        y++;
                        break;
                    }
                case "down":
                    if (y == -MaxY) {
                        break;
                    } else {
                        y--;
                        break;
                    }
            }
        }

        int[] answer = {x, y};

        return answer;
    }
}