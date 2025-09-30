class Solution {
    public String solution(String phone_number) {
        // 정답 문자열 선언
        String answer = "";
        
        // 휴대폰 번호 문자열을 순회
        for (int i = 0; i < phone_number.length(); i++) {
            // c는 휴대폰 번호 i번째 값
            char c = phone_number.charAt(i);
            // 휴대폰 길이의 4번째 전까지는 문자열에 * 추가
            if (i < phone_number.length() - 4) {
                answer += "*";
            } else { // 그 외(뒷 4개 숫자)는 숫자 그대로 추가
                answer += c;
            }
        }
        return answer;
    }
}