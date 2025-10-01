class Solution {
    public int solution(int i, int j, int k) {
        // 정답 변수와 계산을 위한 임시 변수(temp)를 선언
        int answer = 0;
        int temp = 0;
        
        // i부터 j까지 순회
        for (int num = i; num <= j; num++) {
            // 임시 변수에 num 숫자 대입
            temp = num;
            
            // tmep가 0이 아니면 반복 (0이면 종료)
            while (temp != 0) {
                // 만약 정수를 10으로 나눈 나머지가 k면 정답 증가
                if (temp % 10 == k) {
                    answer++;
                }
                // 정수를 10으로 나눔(검토 자리 수 변경)
                temp /= 10;
            }
        }
        return answer;
    }
}