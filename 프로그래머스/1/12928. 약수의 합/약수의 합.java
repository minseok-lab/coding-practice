class Solution {
    public int solution(int n) {
        int sum = 0;
        // 약수는 1부터 n까지 하나씩 늘어나며 반복
        for (int divisors = 1; divisors <= n; divisors++) {
            // 정수 n수를 약수로 나눈 값의 나머지가 0일 때
            if (n % divisors == 0) {
                // 합계에 약수 추가
                sum += divisors;
            }
        }
        return sum;
    }
}