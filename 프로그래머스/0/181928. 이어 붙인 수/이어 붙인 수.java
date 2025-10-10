class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 홀수, 짝수값을 저장할 String 객체 생성
        String oddNum = "";
        String evenNum = "";
        
        // num_list를 순회
        for (int i = 0; i < num_list.length; i++) {
            // 홀수면 홀수 문자열에 추가
            if (num_list[i] % 2 == 1) {
                oddNum += String.valueOf(num_list[i]);
            } else {
                // 그 외(짝수)면 짝수 문자열에 추가
                evenNum += String.valueOf(num_list[i]);
            }
        }
        
        // 문자열을 숫자로 변환하여 덧셈
        answer = Integer.valueOf(oddNum) + Integer.valueOf(evenNum);
        return answer;
    }
}