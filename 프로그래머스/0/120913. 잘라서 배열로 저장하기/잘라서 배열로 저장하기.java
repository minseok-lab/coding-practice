class Solution {
    public String[] solution(String my_str, int n) {
        // 배열 길이 계산
        // (문자열 길이 + n - 1) / n은 올림 계산과 같은 효과가 존재
        int arraySize = (my_str.length() + n - 1) / n;
        String[] answer = new String[arraySize];
        
        // i는 배열의 길이만큼 반복 실행
        for (int i = 0; i < arraySize; i++) {
            // 시작 위치 계산
            int start = i * n;
            
            // 끝 위치 계산
            int end = start + n;
            
            // 마지막 배열이 문자열 길이를 넘기지 않도록 처리
            if (end > my_str.length()) {
                end = my_str.length();
            }
            
            // 정답 배열 i번째 단어는 my_str의 start부터 end 까지의 문자열
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
        
        /*
        // 배열 길이 정수 선언
        int strLength = 0;
            // 만약 배열 길이가 n으로 나누어 떨어질 경우에는
            if (my_str.length() % n == 0) {
                // 배열의 길이는 전체 문자열을 n으로 나눈 값
                strLength = my_str.length() / n;
            } else { // 그 이외에는 전체 문자열을 n으로 나눈 값 + 나머지 문자를 위한 값 추가
                strLength = (my_str.length() / n) + 1;
            }
        
        // 정답 배열의 길이는 위에서 구한 strLength 크기만큼
        String[] answer = new String[strLength];
        // N번째 시작 숫자와 끝 문자 정의
        int startNum = 0;
        int endNum = 0;
        
        // i는 0부터 배열의 길이만큼 늘어나면서 반복
        for (int i = 0; i < strLength; i++) {
            // 만약 끝 수(endNum)이 배열 길이를 넘어갈 경우
            if (endNum > my_str.length()) {
                // i번째 배열(마지막 배열)은 배열 길이만큼
                answer[i] = my_str.substring(startNum, my_str.length());
            } else { // 그 외 일반적인 경우에는
                // i번째 배열은 시작번호부터 시작넘버 + n번까지
                answer[i] = my_str.substring(startNum, startNum + n);
                // 시작 번호에 n 추가하여 초기화
                startNum += n;
                // 끝번호를 시작넘버에 n 추가하여 초기화
                endNum = startNum + n;
            }
        }
        return answer;
        */
    }
}