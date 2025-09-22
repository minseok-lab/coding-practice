class Solution {
    public int solution(int[] numbers, int k) {
        // 공을 총 몇 번 건네받았는지 계산 (k-1)
        // 한 번에 2칸씩 이동하므로 총 이동 거리는 (k-1) * 2
        // 배열 길이를 넘지 않도록 나머지(%) 연산
        int throwerIndex = ((k - 1) * 2) % numbers.length;
        
        // 계산된 숫서에 해당하는 번호
        int answer = numbers[throwerIndex];
        
        return answer;
    }
}