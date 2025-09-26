class Solution {
    public int[] solution(long n) {
        // long n을 문자열로 재정의
        String str = String.valueOf(n);
        // 정답 배열의 길이 설정
        int[] answer = new int[str.length()];
        
        // 새로운 배열의 길이만큼 반복
        for (int i = 0; i < str.length(); i++) {
            // 배열의 i번째 수는, str 문자열의 끝 수에서 i를 뺀 값
            // 아스키코드 변환을 막기 위해 - '0' 사용
            answer[i] = str.charAt(str.length() - 1 - i) - '0';

        }
        return answer;
    }
}