class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // a, b 값이 같은 경우
        if (a == b) {
            answer = a;
        } else if (a < b) { // b가 더 클경우 a부터 b까지 합계 산출
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else { // a가 더 클경우 b부터 a까지 합계 산출
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }
}