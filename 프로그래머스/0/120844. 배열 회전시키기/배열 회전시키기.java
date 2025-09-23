class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length]; // 기존 배열 길이만큼의 새로운 정답 배열 선언
        if (direction.equals("right")) { // 만약 방향이 right 문자열과 같다면
            for (int i = 0; i < numbers.length; i++) { // 정수 i는 배열 크기만큼 반복 실행
                if(i == 0) { // 첫번째는
                    answer[i] = numbers[(numbers.length - 1)]; // 배열 최대 길이의 -1 (마지막)
                } else { // 그 외는
                    answer[i] = numbers[i - 1]; // i는 1인 수는 numbers 0번째 수
                }
            }
        } else { // 그 외(left) 이면
            for (int i = 0; i < numbers.length; i++) {
                if(i == (numbers.length - 1)) { // 배열의 마지막 수는
                    answer[i] = numbers[0]; // 정답 배열의 마지막 수는 numbers 배열의 첫번째 수
                } else {
                    answer[i] = numbers[i + 1]; // i는 0인 수는 numbers의 1번째 수
                }
            }
        }
        return answer;
    }
}