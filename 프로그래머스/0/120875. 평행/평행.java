class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // (0번-1번 직선 기울기) vs (2번-3번 직선 기울기)
        if ((double)(dots[1][0] - dots[0][0]) / (dots[1][1] - dots[0][1]) ==
           (double)(dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1])) {
            answer = 1;
        }
        // (0번-2번 직선 기울기) vs (1번-3번 직선 기울기)
        if ((double)(dots[2][0] - dots[0][0]) / (dots[2][1] - dots[0][1]) ==
           (double)(dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1])) {
            answer = 1;
        }
        // (0번-3번 직선 기울기) vs (1번-2번 직선 기울기)
        if ((double)(dots[3][0] - dots[0][0]) / (dots[3][1] - dots[0][1]) ==
           (double)(dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1])) {
            answer = 1;
        }
        return answer;
    }
}