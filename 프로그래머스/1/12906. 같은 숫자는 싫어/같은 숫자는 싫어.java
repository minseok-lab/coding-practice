import java.util.*;

public class Solution {
    public int[] solution(int[]arr) {
        ArrayList<Integer> noneTwiceArr = new ArrayList<>();
        noneTwiceArr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                noneTwiceArr.add(arr[i]);
            }
        }
        int[] answer = new int[noneTwiceArr.size()];
        for (int i = 0; i < noneTwiceArr.size(); i++) {
            answer[i] = noneTwiceArr.get(i);
        }

        return answer;
    }
}