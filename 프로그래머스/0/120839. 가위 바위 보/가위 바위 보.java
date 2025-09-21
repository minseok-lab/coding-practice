class Solution {
    public String solution(String rsp) {
        // rsp의 문자를 담을 char Array를 선언합니다.
        char[] rspCharArray = new char[rsp.length()];
        
        // i는 0부터 rsp 문자열 길이만큼 i를 하나씩 늘어나며 반복합니다.
        for (int i = 0; i < rsp.length(); i++) {
            // rsp문자열의 i번째 단어는 rspChar로 선언
            char rspChar = rsp.charAt(i);
            
            // 만약 rspChar가 2이면 i번째 rspCharArray를 0 삽입
            if (rspChar == '2') {
                rspCharArray[i] = '0';
            }
            // 0이면 5 삽입
            else if (rspChar == '0') {
                rspCharArray[i] = '5';
            }
            // 그 외(5이면) 2삽입
            else {
                rspCharArray[i] = '2';
            }
        }
        
        // 정답 문자열은 rspCharArray로 이루어진 문자열
        String answer = new String(rspCharArray);
        return answer;
    }
}