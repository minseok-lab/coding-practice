class Solution {
    public int solution(String my_string) {
        // my_string을 공백으로 분리한 splitStr 배열로 변환
        String[] splitStr = my_string.split(" ");
        
        // 정답에 정수값으로 변환한 splitStr의 첫번째 값 삽입
        int answer = Integer.valueOf(splitStr[0]);
        // splitStr의 두번째 배열부터 순회하면서 2번씩 늘어나며 반복
        for (int i = 1; i < splitStr.length; i += 2) {
            // +일 경우와 그 외의 경우 각각 더하거나 뺌
            if (splitStr[i].equals("+")) {
                answer += Integer.valueOf(splitStr[i + 1]);
            } else {
                answer -= Integer.valueOf(splitStr[i + 1]);
            }
        }
        return answer;
    }
}