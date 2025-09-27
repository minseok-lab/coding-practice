class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // num_list 배열을 순회하며 탐색
        for (int i = 0; i < num_list.length; i++) {
            // 만약 num_list의 i번째 숫자에서 처음으로 음수값을 만나면
            if (num_list[i] < 0) {
                // 정답은 i, 반복문 탈출
                answer = i;
                break;
            }
            // 그 외 음수가 없다면 정답은 -1
            else {
                answer = -1;
            }
        }
        return answer;
    }
}