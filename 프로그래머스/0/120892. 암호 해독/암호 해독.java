class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        // 시작값은 cipher의 (code - 1)부터 시작해서 code 번째마다 반복
        for(int i = (code - 1); i < cipher.length(); i += code) {
            // c는 문자열의 i번째 숫자
            char c = cipher.charAt(i);
            answer += c;
        }
        return answer;
    }
}