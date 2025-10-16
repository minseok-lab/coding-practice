class Solution {
    public long[] solution(long x, int n) {
        // n 만큼의 길이를 가진 long 배열 선언
        long[] answer = new long[n];
        // 0부터 n번 반복
        for (int i = 0; i < n; i++) {
            // answer[i] 는 x부터 x만큼 반복 증가하는 값
            answer[i] = x + (x * i);
        }
        return answer;
    }
}