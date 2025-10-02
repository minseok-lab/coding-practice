class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        // num2가 num1 뒤에 있다면
        if (num1 < num2) {
            // 시작 문자열은 0부터 num1까지
            String startStr = my_string.substring(0, num1);
            // 중간 문자열은 num1 다음부터 num2까지
            String middleStr = my_string.substring(num1 + 1, num2);
            // 끝 문자열은 num2 다음부터 끝까지
            String endStr = my_string.substring(num2 + 1);
            // 정답은 시작 문자열 + num2 문자 + 중간문자열 + num1 문자 + 끝문자열
            answer = startStr + my_string.charAt(num2) + middleStr +
                my_string.charAt(num1) + endStr;
        } else { // 그 외 num1이 num2 뒤에 있다면
            String startStr = my_string.substring(0, num2);
            String middleStr = my_string.substring(num2 + 1, num1);
            String endStr = my_string.substring(num1 + 1);
            answer = startStr + my_string.charAt(num1) + middleStr +
                my_string.charAt(num2) + endStr;
        }
        return answer;
    }
}