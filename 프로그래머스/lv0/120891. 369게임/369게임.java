class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        String charOrder = "";

        for (int i=0; i<strOrder.length();i++) {
            charOrder += strOrder.charAt(i);

            if (charOrder.equals("3")
                    || charOrder.equals("6")
                    || charOrder.equals("9")) {
                answer+=1;
            }
            charOrder = "";
        }
        return answer;
    }
}