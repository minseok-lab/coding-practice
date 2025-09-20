class Solution {
    public String solution(String my_string, int n) {
        // 뒤의 n개를 확인하기 위해 전체 문자열의 길이에서 n을 뺍니다.
        int count = my_string.length() - n;
        // count 번째 자리에서 substring을 통해 나눠서 표시합니다.
        String splitString = my_string.substring(count);
        
        return splitString;
    }
}