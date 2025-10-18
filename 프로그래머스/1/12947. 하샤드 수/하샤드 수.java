class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xNum = String.valueOf(x);
        int sumNum = 0;
        for (int i = 0; i < xNum.length(); i++) {
            sumNum += Integer.valueOf(xNum.charAt(i)) - 48;
        }
        if (x % sumNum != 0) {
            answer = false;
        }
        return answer;
    }
}