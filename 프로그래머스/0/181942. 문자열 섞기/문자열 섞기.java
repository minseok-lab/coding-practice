class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // i는 배열의 길이만큼 반복(두 문자열이 같으므로 아무 문자열 사용 가능)
        for (int i = 0; i < str1.length(); i++) {
            // 정답은 str1과 str2를 순서대로 배열에 저장, 형변환을 막기 위해 ""추가
            answer += str1.charAt(i) + "" + str2.charAt(i);
        }
        return answer;
    }
}