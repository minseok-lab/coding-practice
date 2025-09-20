class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // 원본 문자열을 모두 출력하기 위해, 부족한 길이를 측정합니다.
        // 앞쪽 값(s)과 덮어씌우는 문자 길이의 합을 구합니다. 
        int strLength = s + overwrite_string.length();
        // 앞쪽 문자열의 길이는 0부터 s까지입니다.
        String frontSplitStr = my_string.substring(0, s);
        // 뒤쪽 남은 문자열은 부족한 위치부터 출력합니다.
        String lastSplitStr =  my_string.substring(strLength);
        
        // 정답은 앞쪽 문자열 + 덮어씌울 문자열 + 뒤쪽 남은 문자열을 합칩니다.
        String answer = frontSplitStr + overwrite_string + lastSplitStr;
        
        return answer;
    }
}