class Solution {
    public int solution(int num, int k) {
        // 예외처리를 미리 진행, -1로 초기화
        int answer = -1;
        // num과 k를 각각 문자열로 전환
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        // numStr의 i번째 숫자와 k가 동일하면
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == kStr.charAt(0)) {
                // 정답은 i + 1
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}