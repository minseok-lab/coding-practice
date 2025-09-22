class Solution {
    public int[] solution(int[] num_list, int n) {
        // 새로운 정수 배열 n 길이만큼의 answer 선언
        int[] answer = new int[n];
        // i는 0부터 n까지 반복
        for (int i = 0; i < n; i++) {
            // answer 배열의 i번째 수는 num_list의 i번째 수
            answer[i] = num_list[i];
        }
        return answer;
    }
}