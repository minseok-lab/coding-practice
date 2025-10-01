class Solution {
    public int solution(int num1, int num2) { //변수 선언 num1, num2
        double answer = (double) num1 / num2 * 1000; //소수점 계산을 위한 명시적 형변환
        return (int) answer; //정수 부분만 알기 위한 명시적 형변환
    }
}