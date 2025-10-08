class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            // i부터 n까지 하나씩 증가
            answer++;
            // 3의 배수이거나 3을 포함하면 하나 더 증가
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}