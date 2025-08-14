class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) { //num을 n으로 나눈 값의 나머지가 0일 때
            return answer = 1; //정답은 1
        }
        else { //그 이외의 경우
            return answer = 0; //정답은 0
        }
    }
}