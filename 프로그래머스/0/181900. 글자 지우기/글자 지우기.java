import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int index = 0;
        Arrays.sort(indices);
        
        for (int i = 0; i < my_string.length(); i++) {
            boolean shouldRemove = false;
            
            if (index < indices.length && i == indices[index]) {
                shouldRemove = true;
                index++;
            } 
            
            if (!shouldRemove) {
                answer += my_string.charAt(i) + "";
            }
        }
        return answer;
    }
}