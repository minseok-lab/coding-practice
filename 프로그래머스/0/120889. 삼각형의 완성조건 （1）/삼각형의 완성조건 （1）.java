class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 최대값 구하는 방법, 정수 최대값 max 선언
        int max = 0;
        // i는 0부터 하나씩 늘어가며 3번 반복
        for (int i = 0; i < 3; i++) {
            // 만약 max 값보다 side 배열의 i번째 값이 크다면 
            if (max < sides[i]) {
                // side 배열의 i값을 max로 선언
                max = sides[i];
            }
        }
        
        // 최대값을 제외한 두 변의 합 sum 선언
        int sum = 0;
        // i는 0부터 하나씩 늘어가며 3번 반복
        for (int i = 0; i < 3; i++) {
            // sum은 모든 변의 합
            sum += sides[i];
        }
        
        // 가장 긴 변의 길이 max는 다른 두 변의 길이의 합(sum - max)보다 작으면 1, 아니면 2
        if (max < (sum - max)) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        return answer;
    }
}