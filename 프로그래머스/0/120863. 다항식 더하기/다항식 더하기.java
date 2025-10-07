class Solution {
    public String solution(String polynomial) {
        // 필요한 변수 선언
        String answer = "";
        int xSum = 0;
        int intSum = 0;
        // 공백으로 문자열 분리
        String[] splitStr = polynomial.split(" ");
        // 분리된 문자열의 홀수 갯수 순환하며 검토
        for (int i = 0; i < splitStr.length; i += 2) {
            // x가 포함되었을 경우
            if (splitStr[i].contains("x")) {
                // (1)x일 경우
                if (splitStr[i].equals("x")) {
                    xSum += 1;
                } else { // 2x 이상일 경우
                    xSum += Integer.valueOf(splitStr[i].replace("x", ""));
                }
            } else { // x가 포함되지 않았을 경우
                intSum += Integer.valueOf(splitStr[i]);
            }
        }
        // x가 없을 경우
        if (xSum == 0) {
            answer = String.valueOf(intSum);
        } else if (xSum == 1) { // x가 1일 경우
            if (intSum == 0) { // 정수가 없을 경우
                answer = "x";
            } else {
                answer = "x + " + intSum;
            } // x가 2 이상일 경우
        } else {
            if (intSum == 0) {
                answer = xSum + "x";
            } else {
                answer = xSum + "x + " + intSum;
            }
        }
        return answer;
    }
}