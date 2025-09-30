class Solution {
    public int solution(String str1, String str2) {
        // 정답 기본값은 2
        int answer = 2;
        // 비교를 위한 str2 길이를 설정
        int compareNum = str2.length();
        
        // i는 0부터 str1길이에서 str2길이를 뺀 값까지(최적화)
        for (int i = 0; i <= (str1.length() - compareNum); i++) {
            // 비교 문자열 compareStr 변수 선언 & 초기화
            String compareStr = "";
            // i부터 i에 str2 길이를 더한 수 만큼 반복
            for (int j = i; j < (i + compareNum); j++) {
                // 비교문자열에 str문자열의 j번째 글자 추가
                compareStr += str1.charAt(j);
            }
            // 문자열 비교(.equals) 사용
            if (str2.equals(compareStr)) {
                answer = 1;
                break; // 조건 만족 시 조건문 탈출
            }
        }
        return answer;
    }
}