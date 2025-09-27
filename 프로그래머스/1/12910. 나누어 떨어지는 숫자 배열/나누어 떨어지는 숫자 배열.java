// 1. ArrayList, Arrays 유틸 가져오기
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // arr 배열의 값의 순서를 오름차순으로 바꿈
        Arrays.sort(arr);
        
        // 2. 정수(Integer)를 담을 수 있는 비어있는 ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();

        // arr 배열의 모든 숫자를 처음부터 끝까지 확인
        for (int number : arr) {
            // 만약 현재 숫자가 divisor로 나누어 떨어진다면
            if (number % divisor == 0) {
                // list에 해당 숫자를 추가
                list.add(number);
            }
        }
        
        // 만약 list의 크기(size)가 0이라면 (하나도 못 담았다면)
        if (list.size() == 0) {
            // -1만 들어있는 새로운 배열을 만들어서 반환
            return new int[]{-1};
        }
        
        // list와 똑같은 크기의 int[] 배열을 생성
        int[] answer = new int[list.size()];

        // list의 모든 요소를 answer 배열로 복사
        for (int i = 0; i < list.size(); i++) {
            // list의 i번째 요소를 answer의 i번째 칸에 저장
            answer[i] = list.get(i);
        }

        // 4. 완성된 배열 반환
        return answer;
    }
}