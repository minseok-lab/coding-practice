class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        // 최대값 위치는 기존 배열 길이 - 1;
        int maxNum = num_list.length - 1;
        
        // 정답 배열은 우선 기존 num_list 배열을 가져옵니다.
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        // 만약 숫자 배열의 마지막 값이 그 이전 값보다 클 경우에는
        if (num_list[maxNum] > num_list[maxNum - 1]) {
            // 정답 배열의 마지막 값은 숫자 배열 마지막 값 - 그 이전 값
            answer[maxNum + 1] = num_list[maxNum] - num_list[maxNum - 1];
        }
        // 그 외의 경우(크지 않을 경우)
        else {
            // 정답 배열의 마지막 값은 마지막 값의 두배
            answer[maxNum + 1] = num_list[maxNum] * 2;
        }
        return answer;
    }
}