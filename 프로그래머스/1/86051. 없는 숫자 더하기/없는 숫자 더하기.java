class Solution {
    public int solution(int[] numbers) {
        // 총합, numbers 합계 변수 선언
        int sumNum = 0;
        int numbersSum = 0;
        
        // 총합 계산
        for (int i = 0; i <= 9; i++) {
            sumNum += i;
        }
        // numbers 합계 계산
        for (int i = 0; i < numbers.length; i++) {
            numbersSum += numbers[i];
        }
        
        // 정답은 (총합 - numbers)
        int answer = sumNum - numbersSum;
        return answer;
    }
}