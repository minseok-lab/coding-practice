class Solution {
    public int solution(int[] box, int n) {
        // answer 1로 초기화, 0일 경우 어떤 상황에서도 정답은 0
        int answer = 1;
        
        // 박스 배열의 길이만큼 반복
        for (int i = 0; i < box.length; i++) {
            // 정답은 box[i]를 n으로 나눈 값들의 곱
            answer *= box[i] / n;
        }
        return answer;
    }
}