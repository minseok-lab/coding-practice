import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // 1. spell 배열을 정렬된 char 배열로 미리 만들어 둔다.
        Arrays.sort(spell);
        
        // 2. dic 배열의 단어들을 하나씩 순회한다.
        for (String word : dic) {
            // 3. 현재 dic 단어도 정렬된 char 배열로 만든다.
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);
            
            boolean isMatch = true;
            // 4. spell과 dic 단어의 길이가 다르면 비교할 필요도 없다.
            if (spell.length != sortedWord.length()) {
                isMatch = false;
            } else {
                // 5. 정렬된 spell의 각 글자가 정렬된 dic 단어에 포함되는지 확인
                for (String s : spell) {
                    if (!sortedWord.contains(s)) {
                        isMatch = false;
                        break;
                    }
                }
            }
            
            // 6. 모든 글자가 포함되면 정답이므로 1을 반환
            if (isMatch) {
                return 1;
            }
        }
        
        // 반복문이 끝날 때까지 맞는 단어를 못 찾았으면 2를 반환
        return 2;
    }
}