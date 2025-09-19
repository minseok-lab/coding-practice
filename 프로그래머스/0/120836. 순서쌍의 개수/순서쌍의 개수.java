class Solution {
    public int solution(int n) {
        int answer = 0;
        // i는 1부터 n까지 하나씩 늘어나며 반복
        for (int i = 1; i <= n; i++) {
            // n을 i로 나누었을 떄, 나머지가 0이면 약수 
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}