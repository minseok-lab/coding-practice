class Solution {
    public int solution(int n) {
        int answer = 0;
        // 홀수면
        if (n % 2 != 0) {
            // n부터 0까지 홀수의 합
            for (int i = n; i > 0; i -= 2) {
                answer += i;
            }
        } else { // 짝수면
            // n부터 0까지 짝수의 제곱의 합
            for (int i = n; i > 0; i -= 2) {
                answer += i * i;
            }
        }
        return answer;
    }
}