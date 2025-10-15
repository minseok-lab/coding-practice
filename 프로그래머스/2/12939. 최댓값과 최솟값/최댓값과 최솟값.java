class Solution {
    public String solution(String s) {
        String answer = "";
        // 최댓값과 최소값을 담을 int 정수 최댓값과 최소값 선언
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        // s 문자열을 공백으로 분리하여 sArray 문자 배열로 선언
        String[] sArray = s.split(" ");
        int[] sArrayNum = new int[sArray.length];
        // 분리한 sArray 배열의 각 문자값을 정수 값으로 변환하여 sArrayNum에 삽입
        for (int i = 0; i < sArray.length; i++) {
            sArrayNum[i] = Integer.valueOf(sArray[i]);
        }
        // sArrayNum을 순회하며 최댓값과 최솟값 탐색
        for (int i = 0; i < sArrayNum.length; i++) {
            if (sArrayNum[i] > maxNum) {
                maxNum = sArrayNum[i];
            }
            if (sArrayNum[i] < minNum) {
                minNum = sArrayNum[i];
            }
        }
        // answer 문자열에 공백을 추가하여 자동 형변환
        answer = minNum + " " + maxNum;
        return answer;
    }
}