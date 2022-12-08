import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(1);

        for (int i = 0; i < share; i++) {
            answer = answer.multiply(BigInteger.valueOf(balls-i)).divide(BigInteger.valueOf(i+1));
        }
        return answer;
    }
}