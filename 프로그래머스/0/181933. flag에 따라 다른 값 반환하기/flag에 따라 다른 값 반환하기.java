class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) { //flag가 참일 경우
            answer = a + b; //a + b 실행
        }
        else { //참이 아닐 경우
            answer = a - b; // a - b 실행
        }
        return answer;
    }
}