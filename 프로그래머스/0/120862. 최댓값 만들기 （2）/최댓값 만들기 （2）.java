import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 배열 최대길이
        int maxLength = numbers.length - 1;
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        // 가장 작은 수 2개와 가장 큰 수 2개의 곱을 각각 비교
        if ((numbers[0] * numbers[1]) > (numbers[maxLength] * numbers[maxLength - 1])) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[maxLength] * numbers[maxLength - 1];
        }
        
        return answer;
    }
}