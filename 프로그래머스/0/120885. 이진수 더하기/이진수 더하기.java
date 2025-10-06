class Solution {
    public String solution(String bin1, String bin2) {
        // 문자열 bin1과 bin2 2진수 값을 10진수로 변환하여 덧셈
        int intBin1 = Integer.parseInt(bin1, 2);
        int intBin2 = Integer.parseInt(bin2, 2);
        int intAnswer = intBin1 + intBin2;
        
        // 10진수 정수를 2진수 문자열로 변환
        String answer = Integer.toString(intAnswer, 2);
        return answer;
    }
}