class Solution {
    public int solution(int n) {
        int sum = 0; //총합 변수 sum 선언
        for (int i = 1; i <= n; i++) { //i는 1부터, n이하까지 반복, i는 하나씩 증가
            if (i % 2 == 0) { //i를 2로 나눴을 때 나머지가 0
                sum = sum + i; // 합계는 합계 + i, n이하까지 반복
            };
        }
        return sum; //총합
    }
}