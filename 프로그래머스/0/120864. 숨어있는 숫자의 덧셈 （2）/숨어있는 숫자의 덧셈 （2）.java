class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 알파벳을 replaceAll 사용하여 공백으로 변환
        String voidString = my_string.replaceAll("[a-zA-Z]", " ");
        // 공백을 기준으로 문자열을 문자 배열로 분리
        String[] numArray = voidString.split(" ");
        
        // 분리된 문자 배열을 순회하며 반복
        for (int i = 0; i < numArray.length; i++) {
            // 빈 배열이 아닐 경우
            if (!numArray[i].equals("")) {
                // numArray[i]를 정수값으로 변환하여 정답에 추가
                int num = Integer.valueOf(numArray[i]);
                answer += num;
            }
        }
        return answer;
    }
}