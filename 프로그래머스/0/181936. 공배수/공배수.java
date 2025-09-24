class Solution {
    public int solution(int number, int n, int m) { //정수 number, n, m 정의
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            // number을 n으로 나눈 값의 나머지가 0, m으로 나눈 값의 나머지가 0인 경우 모두를 만족할 경우
            return answer = 1; //결과값 1 return
        }
        else return answer = 0; //그 이외의 경우, 0 return
    }
}