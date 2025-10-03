class Solution {
    public String solution(String s) {
        String answer = "";
        // 알파벳을 셀 배열 선언
        char[] alphabet = new char[26];
        // s를 charArray로 변환한 후, 순환
        for (char c : s.toCharArray()) {
            // c에서 아스키코드 'a'를 뺀 순서에 추가
            alphabet[c - 'a']++;
        }
        // 알파벳 배열을 순회하면서
        for (int i = 0; i < alphabet.length; i++) {
            // 배열의 i번째 숫자가 1이면
            if (alphabet[i] == 1) {
                // 정답에 i + 'a'를 한 다음에 char값으로 형변환 값 추가
                answer += (char)(i + 'a');
            }
        }
        return answer;
    }
}