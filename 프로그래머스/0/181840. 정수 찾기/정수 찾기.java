class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        // num_list를 순회하며 n과 같은 값 탐색
        for (int i = 0; i < num_list.length; i++) {
            // 같은 값이 존재할 경우, 1로 설정 후 반복문 탈출
            if (num_list[i] == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}