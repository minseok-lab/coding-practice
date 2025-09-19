class Solution {
    public int[] solution(int n, int[] numlist) {
        // answer 배열의 길이를 구하기 위한 count 선언
        int count = 0;
        // 정수 i는 배열 최대 길이 전까지 하나씩 늘어나며 반복 실행
        for (int i = 0; i < numlist.length; i++) {
            // 만약 numlist의 i번째 숫자를 n으로 나눌 때 나머지가 0일 경우
            if (numlist[i] % n == 0) {
                count++; // count를 하나 증가시킵니다.
            }
        }
        
        // 측정한 count 만큼의 자리가 있는 new 정수 배열 선언
        int[] answer = new int[count];
        
        // 선언한 answer 배열에 숫자 삽입
        // answer 배열에 넣을 배열 위치를 설정하기 위한 num 선언
        int num = 0;
        // 정수 i는 배열 최대 길이 전까지 하나씩 늘어나며 반복 실행
        for (int i = 0; i < numlist.length; i++) {
            // 만약 numlist의 i번째 숫자를 n으로 나눌 때 나머지가 0일 경우
            if (numlist[i] % n == 0) {
                // 정답 배열의 num번째 정수는 numlist의 i번째 정수
                answer[num] = numlist[i];
                num++; // 정답 배열 위치 변경
            }
        }
        return answer;
    }
}