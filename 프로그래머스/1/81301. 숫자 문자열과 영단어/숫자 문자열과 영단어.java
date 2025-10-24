class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 영어 숫자 단어 배열
        String[] numWords = {"zero", "one", "two", "three", "four", 
                             "five", "six", "seven", "eight", "nine"};

        // 숫자 문자열 배열
        String[] digits = {"0", "1", "2", "3", "4", 
                           "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(numWords[i], digits[i]);
        }
        
        answer = Integer.valueOf(s);
        return answer;
    }
}