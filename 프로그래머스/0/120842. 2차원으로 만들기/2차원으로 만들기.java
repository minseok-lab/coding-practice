class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 외부 배열의 길이는 전체 숫자열을 n으로 나눈 값
        int outterArray = num_list.length / n;
        // 배열의 n번째 숫자
        int numAt = 0;
        // 정답 배열의 길이 선언
        int[][] answer = new int[outterArray][n];
        
        // 외부 배열은 0부터 외부 배열 길이만큼
        for (int i = 0; i < outterArray; i++) {
            // 내부 배열은 0부터 n 만큼
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[numAt];
                // 원본 배열 위치 이동
                numAt++;
            }
        }
        return answer;
    }
}