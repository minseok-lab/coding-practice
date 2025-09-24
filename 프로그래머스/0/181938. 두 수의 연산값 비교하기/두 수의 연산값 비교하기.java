class Solution {
    public int solution(int a, int b) {
        int answer = 0; //answer 변수 선언
        String as = String.valueOf(a); //a를 문자열로 변환
        String bs = String.valueOf(b); //b를 문자열로 변환
        String abs = as + bs; //문자열 변수 abs는 a와 b를 연속으로 읽은 문자열
        int ab = Integer.parseInt(abs); //문자열 abs를 정수ab로 전환
        
        if (ab >= 2 * a * b) { //ab가 2 * a * b보다 크거나 같다면
            return answer = ab; //ab 출력
        }
        else { //그 외의 경우
            return answer = 2 * a * b; //2 * a * b 출력
        }
    }
}