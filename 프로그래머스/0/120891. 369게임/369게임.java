class Solution {
    public int solution(int order) {
        // 정답을 담을 변수 answer 선언
        int answer = 0;
        // 정수 order를 문자열 값으로 변환
        String orderStr = String.valueOf(order);
        
        // 문자열로 변환된 orderStr를 순회하면서 탐색
        for (int i = 0; i < orderStr.length(); i++) {
            // orderStr 문자열의 i번째 단어는 c
            char c = orderStr.charAt(i);
            // c가 3이거나 6이거나 9인 경우에 answer 값 추가
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }
}