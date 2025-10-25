class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            String currentWord = goal[i];
            if (index1 < cards1.length && cards1[index1].equals(currentWord)) {
                index1++;
            } else if (index2 < cards2.length && cards2[index2].equals(currentWord)) {
                index2++;
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}