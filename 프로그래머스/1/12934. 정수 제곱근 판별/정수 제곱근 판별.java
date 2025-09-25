class Solution {
    public long solution(long n) {
        // 기본값은 -1입니다.
        long answer = -1;
        
        // multiNum을 1부터 n까지 하나씩 늘려가며 탐색
        for (long multiNum = 1; multiNum <= 8000000; multiNum++) {
            // 만약 multiNum * multiNum이 n값이면
            if (multiNum * multiNum == n) {
                // 정답은 (multiNum + 1) * (multiNum + 1)
                answer = (multiNum + 1) * (multiNum + 1);
            }
        }
        return answer;
    }
}