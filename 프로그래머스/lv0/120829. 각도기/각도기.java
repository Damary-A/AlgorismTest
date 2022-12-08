class Solution {
    public int solution(int angle) {
        int answer = (int)angle/90*2;
               
        if (angle%90 >0) {
            answer+=1;
        }
            
        return answer;
    }
}