class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        // t문자열 길이에서 p문자열 길이를 뺀 값만큼 반복
        for (int i = 0; i <= (t.length() - p.length()); i++) {
            
            // t문자열을 i부터 i에 p문자열 길이를 더한 만큼의 길이로 나눔
            String subStr = t.substring(i, (i + p.length()));
            
            // 나눈 문자열과 p를 정수 값으로 변경
            // int 가 아닌 long을 사용하는 이유 : p의 길이가 18자리 수까지 가능함
            long subNum = Long.parseLong(subStr);
            long pNum = Long.parseLong(p);
            
            // p의 정수값이 분리한 정수값보다 크거나 같을 경우
            if (pNum >= subNum) {
                // 정답 1증가.
                answer++;
            }
        }
        
        return answer;
    }
}