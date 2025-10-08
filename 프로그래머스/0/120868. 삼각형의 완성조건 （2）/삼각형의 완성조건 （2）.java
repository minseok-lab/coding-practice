class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 변의 길이는 주어진 두 변의 길이보다 길고 합보다 작음
        for (int i = Math.abs (sides[0] - sides[1]) + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        return answer;
    }
}