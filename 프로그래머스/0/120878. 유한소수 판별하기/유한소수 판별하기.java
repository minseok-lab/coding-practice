class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int gcdA = a;
        int gcdB = b;
        
        // 유클리드 호제법
        while (gcdB != 0) {
            int temp = gcdB;
            gcdB = gcdA % gcdB;
            gcdA = temp;
        }
        
        // 원래 분모(b)를 최대공약수로 나누어 기약분수의 분모를 구합니다.
        int denominator = b / gcdA;
        
        // 분모가 2로 나누어떨어지는 동안에는 계속 2로 나눕니다.
        while (denominator % 2 == 0) {
            denominator = denominator / 2;
        }
        
        // 남은 숫자를 5로 나누어떨어지는 동안 계속 5로 나눕니다.
        while (denominator % 5 == 0) {
            denominator = denominator / 5;
        }
        
        // 2와 5를 모두 제거했는데도 분모가 1로 딱 떨어졌다면,
        // 그 분모는 소인수로 2와 5만 가졌다는 의미
        if (denominator == 1) {
            return 1;
        }
        
        return answer;
    }
}