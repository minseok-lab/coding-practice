// Arrays 클래스를 사용하기 위해 import
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // numbers 배열을 오름차순으로 정렬
        int length = numbers.length; // 배열의 길이 확인
        int max1 = numbers[length - 1]; // 가장 큰 값
        int max2 = numbers[length - 2]; // 두 번째로 큰 값
        return answer = max1 * max2;
    }
}