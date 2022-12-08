class Solution {
    public long solution(String numbers) {
        String answer = "";
        String separtedNum = "";

        for (int i=0; i< numbers.length();i++) {
            separtedNum += numbers.charAt(i);

            switch (separtedNum) {
                case "one":
                    separtedNum="";
                    answer += "1";
                    break;
                case "two":
                    separtedNum="";
                    answer += "2";
                    break;
                case "three":
                    separtedNum="";
                    answer += "3";
                    break;
                case "four":
                    separtedNum="";
                    answer += "4";
                    break;
                case "five":
                    separtedNum="";
                    answer += "5";
                    break;
                case "six":
                    separtedNum="";
                    answer += "6";
                    break;
                case "seven":
                    separtedNum="";
                    answer += "7";
                    break;
                case "eight":
                    separtedNum="";
                    answer += "8";
                    break;
                case "nine":
                    separtedNum="";
                    answer += "9";
                    break;
                case "zero":
                    separtedNum="";
                    answer += "0";
                    break;
                default:
                    break;
            }
            }

        return Long.parseLong(answer);
    }
}