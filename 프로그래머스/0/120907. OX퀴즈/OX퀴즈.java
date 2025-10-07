class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        // quiz 배열을 순회
        for (int i = 0; i < quiz.length; i++) {
            // quiz i번째 문자열을 공백을 분리
            String[] splitStr = quiz[i].split(" ");
            // 연산자(2번째)가 덧셈일 경우
            if (splitStr[1].equals("+")) {
                // 분리된 문자열 0번과 2번의 정수값의 합
                int calc = Integer.valueOf(splitStr[0]) + Integer.valueOf(splitStr[2]);
                // 결과값이 4값과 다를 경우
                if (calc != Integer.valueOf(splitStr[4])) {
                    answer[i] = "X";
                } else {
                    answer[i] = "O";
                }
            } else { // 연산자(2번째)가 뺄셈일 경우
                // 분리된 문자열 0번과 2번의 정수값의 차
                int calc = Integer.valueOf(splitStr[0]) - Integer.valueOf(splitStr[2]);
                // 결과값이 4값과 다를 경우
                if (calc != Integer.valueOf(splitStr[4])) {
                    answer[i] = "X";
                } else {
                    answer[i] = "O";
                }
            }
            
        }
        return answer;
    }
}