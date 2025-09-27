class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        // 4부터 n까지 반복
        for (int i = 4; i <= n; i++) {
            // 1부터 i까지 반복
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // 만약 count 값이 3개 이상일 경우
            if (count >= 3) {
                answer++;
            }
            // count를 0으로 초기화
            count = 0;
        }
        return answer;
    }
}