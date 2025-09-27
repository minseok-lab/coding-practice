class Solution {
    public int[] solution(int n) {
        // 배열의 길이 구하기
        int count = 1;
        for (int i = 1; i < n; i++) {
            // n을 i로 나눴을 때 나머지가 0일 경우 카운트 중가
            if (n % i == 0) {
                count++;
            }
        }
        
        // 정답 배열의 길이는 위에서 구한 길이
        int[] answer = new int[count];
        // 배열 번호 정의
        int index = 0;
        // 최댓값 사전 정의(효율성)
        answer[count - 1] = n;
        
        // i는 1부터 (n / 2)까지 반복
        for (int i = 1; i <= n / 2; i++) {
            // 나눈 나머지가 0일 경우, 배열에 추가
            if(n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}