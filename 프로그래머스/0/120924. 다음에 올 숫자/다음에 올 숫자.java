class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 2번째와 1번째 배열과 1번째와 0번째 차이가 같으면 등차수열
        if (common[2] - common[1] == common[1] - common[0]){
            // 마지막 배열값에 차이만큼 추가
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else { // 그 외에는 등비수열
            // 마지막 배열값에 차이만큼 곱
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }
}