class Solution {
    public int[] solution(int[] arr, int n) {
        // 정답 배열의 길이는 원본 배열의 길이와 동일
        int[] answer = new int[arr.length];
        // 배열 길이가 짝수일 경우
        if (arr.length % 2 == 0) {
            // 배열을 반복하여 홀수번째일 경우 arr[i]에 n 추가, 아니면 그냥 추가
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else { // 그 외 길이가 홀수인 경우 
            // 배열을 반복하여 짝수번째일 경우 arr[i]에 n 추가, 아니면 그냥 추가
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}