import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> index = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
            index.add(i);
        }
        
        if (index.isEmpty()) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int minIndex = index.get(0);
        int maxIndex = index.get(index.size() - 1);
        
        int[] answer = new int[maxIndex - minIndex + 1];
        answer = Arrays.copyOfRange(arr, minIndex, maxIndex + 1);
        return answer;
    }
}