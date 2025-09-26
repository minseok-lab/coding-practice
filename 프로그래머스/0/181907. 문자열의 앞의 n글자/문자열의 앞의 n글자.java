class Solution {
    public String solution(String my_string, int n) {
        // 정답은 my_string을 0부터 n까지 .substring 한 값
        String answer = my_string.substring(0, n);
        return answer;
    }
}