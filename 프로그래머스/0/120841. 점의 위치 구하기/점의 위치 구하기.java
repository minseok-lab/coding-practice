class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        // x좌표가 양수일 경우
        if (dot[0] > 0) {
            // y좌표가 양수일 경우
            if (dot[1] > 0) {
                answer = 1;
            }
            // y좌표가 음수일 경우
            else {
                answer = 4;
            }
        } 
        // x좌표가 음수일 경우
        else {
            // y좌표가 양수일 경우
            if (dot[1] > 0) {
                answer = 2;
            }
            // y좌표가 음수일 경우
            else {
                answer = 3;
            }
        }
        return answer;
    }
}