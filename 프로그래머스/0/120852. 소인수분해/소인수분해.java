import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // ArrayList로 동적 배열 생성
        ArrayList<Integer> primeFactor = new ArrayList<>();
        // 2부터 n까지 순회
        for (int i = 2; i <= n; i++) {
            // n 나누기 i가 0일이면 반복 진행
            while (n % i == 0) {
                // 배열에 i가 없을 경우, i추가
                if (!primeFactor.contains(i)) {
                    primeFactor.add(i);
                }
                // n = n / i
                n /= i;
            }
        }
        
        // 정답 배열에 primeFactor 값 삽입
        int[] answer = new int[primeFactor.size()];
        for (int i = 0; i < primeFactor.size(); i++) {
            answer[i] = primeFactor.get(i);
        }
        
        return answer;
    }
}