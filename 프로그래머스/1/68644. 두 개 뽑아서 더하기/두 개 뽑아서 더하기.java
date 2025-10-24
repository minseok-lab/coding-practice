import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        // 가변 배열 ArrayList 선언
        ArrayList<Integer> mult = new ArrayList<>();
        // 배열을 순회하며 모든 경우의 수 확인
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 만약 배열에 이미 값이 존재하고 있지 않다면 값 추가
                if (!mult.contains(numbers[i] + numbers[j])) {
                    mult.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        // 정답 배열은 mult의 크기와 동일한 크기를 가진 배열
        int[] answer = new int[mult.size()];
        // 반복문으로 mult의 값을 하나씩 가져오기
        for (int i = 0; i < mult.size(); i++) {
            answer[i] = mult.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}