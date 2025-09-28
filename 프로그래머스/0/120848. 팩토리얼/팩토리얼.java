class Solution {
    public int solution(int n) {
        // 정답 변수와 팩토리얼 계산을 위한 정수값 선언
        int answer = 0;
        int factorialNum = 1;
        
        // i는 1부터 10까지 반복
        for (int i = 1; i <= 10; i++) {
            // 팩토리얼에 i값을 순차 곱함
            factorialNum *= i;
            answer = i;
            if (factorialNum > n) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}