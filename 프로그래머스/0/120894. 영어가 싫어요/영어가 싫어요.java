class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        // 영어 단어 데이터 배열
        String[] numWords = {"zero", "one", "two", "three", "four", 
                             "five", "six", "seven", "eight", "nine"};

        // for문으로 0부터 9까지 반복
        for (int i = 0; i < numWords.length; i++) {
            // i번째 영어 단어(numWords[i])를 i라는 숫자의 문자열(String.valueOf(i))로 교체
            numbers = numbers.replaceAll(numWords[i], String.valueOf(i));
        }
        
        // 문자열을 long 값으로 변경
        answer = Long.parseLong(numbers, 10);
        
        return answer;
    }
}